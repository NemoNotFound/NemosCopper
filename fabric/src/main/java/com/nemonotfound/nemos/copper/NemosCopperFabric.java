package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.helper.CauldronInteractionHelper;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.world.level.block.DispenserBlock;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();
        FuelRegistryEvents.BUILD.register((builder, context) ->
                builder.add(ModItems.COPPER_LAVA_BUCKET.get(), 20000));

        DispenserBlock.registerBehavior(ModItems.COPPER_SHEARS.get().asItem(), new ShearsDispenseItemBehavior());
        CauldronInteractionHelper.addCopperBucketInteractions();
    }
}
