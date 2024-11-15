package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.entities.ModEntityTypes;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.platform.RegistryHelper;

import java.util.ServiceLoader;

public class NemosCopperCommon {

    public static final RegistryHelper REGISTRY_HELPER = ServiceLoader.load(RegistryHelper.class).findFirst().orElseThrow();

    public static void init() {
        Constants.LOG.info("Thanks for using Nemo's Copper!");

        ModBlocks.init();
        ModEntityTypes.init();
        ModItems.init();
    }
}