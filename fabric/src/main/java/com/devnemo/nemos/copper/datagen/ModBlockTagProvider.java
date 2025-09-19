package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.tag.ModBlockTags;
import com.devnemo.nemos.tags.tags.NemosBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(BlockTags.RAILS)
                .add(CopperBlocks.COPPER_RAIL.get())
                .add(CopperBlocks.COPPER_ACTIVATOR_RAIL.get())
                .add(CopperBlocks.COPPER_DETECTOR_RAIL.get())
                .add(CopperBlocks.COPPER_POWERED_RAIL.get());

        valueLookupBuilder(ModBlockTags.INCORRECT_FOR_COPPER_TOOL)
                .forceAddTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(CopperBlocks.COPPER_LANTERN.get())
                .add(CopperBlocks.COPPER_SOUL_LANTERN.get())
                .add(CopperBlocks.COPPER_CHAIN.get())
                .add(CopperBlocks.COPPER_HOPPER.get());

        valueLookupBuilder(BlockTags.CAULDRONS)
                .add(CopperBlocks.COPPER_CAULDRON.get())
                .add(CopperBlocks.COPPER_LAVA_CAULDRON.get())
                .add(CopperBlocks.COPPER_WATER_CAULDRON.get())
                .add(CopperBlocks.COPPER_POWDER_SNOW_CAULDRON.get());

        valueLookupBuilder(ModBlockTags.COPPER_CAULDRONS)
                .add(CopperBlocks.COPPER_CAULDRON.get())
                .add(CopperBlocks.COPPER_LAVA_CAULDRON.get())
                .add(CopperBlocks.COPPER_WATER_CAULDRON.get())
                .add(CopperBlocks.COPPER_POWDER_SNOW_CAULDRON.get());

        valueLookupBuilder(NemosBlockTags.POWERED_RAILS)
                .add(CopperBlocks.COPPER_POWERED_RAIL.get());

        valueLookupBuilder(NemosBlockTags.BARS)
                .add(CopperBlocks.COPPER_BARS.get());
    }
}
