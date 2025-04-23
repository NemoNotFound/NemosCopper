package com.nemonotfound.nemos.copper.events;

import com.nemonotfound.nemos.copper.Constants;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.world.level.block.DispenserBlock;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    private static void registerDispenseBehavior(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> DispenserBlock.registerBehavior(ModItems.COPPER_SHEARS.get().asItem(), new ShearsDispenseItemBehavior()));
    }
}
