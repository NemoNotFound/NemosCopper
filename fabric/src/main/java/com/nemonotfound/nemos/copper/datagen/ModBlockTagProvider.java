package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import com.nemonotfound.nemos.tags.tags.NemosBlockTags;
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
        getOrCreateTagBuilder(BlockTags.RAILS)
                .add(ModBlocks.COPPER_RAIL.get())
                .add(ModBlocks.COPPER_ACTIVATOR_RAIL.get())
                .add(ModBlocks.COPPER_DETECTOR_RAIL.get())
                .add(ModBlocks.COPPER_POWERED_RAIL.get());

        getOrCreateTagBuilder(ModBlockTags.INCORRECT_FOR_COPPER_TOOL)
                .forceAddTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COPPER_LANTERN.get())
                .add(ModBlocks.COPPER_SOUL_LANTERN.get())
                .add(ModBlocks.COPPER_CHAIN.get());

        getOrCreateTagBuilder(BlockTags.CAULDRONS)
                .add(ModBlocks.COPPER_CAULDRON.get())
                .add(ModBlocks.COPPER_LAVA_CAULDRON.get())
                .add(ModBlocks.COPPER_WATER_CAULDRON.get())
                .add(ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get());

        getOrCreateTagBuilder(ModBlockTags.COPPER_CAULDRONS)
                .add(ModBlocks.COPPER_CAULDRON.get())
                .add(ModBlocks.COPPER_LAVA_CAULDRON.get())
                .add(ModBlocks.COPPER_WATER_CAULDRON.get())
                .add(ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get());

        getOrCreateTagBuilder(NemosBlockTags.POWERED_RAILS)
                .add(ModBlocks.COPPER_POWERED_RAIL.get());

        getOrCreateTagBuilder(NemosBlockTags.BARS)
                .add(ModBlocks.COPPER_BARS.get());
    }
}
