package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.block.ModBlocks;
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
                .add(ModBlocks.COPPER_RAIL.get())
                .add(ModBlocks.COPPER_ACTIVATOR_RAIL.get())
                .add(ModBlocks.COPPER_DETECTOR_RAIL.get())
                .add(ModBlocks.COPPER_POWERED_RAIL.get());

        valueLookupBuilder(ModBlockTags.INCORRECT_FOR_COPPER_TOOL)
                .forceAddTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COPPER_LANTERN.get())
                .add(ModBlocks.COPPER_SOUL_LANTERN.get())
                .add(ModBlocks.COPPER_CHAIN.get())
                .add(ModBlocks.COPPER_HOPPER.get());

        valueLookupBuilder(BlockTags.CAULDRONS)
                .add(ModBlocks.COPPER_CAULDRON.get())
                .add(ModBlocks.COPPER_LAVA_CAULDRON.get())
                .add(ModBlocks.COPPER_WATER_CAULDRON.get())
                .add(ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get());

        valueLookupBuilder(ModBlockTags.COPPER_CAULDRONS)
                .add(ModBlocks.COPPER_CAULDRON.get())
                .add(ModBlocks.COPPER_LAVA_CAULDRON.get())
                .add(ModBlocks.COPPER_WATER_CAULDRON.get())
                .add(ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get());

        valueLookupBuilder(NemosBlockTags.POWERED_RAILS)
                .add(ModBlocks.COPPER_POWERED_RAIL.get());

        valueLookupBuilder(NemosBlockTags.BARS)
                .add(ModBlocks.COPPER_BARS.get());
    }
}
