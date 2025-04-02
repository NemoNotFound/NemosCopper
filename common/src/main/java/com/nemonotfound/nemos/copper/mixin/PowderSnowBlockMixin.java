package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.item.Items;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.PowderSnowBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin {

    @ModifyReturnValue(method = "pickupBlock", at = @At("RETURN"))
    private ItemStack pickupBlock(ItemStack original, @Local(argsOnly = true) LivingEntity entity) {
        var mainHandItem = entity.getMainHandItem();
        var offHandItem = entity.getOffhandItem();

        if (mainHandItem.is(Items.COPPER_BUCKET.get()) || offHandItem.is(Items.COPPER_BUCKET.get())) {
            return new ItemStack(Items.COPPER_POWDER_SNOW_BUCKET.get());
        }

        return original;
    }
}
