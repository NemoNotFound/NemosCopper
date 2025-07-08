package com.devnemo.nemos.copper;

import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.client.renderer.entity.CopperMinecartRenderer;
import com.devnemo.nemos.copper.core.dispenser.ModDispenseItemBehavior;
import com.devnemo.nemos.copper.helper.CauldronInteractionHelper;
import com.devnemo.nemos.copper.helper.ItemReplacementHelper;
import com.devnemo.nemos.copper.item.ModItems;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.listener.Priority;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import static com.devnemo.nemos.copper.Constants.MOD_ID;

@Mod(MOD_ID)
public class NemosCopperForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public NemosCopperForge(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        NemosCopperCommon.init();

        BLOCKS.register(modBusGroup);
        ENTITIES.register(modBusGroup);
        ITEMS.register(modBusGroup);
        CREATIVE_TABS.register(modBusGroup);
    }

    @SubscribeEvent(priority = Priority.LOWEST)
    public static void registerDispenseBehavior(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModDispenseItemBehavior::bootstrap);
        event.enqueueWork(CauldronInteractionHelper::addCopperBucketInteractions);
        event.enqueueWork(ItemReplacementHelper::addToItemReplacementMaps);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_POWERED_RAIL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_DETECTOR_RAIL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_RAIL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_LANTERN.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_SOUL_LANTERN.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_CHAIN.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_BARS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_HOPPER.get(), ChunkSectionLayer.CUTOUT_MIPPED);

            EntityRenderers.register(ModEntityTypes.COPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.MINECART));
            EntityRenderers.register(ModEntityTypes.COPPER_CHEST_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.CHEST_MINECART));
            EntityRenderers.register(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.COMMAND_BLOCK_MINECART));
            EntityRenderers.register(ModEntityTypes.COPPER_FURNACE_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.FURNACE_MINECART));
            EntityRenderers.register(ModEntityTypes.COPPER_HOPPER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.HOPPER_MINECART));
            EntityRenderers.register(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.SPAWNER_MINECART));
            EntityRenderers.register(ModEntityTypes.COPPER_TNT_MINECART.get(), context -> new CopperMinecartRenderer(context, ModelLayers.TNT_MINECART));
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEvents {

        @SubscribeEvent
        public static void addCustomFuels(FurnaceFuelBurnTimeEvent event) {
            var itemStack = event.getItemStack();

            if (itemStack.is(ModItems.COPPER_LAVA_BUCKET.get())) {
                event.setBurnTime(20000);
            }
        }
    }
}