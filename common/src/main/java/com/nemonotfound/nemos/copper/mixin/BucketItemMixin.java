package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(BucketItem.class)
public class BucketItemMixin {

    @ModifyReturnValue(method = "getEmptySuccessItem", at = @At("RETURN"))
    private static ItemStack getEmptySuccessItem(ItemStack original, @Local(argsOnly = true) ItemStack bucketStack, @Local(argsOnly = true) Player player) {
        if (!player.hasInfiniteMaterials()) {

            if (bucketStack.is(ModItemTags.COPPER_BUCKETS)) {
                return new ItemStack(ModItems.COPPER_BUCKET.get());
            }
        }

        return original;
    }
}
