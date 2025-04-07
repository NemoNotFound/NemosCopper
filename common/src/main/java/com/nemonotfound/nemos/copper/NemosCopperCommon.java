package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModCreativeModeTabs;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.platform.RegistryHelper;
import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ServiceLoader;

public class NemosCopperCommon {

    public static final RegistryHelper REGISTRY_HELPER = ServiceLoader.load(RegistryHelper.class).findFirst().orElseThrow();

    public static void init() {
        Constants.LOG.info("Thanks for using Nemo's Copper!");

        ModItemTags.init();
        ModBlockTags.init();
        ModBlocks.init();
        EntityTypes.init();
        ModItems.init();
        ModCreativeModeTabs.init();

        //TODO: Remove later
//        for (BlockState blockState : ModBlocks.COPPER_CAULDRON.get().getStateDefinition().getPossibleStates()) {
//            Block.BLOCK_STATE_REGISTRY.add(blockState);
//            blockState.initCache();
//        }
//
//        for (BlockState blockState : ModBlocks.COPPER_WATER_CAULDRON.get().getStateDefinition().getPossibleStates()) {
//            Block.BLOCK_STATE_REGISTRY.add(blockState);
//            blockState.initCache();
//        }
//
//        for (BlockState blockState : ModBlocks.COPPER_LAVA_CAULDRON.get().getStateDefinition().getPossibleStates()) {
//            Block.BLOCK_STATE_REGISTRY.add(blockState);
//            blockState.initCache();
//        }
    }
}