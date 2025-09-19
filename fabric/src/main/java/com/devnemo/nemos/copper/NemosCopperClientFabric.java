package com.devnemo.nemos.copper;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.client.renderer.entity.CopperMinecartRenderer;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.MinecartRenderer;

public class NemosCopperClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntityTypes.COPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_CHEST_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.CHEST_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.COMMAND_BLOCK_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_FURNACE_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.FURNACE_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.HOPPER_COPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.HOPPER_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_HOPPER_COPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.HOPPER_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_HOPPER_MINECART.get(), context -> new MinecartRenderer(context, ModelLayers.HOPPER_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.SPAWNER_MINECART));
        EntityRendererRegistry.register(ModEntityTypes.COPPER_TNT_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.TNT_MINECART));

        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_LANTERN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_SOUL_LANTERN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_CHAIN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_BARS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_RAIL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_ACTIVATOR_RAIL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_POWERED_RAIL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CopperBlocks.COPPER_DETECTOR_RAIL.get(), ChunkSectionLayer.CUTOUT);
    }
}
