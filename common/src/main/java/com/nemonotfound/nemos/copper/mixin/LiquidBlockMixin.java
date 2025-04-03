package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemGetter;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LiquidBlock.class)
public class LiquidBlockMixin {

    @Shadow @Final @Deprecated
    protected FlowingFluid fluid;

    @ModifyReturnValue(method = "pickupBlock", at = @At(value = "RETURN", ordinal = 0))
    private ItemStack pickupBlock(ItemStack original, @Local(argsOnly = true) LivingEntity entity) {
        var mainHandItem = entity.getMainHandItem();
        var offHandItem = entity.getOffhandItem();

        if (mainHandItem.is(ModItems.COPPER_BUCKET.get()) || offHandItem.is(ModItems.COPPER_BUCKET.get())) {
            return new ItemStack(((CopperBucketItemGetter) fluid).nemosCopper$getCopperBucket());
        }

        return original;
    }
}
