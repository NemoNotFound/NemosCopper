package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.block.CopperBlocks;
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
        this.dropSelf(CopperBlocks.COPPER_RAIL.get());
        this.dropSelf(CopperBlocks.COPPER_ACTIVATOR_RAIL.get());
        this.dropSelf(CopperBlocks.COPPER_DETECTOR_RAIL.get());
        this.dropSelf(CopperBlocks.COPPER_POWERED_RAIL.get());
        this.dropSelf(CopperBlocks.COPPER_CHAIN.get());
        this.add(CopperBlocks.COPPER_LANTERN.get(), this::createSingleItemTable);
        this.add(CopperBlocks.COPPER_SOUL_LANTERN.get(), this::createSingleItemTable);
        this.dropSelf(CopperBlocks.COPPER_CAULDRON.get());
        this.dropOther(CopperBlocks.COPPER_WATER_CAULDRON.get(), CopperBlocks.COPPER_CAULDRON.get());
        this.dropOther(CopperBlocks.COPPER_LAVA_CAULDRON.get(), CopperBlocks.COPPER_CAULDRON.get());
        this.dropOther(CopperBlocks.COPPER_POWDER_SNOW_CAULDRON.get(), CopperBlocks.COPPER_CAULDRON.get());
        this.dropSelf(CopperBlocks.COPPER_BARS.get());
        this.add(CopperBlocks.COPPER_HOPPER.get(), this::createNameableBlockEntityTable);
    }
}
