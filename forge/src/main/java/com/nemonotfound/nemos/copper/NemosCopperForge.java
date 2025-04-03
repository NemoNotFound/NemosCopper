package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.client.renderer.entity.CopperMinecartRenderer;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

@Mod(MOD_ID)
public class NemosCopperForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public NemosCopperForge(FMLJavaModLoadingContext context) {
        final IEventBus modEventBus = context.getModEventBus();
        NemosCopperCommon.init();

        BLOCKS.register(modEventBus);
        ENTITIES.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_TABS.register(modEventBus);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerDispenseBehavior(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> DispenserBlock.registerBehavior(ModItems.COPPER_SHEARS.get().asItem(), new ShearsDispenseItemBehavior()));
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

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
}