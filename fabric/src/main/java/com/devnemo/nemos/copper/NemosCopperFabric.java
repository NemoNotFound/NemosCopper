package com.devnemo.nemos.copper;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.core.dispenser.CopperDispenseItemBehavior;
import com.devnemo.nemos.copper.helper.CauldronInteractionHelper;
import com.devnemo.nemos.copper.helper.ItemReplacementHelper;
import com.devnemo.nemos.copper.item.CopperItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();
        FuelRegistryEvents.BUILD.register((builder, context) ->
                builder.add(CopperItems.COPPER_LAVA_BUCKET.get(), 20000));

        CopperDispenseItemBehavior.bootstrap();
        CauldronInteractionHelper.addCopperBucketInteractions();
        ItemReplacementHelper.addToItemReplacementMaps();

        BlockEntityType.HOPPER.addSupportedBlock(CopperBlocks.COPPER_HOPPER.get());
    }
}
