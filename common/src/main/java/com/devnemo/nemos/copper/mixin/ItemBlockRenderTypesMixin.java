package com.devnemo.nemos.copper.mixin;

import com.devnemo.nemos.copper.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(ItemBlockRenderTypes.class)
public class ItemBlockRenderTypesMixin {

    @Shadow
    @Final
    private static Map<Block, RenderType> TYPE_BY_BLOCK;

    @Inject(method = "<clinit>*", at = @At("RETURN"))
    private static void onInitialize(CallbackInfo info) {
        TYPE_BY_BLOCK.put(ModBlocks.COPPER_RAIL.get(), RenderType.cutout());
        TYPE_BY_BLOCK.put(ModBlocks.COPPER_DETECTOR_RAIL.get(), RenderType.cutout());
        TYPE_BY_BLOCK.put(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), RenderType.cutout());
        TYPE_BY_BLOCK.put(ModBlocks.COPPER_POWERED_RAIL.get(), RenderType.cutout());
    }
}
