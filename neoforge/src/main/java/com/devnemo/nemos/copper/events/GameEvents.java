package com.devnemo.nemos.copper.events;

import com.devnemo.nemos.copper.Constants;
import com.devnemo.nemos.copper.item.CopperItems;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class GameEvents {

    @SubscribeEvent
    private static void addCustomFuels(final FurnaceFuelBurnTimeEvent event) {
        var itemStack = event.getItemStack();

        if (itemStack.is(CopperItems.COPPER_LAVA_BUCKET.get())) {
            event.setBurnTime(20000);
        }
    }
}
