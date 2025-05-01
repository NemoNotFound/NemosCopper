package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.core.dispenser.ModDispenseItemBehavior;
import com.nemonotfound.nemos.copper.helper.CauldronInteractionHelper;
import com.nemonotfound.nemos.copper.helper.ItemReplacementHelper;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();
        FuelRegistryEvents.BUILD.register((builder, context) ->
                builder.add(ModItems.COPPER_LAVA_BUCKET.get(), 20000));

        ModDispenseItemBehavior.bootstrap();
        CauldronInteractionHelper.addCopperBucketInteractions();
        ItemReplacementHelper.addToItemReplacementMaps();
    }
}
