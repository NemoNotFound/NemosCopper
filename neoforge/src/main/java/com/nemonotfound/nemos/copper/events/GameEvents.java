package com.nemonotfound.nemos.copper.events;

import com.nemonotfound.nemos.copper.Constants;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class GameEvents {

    @SubscribeEvent()
    private static void addCustomFuels(final FurnaceFuelBurnTimeEvent event) {
        var itemStack = event.getItemStack();

        if (itemStack.is(ModItems.COPPER_LAVA_BUCKET.get())) {
            event.setBurnTime(20000);
        }
    }
}
