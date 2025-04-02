package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.item.Items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.world.level.block.DispenserBlock;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();

        DispenserBlock.registerBehavior(Items.COPPER_SHEARS.get().asItem(), new ShearsDispenseItemBehavior());
    }
}
