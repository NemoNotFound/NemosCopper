package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.block.CopperCauldronBlock;
import com.nemonotfound.nemos.copper.block.LayeredCopperCauldronBlock;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import static net.minecraft.core.cauldron.CauldronInteraction.emptyBucket;

@Mixin(CauldronInteraction.class)
public interface CauldronInteractionMixin {

    @ModifyReturnValue(method = "fillWaterInteraction", at = @At("RETURN"))
    private static InteractionResult fillWaterInteraction(InteractionResult original, @Local(argsOnly = true) BlockState blockState, @Local(argsOnly = true) Level level, @Local(argsOnly = true) BlockPos pos, @Local(argsOnly = true) Player player, @Local(argsOnly = true) InteractionHand hand, @Local(argsOnly = true) ItemStack filledStack) {
        if (blockState.getBlock() instanceof CopperCauldronBlock) {
            return emptyBucket(
                    level,
                    pos,
                    player,
                    hand,
                    filledStack,
                    ModBlocks.COPPER_WATER_CAULDRON.get()
                            .defaultBlockState()
                            .setValue(LayeredCopperCauldronBlock.LEVEL, 3),
                    SoundEvents.BUCKET_EMPTY
            );
        }

        return original;
    }

    @ModifyReturnValue(method = "fillLavaInteraction", at = @At("RETURN"))
    private static InteractionResult fillLavaInteraction(InteractionResult original, @Local(argsOnly = true) BlockState blockState, @Local(argsOnly = true) Level level, @Local(argsOnly = true) BlockPos pos, @Local(argsOnly = true) Player player, @Local(argsOnly = true) InteractionHand hand, @Local(argsOnly = true) ItemStack filledStack) {
        if (blockState.getBlock() instanceof CopperCauldronBlock) {
            return nemosCopper$isUnderWater(level, pos)
                    ? InteractionResult.CONSUME
                    : emptyBucket(
                    level,
                    pos,
                    player,
                    hand,
                    filledStack,
                    ModBlocks.COPPER_LAVA_CAULDRON.get()
                            .defaultBlockState(),
                    SoundEvents.BUCKET_EMPTY_LAVA
            );
        }

        return original;
    }

    @ModifyReturnValue(method = "fillPowderSnowInteraction", at = @At("RETURN"))
    private static InteractionResult fillPowderSnowInteraction(InteractionResult original, @Local(argsOnly = true) BlockState blockState, @Local(argsOnly = true) Level level, @Local(argsOnly = true) BlockPos pos, @Local(argsOnly = true) Player player, @Local(argsOnly = true) InteractionHand hand, @Local(argsOnly = true) ItemStack filledStack) {
        if (blockState.getBlock() instanceof CopperCauldronBlock) {
            return nemosCopper$isUnderWater(level, pos)
                    ? InteractionResult.CONSUME
                    : emptyBucket(
                    level,
                    pos,
                    player,
                    hand,
                    filledStack,
                    ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get()
                            .defaultBlockState()
                            .setValue(LayeredCauldronBlock.LEVEL, 3),
                    SoundEvents.BUCKET_EMPTY_POWDER_SNOW
            );
        }

        return original;
    }

    //TODO: Inject into emptyBucket()

    //TODO: fillBucket

    //TODO: Check other interactions

    //TODO: Check all maps

    //TODO: Add copper bucket to map

    @Unique
    private static boolean nemosCopper$isUnderWater(Level level, BlockPos pos) {
        FluidState fluidstate = level.getFluidState(pos.above());
        return fluidstate.is(FluidTags.WATER);
    }
}
