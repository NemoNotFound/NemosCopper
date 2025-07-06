package com.nemonotfound.nemos.copper.events;

import com.nemonotfound.nemos.copper.Constants;
import com.nemonotfound.nemos.copper.core.dispenser.ModDispenseItemBehavior;
import com.nemonotfound.nemos.copper.helper.CauldronInteractionHelper;
import com.nemonotfound.nemos.copper.helper.ItemReplacementHelper;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class ModEvents {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    private static void registerDispenseBehavior(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModDispenseItemBehavior::bootstrap);
        event.enqueueWork(CauldronInteractionHelper::addCopperBucketInteractions);
        event.enqueueWork(ItemReplacementHelper::addToItemReplacementMaps);
    }
}
