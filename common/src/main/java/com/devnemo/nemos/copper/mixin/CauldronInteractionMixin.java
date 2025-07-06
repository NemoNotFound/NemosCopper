package com.devnemo.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.helper.CauldronInteractionHelper;
import com.devnemo.nemos.copper.item.ModItems;
import com.devnemo.nemos.copper.tag.ModItemTags;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(CauldronInteraction.class)
public interface CauldronInteractionMixin {

    @ModifyExpressionValue(method = "fillWaterInteraction", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillWaterInteraction(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        return CauldronInteractionHelper
                .retrieveBlockState(blockState, original, ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState());
    }

    @ModifyExpressionValue(method = "fillLavaInteraction", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillLavaInteraction(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        return CauldronInteractionHelper
                .retrieveBlockState(blockState, original, ModBlocks.COPPER_LAVA_CAULDRON.get().defaultBlockState());
    }

    @ModifyExpressionValue(method = "fillPowderSnowInteraction", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillPowderSnowInteraction(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        return CauldronInteractionHelper
                .retrieveBlockState(blockState, original, ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get().defaultBlockState());
    }

    @ModifyArg(method = "emptyBucket", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;<init>(Lnet/minecraft/world/level/ItemLike;)V"))
    private static ItemLike emptyCopperBucket(ItemLike original, @Local(argsOnly = true) Player player, @Local(argsOnly = true) InteractionHand hand) {
        var bucketItem = player.getItemInHand(hand);

        if (bucketItem.is(ModItemTags.COPPER_BUCKETS)) {
            return ModItems.COPPER_BUCKET.get();
        }

        return original;
    }

    @ModifyExpressionValue(method = "fillBucket", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillBucket(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        return CauldronInteractionHelper
                .retrieveBlockState(blockState, original, ModBlocks.COPPER_CAULDRON.get().defaultBlockState());
    }
}
