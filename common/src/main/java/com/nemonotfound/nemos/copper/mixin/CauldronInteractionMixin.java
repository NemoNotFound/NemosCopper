package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.helper.CauldronInteractionHelper;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(CauldronInteraction.class)
public interface CauldronInteractionMixin {

//    @Shadow
//    private static boolean isUnderWater(Level level, BlockPos pos) {
//        return false;
//    }

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

    //TODO: Add during registration
//    @Inject(method = "bootStrap", at = @At("HEAD"))
//    private static void bootStrap(CallbackInfo ci) {
//        Map<Item, CauldronInteraction> emptyMap = CauldronInteraction.EMPTY.map();
//        nemosCopper$addDefaultInteractions(emptyMap);
//
//        Map<Item, CauldronInteraction> waterMap = CauldronInteraction.WATER.map();
//        waterMap.put(
//                ModItems.COPPER_BUCKET.get(),
//                (blockState, level, blockPos, player, hand, itemStack) -> CauldronInteraction.fillBucket(
//                        blockState,
//                        level,
//                        blockPos,
//                        player,
//                        hand,
//                        itemStack,
//                        new ItemStack(ModItems.COPPER_WATER_BUCKET.get()),
//                        state -> state.getValue(LayeredCauldronBlock.LEVEL) == 3,
//                        SoundEvents.BUCKET_FILL
//                )
//        );
//        nemosCopper$addDefaultInteractions(waterMap);
//
//        Map<Item, CauldronInteraction> lavaMap = CauldronInteraction.LAVA.map();
//        lavaMap.put(
//                ModItems.COPPER_BUCKET.get(),
//                (blockState, level, blockPos, player, hand, itemStack) -> CauldronInteraction.fillBucket(
//                        blockState,
//                        level,
//                        blockPos,
//                        player,
//                        hand,
//                        itemStack,
//                        new ItemStack(ModItems.COPPER_LAVA_BUCKET.get()),
//                        state -> true,
//                        SoundEvents.BUCKET_FILL_LAVA
//                )
//        );
//        nemosCopper$addDefaultInteractions(lavaMap);
//
//        Map<Item, CauldronInteraction> powderSnowMap = CauldronInteraction.POWDER_SNOW.map();
//        powderSnowMap.put(
//                ModItems.COPPER_BUCKET.get(),
//                (blockState, level, blockPos, player, hand, itemStack) -> CauldronInteraction.fillBucket(
//                        blockState,
//                        level,
//                        blockPos,
//                        player,
//                        hand,
//                        itemStack,
//                        new ItemStack(ModItems.COPPER_POWDER_SNOW_BUCKET.get()),
//                        state -> state.getValue(LayeredCauldronBlock.LEVEL) == 3,
//                        SoundEvents.BUCKET_FILL_POWDER_SNOW
//                )
//        );
//
//        nemosCopper$addDefaultInteractions(powderSnowMap);
//    }
//
//    @Unique
//    private static void nemosCopper$addDefaultInteractions(Map<Item, CauldronInteraction> interactionsMap) {
//        interactionsMap.put(ModItems.COPPER_LAVA_BUCKET.get(), CauldronInteractionMixin::nemosCopper$fillLavaInteraction);
//        interactionsMap.put(ModItems.COPPER_WATER_BUCKET.get(), CauldronInteractionMixin::nemosCopper$fillWaterInteraction);
//        interactionsMap.put(ModItems.COPPER_POWDER_SNOW_BUCKET.get(), CauldronInteractionMixin::nemosCopper$fillPowderSnowInteraction);
//    }
//    @Unique
//    private static InteractionResult nemosCopper$fillWaterInteraction(
//            BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack filledStack
//    ) {
//        return emptyBucket(
//                level,
//                pos,
//                player,
//                hand,
//                filledStack,
//                nemosCopper$retrieveCorrectCauldronState(state, ModBlocks.COPPER_WATER_CAULDRON.get(), Blocks.WATER_CAULDRON).setValue(LayeredCauldronBlock.LEVEL, 3),
//                SoundEvents.BUCKET_EMPTY
//        );
//    }
//
//    @Unique
//    private static InteractionResult nemosCopper$fillLavaInteraction(
//            BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack filledStack
//    ) {
//        return isUnderWater(level, pos)
//                ? InteractionResult.CONSUME
//                : emptyBucket(level, pos, player, hand, filledStack, nemosCopper$retrieveCorrectCauldronState(state, ModBlocks.COPPER_LAVA_CAULDRON.get(), Blocks.LAVA_CAULDRON), SoundEvents.BUCKET_EMPTY_LAVA);
//    }
//
//    @Unique
//    private static InteractionResult nemosCopper$fillPowderSnowInteraction(
//            BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack filledStack
//    ) {
//        return isUnderWater(level, pos)
//                ? InteractionResult.CONSUME
//                : emptyBucket(
//                level,
//                pos,
//                player,
//                hand,
//                filledStack,
//                nemosCopper$retrieveCorrectCauldronState(state, ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get(), Blocks.POWDER_SNOW_CAULDRON).setValue(LayeredCauldronBlock.LEVEL, 3),
//                SoundEvents.BUCKET_EMPTY_POWDER_SNOW
//        );
//    }
//
}
