package com.devnemo.nemos.copper.block;

import com.devnemo.nemos.copper.NemosCopperCommon;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class CopperBlocks {

    public static final Supplier<Block> COPPER_RAIL = register(
            "copper_rail",
            CopperRailBlock::new,
            BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
    );
    public static final Supplier<Block> COPPER_ACTIVATOR_RAIL = register(
            "copper_activator_rail",
            CopperPoweredRailBlock::new,
            BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
    );
    public static final Supplier<Block> COPPER_DETECTOR_RAIL = register(
            "copper_detector_rail",
            DetectorRailBlock::new,
            BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
    );
    public static final Supplier<Block> COPPER_POWERED_RAIL = register(
            "copper_powered_rail",
            CopperPoweredRailBlock::new,
            BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
    );
    public static final Supplier<Block> COPPER_LANTERN = register(
            "copper_lantern",
            LanternBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LANTERN)
    );
    public static final Supplier<Block> COPPER_SOUL_LANTERN = register(
            "copper_soul_lantern",
            LanternBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SOUL_LANTERN)
    );
    public static final Supplier<Block> COPPER_CHAIN = register(
            "copper_chain",
            ChainBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CHAIN)
    );
    public static final Supplier<Block> COPPER_CAULDRON = register(
            "copper_cauldron",
            CopperCauldronBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F)
                    .noOcclusion()
    );
    public static final Supplier<Block> COPPER_WATER_CAULDRON = register(
            "copper_water_cauldron",
            properties -> new LayeredCopperCauldronBlock(Biome.Precipitation.RAIN, CauldronInteraction.WATER, properties),
            () -> BlockBehaviour.Properties.ofLegacyCopy(COPPER_CAULDRON.get())
    );
    public static final Supplier<Block> COPPER_LAVA_CAULDRON = register(
            "copper_lava_cauldron",
            CopperLavaCauldronBlock::new,
            () -> BlockBehaviour.Properties.ofLegacyCopy(COPPER_CAULDRON.get())
                    .lightLevel(blockState -> 15)
    );
    public static final Supplier<Block> COPPER_POWDER_SNOW_CAULDRON = register(
            "copper_powder_snow_cauldron",
            properties -> new LayeredCopperCauldronBlock(Biome.Precipitation.SNOW, CauldronInteraction.POWDER_SNOW, properties),
            () -> BlockBehaviour.Properties.ofLegacyCopy(COPPER_CAULDRON.get())
    );
    public static final Supplier<Block> COPPER_BARS = register(
            "copper_bars",
            IronBarsBlock::new,
            BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.COPPER)
                    .noOcclusion()
    );
    public static final Supplier<Block> COPPER_HOPPER = register(
            "copper_hopper",
            HopperBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 4.8F)
                    .sound(SoundType.COPPER)
                    .noOcclusion()
    );

    public static void init() {}

    private static Supplier<Block> register(String id, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerBlock(id, block, properties);
    }

    private static Supplier<Block> register(String id, Function<BlockBehaviour.Properties, Block> block, Supplier<BlockBehaviour.Properties> propertiesSupplier) {
        return NemosCopperCommon.REGISTRY_HELPER.registerBlock(id, block, propertiesSupplier);
    }
}
