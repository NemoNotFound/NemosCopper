package com.nemonotfound.nemos.copper;


import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.client.renderer.entity.CopperMinecartRenderer;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NemosCopperClientNeoForge {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_POWERED_RAIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_DETECTOR_RAIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_RAIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_CHAIN.get(), RenderType.cutout());

        EntityRenderers.register(EntityTypes.COPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.MINECART));
        EntityRenderers.register(EntityTypes.COPPER_CHEST_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.CHEST_MINECART));
        EntityRenderers.register(EntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.COMMAND_BLOCK_MINECART));
        EntityRenderers.register(EntityTypes.COPPER_FURNACE_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.FURNACE_MINECART));
        EntityRenderers.register(EntityTypes.COPPER_HOPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.HOPPER_MINECART));
        EntityRenderers.register(EntityTypes.COPPER_SPAWNER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.SPAWNER_MINECART));
        EntityRenderers.register(EntityTypes.COPPER_TNT_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.TNT_MINECART));
    }
}