package com.devnemo.nemos.copper;

import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.core.dispenser.ModDispenseItemBehavior;
import com.devnemo.nemos.copper.helper.CauldronInteractionHelper;
import com.devnemo.nemos.copper.helper.ItemReplacementHelper;
import com.devnemo.nemos.copper.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();
        FuelRegistryEvents.BUILD.register((builder, context) ->
                builder.add(ModItems.COPPER_LAVA_BUCKET.get(), 20000));

        ModDispenseItemBehavior.bootstrap();
        CauldronInteractionHelper.addCopperBucketInteractions();
        ItemReplacementHelper.addToItemReplacementMaps();

        BlockEntityType.HOPPER.addSupportedBlock(ModBlocks.COPPER_HOPPER.get());
    }
}
