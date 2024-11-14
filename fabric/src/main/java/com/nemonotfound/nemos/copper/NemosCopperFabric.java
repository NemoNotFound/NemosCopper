package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_RAIL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_DETECTOR_RAIL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_POWERED_RAIL.get(), RenderType.cutout());
    }
}
