package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class BlockLootTableProvider extends FabricBlockLootTableProvider {

    public BlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.dropSelf(ModBlocks.COPPER_RAIL.get());
        this.dropSelf(ModBlocks.COPPER_ACTIVATOR_RAIL.get());
        this.dropSelf(ModBlocks.COPPER_DETECTOR_RAIL.get());
        this.dropSelf(ModBlocks.COPPER_POWERED_RAIL.get());
        this.dropSelf(ModBlocks.COPPER_CHAIN.get());
        this.add(ModBlocks.COPPER_LANTERN.get(), this::createSingleItemTable);
        this.add(ModBlocks.COPPER_SOUL_LANTERN.get(), this::createSingleItemTable);
        this.dropSelf(ModBlocks.COPPER_CAULDRON.get());
        this.dropOther(ModBlocks.COPPER_WATER_CAULDRON.get(), ModBlocks.COPPER_CAULDRON.get());
        this.dropOther(ModBlocks.COPPER_LAVA_CAULDRON.get(), ModBlocks.COPPER_CAULDRON.get());
        this.dropOther(ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get(), ModBlocks.COPPER_CAULDRON.get());
        this.dropSelf(ModBlocks.COPPER_BARS.get());
    }
}
