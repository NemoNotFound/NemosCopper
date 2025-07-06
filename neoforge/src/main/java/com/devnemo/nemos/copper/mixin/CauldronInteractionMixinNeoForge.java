package com.devnemo.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.tag.ModBlockTags;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CauldronInteraction.class)
public interface CauldronInteractionMixinNeoForge {

    @ModifyExpressionValue(method = "lambda$bootStrap$1", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;"))
    private static BlockState bootstrap(BlockState original, @Local(argsOnly = true) BlockState blockState) {
        if (blockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState();
        }

        return original;
    }
}
