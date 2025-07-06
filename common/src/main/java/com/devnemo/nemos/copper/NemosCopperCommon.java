package com.devnemo.nemos.copper;

import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.item.ModCreativeModeTabs;
import com.devnemo.nemos.copper.item.ModItems;
import com.devnemo.nemos.copper.platform.RegistryHelper;
import com.devnemo.nemos.copper.tag.ModBlockTags;
import com.devnemo.nemos.copper.tag.ModItemTags;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;

import java.util.ServiceLoader;

public class NemosCopperCommon {

    public static final RegistryHelper REGISTRY_HELPER = ServiceLoader.load(RegistryHelper.class).findFirst().orElseThrow();

    public static void init() {
        Constants.LOG.info("Thanks for using Nemo's Copper!");

        ModItemTags.init();
        ModBlockTags.init();
        ModBlocks.init();
        ModEntityTypes.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}