package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

import static net.minecraft.core.cauldron.CauldronInteraction.emptyBucket;

@Mixin(CauldronInteraction.class)
public interface CauldronInteractionMixin {

    @ModifyExpressionValue(method = "fillWaterInteraction", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillWaterInteraction(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState();
        }

        return original;
    }

    @ModifyExpressionValue(method = "fillLavaInteraction", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillLavaInteraction(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_LAVA_CAULDRON.get().defaultBlockState();
        }

        return original;
    }

    @ModifyExpressionValue(method = "fillPowderSnowInteraction", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillPowderSnowInteraction(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get().defaultBlockState();
        }

        return original;
    }

    @ModifyArg(method = "emptyBucket", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;<init>(Lnet/minecraft/world/level/ItemLike;)V"))
    private static ItemLike emptyCopperBucket(ItemLike original, @Local(argsOnly = true) Player player, @Local(argsOnly = true) InteractionHand hand) {
        var bucketItem = player.getItemInHand(hand);

        if (bucketItem.is(ModItemTags.COPPER_BUCKETS)) {
            return ModItems.COPPER_BUCKET.get();
        }

        return original;
    }

//    @ModifyExpressionValue(method = "lambda$bootStrap$1", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
//    private static BlockState bootstrap(BlockState original, @Local(argsOnly = true) BlockState blockState) {
//        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
//            return ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState();
//        }
//
//        return original;
//    }

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

    @ModifyExpressionValue(method = "fillBucket", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState fillBucket(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_CAULDRON.get().defaultBlockState();
        }

        return original;
    }

    //TODO: Check other interactions

    //TODO: Check all maps

    @Unique
    private static boolean nemosCopper$isUnderWater(Level level, BlockPos pos) {
        FluidState fluidstate = level.getFluidState(pos.above());
        return fluidstate.is(FluidTags.WATER);
    }

    @Unique
    private static void nemosCopper$addDefaultInteractions(Map<Item, CauldronInteraction> interactionsMap) {
        interactionsMap.put(ModItems.COPPER_LAVA_BUCKET.get(), CauldronInteractionMixin::nemosCopper$fillLavaInteraction);
        interactionsMap.put(ModItems.COPPER_WATER_BUCKET.get(), CauldronInteractionMixin::nemosCopper$fillWaterInteraction);
        interactionsMap.put(ModItems.COPPER_POWDER_SNOW_BUCKET.get(), CauldronInteractionMixin::nemosCopper$fillPowderSnowInteraction);
    }

    @Unique
    private static InteractionResult nemosCopper$fillWaterInteraction(
            BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack filledStack
    ) {
        return emptyBucket(
                level,
                pos,
                player,
                hand,
                filledStack,
                nemosCopper$retrieveCorrectState(state, ModBlocks.COPPER_WATER_CAULDRON.get(), Blocks.WATER_CAULDRON).setValue(LayeredCauldronBlock.LEVEL, 3),
                SoundEvents.BUCKET_EMPTY
        );
    }

    @Unique
    private static InteractionResult nemosCopper$fillLavaInteraction(
            BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack filledStack
    ) {
        return nemosCopper$isUnderWater(level, pos)
                ? InteractionResult.CONSUME
                : emptyBucket(level, pos, player, hand, filledStack, nemosCopper$retrieveCorrectState(state, ModBlocks.COPPER_LAVA_CAULDRON.get(), Blocks.LAVA_CAULDRON), SoundEvents.BUCKET_EMPTY_LAVA);
    }

    @Unique
    private static InteractionResult nemosCopper$fillPowderSnowInteraction(
            BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack filledStack
    ) {
        return nemosCopper$isUnderWater(level, pos)
                ? InteractionResult.CONSUME
                : emptyBucket(
                level,
                pos,
                player,
                hand,
                filledStack,
                nemosCopper$retrieveCorrectState(state, ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get(), Blocks.POWDER_SNOW_CAULDRON).setValue(LayeredCauldronBlock.LEVEL, 3),
                SoundEvents.BUCKET_EMPTY_POWDER_SNOW
        );
    }

    @Unique
    private static @NotNull BlockState nemosCopper$retrieveCorrectState(BlockState state, Block copperCauldron, Block cauldron) {
        if (state.is(ModBlockTags.COPPER_CAULDRONS)) {
            return copperCauldron.defaultBlockState();
        }

        return cauldron.defaultBlockState();
    }
}
