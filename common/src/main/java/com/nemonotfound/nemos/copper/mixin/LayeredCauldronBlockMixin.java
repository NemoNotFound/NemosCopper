package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LayeredCauldronBlock.class)
public class LayeredCauldronBlockMixin {

    @Shadow @Final public static IntegerProperty LEVEL;

    @ModifyArg(method = "handleEntityOnFireInside", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/LayeredCauldronBlock;lowerFillLevel(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V"))
    private BlockState handleEntityOnFireInside(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState().setValue(LEVEL, blockState.getValue(LEVEL));
        }

        return original;
    }

    @ModifyExpressionValue(method = "lowerFillLevel", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState getCorrectBlockState(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_CAULDRON.get().defaultBlockState();
        }

        return original;
    }
}
