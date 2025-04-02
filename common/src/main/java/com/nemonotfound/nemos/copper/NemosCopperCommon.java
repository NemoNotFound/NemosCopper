package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.Items;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
import com.nemonotfound.nemos.copper.item.ModCreativeModeTabs;
import com.nemonotfound.nemos.copper.platform.RegistryHelper;
import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import com.nemonotfound.nemos.copper.tag.ModItemTags;

import java.util.ServiceLoader;

public class NemosCopperCommon {

    public static final RegistryHelper REGISTRY_HELPER = ServiceLoader.load(RegistryHelper.class).findFirst().orElseThrow();

    public static void init() {
        Constants.LOG.info("Thanks for using Nemo's Copper!");

        ModItemTags.init();
        ModBlockTags.init();
        ModBlocks.init();
        EntityTypes.init();
        Items.init();
        ModCreativeModeTabs.init();
    }
}