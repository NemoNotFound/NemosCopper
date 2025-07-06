package com.devnemo.nemos.copper.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.devnemo.nemos.copper.block.ModBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.BiomeColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockColors.class)
public class BlockColorsMixin {

    @Inject(method = "createDefault", at = @At(value = "TAIL"))
    private static void createDefault(CallbackInfoReturnable<BlockColors> cir, @Local BlockColors blockColors) {
        blockColors.register(
                (blockState, blockAndTintGetter, blockPos, i) ->
                        blockAndTintGetter != null &&
                                blockPos != null ?
                                BiomeColors.getAverageWaterColor(blockAndTintGetter, blockPos) : -1,
                ModBlocks.COPPER_WATER_CAULDRON.get()
        );
    }
}
