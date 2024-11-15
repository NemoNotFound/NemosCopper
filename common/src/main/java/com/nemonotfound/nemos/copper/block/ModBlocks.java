package com.nemonotfound.nemos.copper.block;

import com.nemonotfound.nemos.copper.NemosCopperCommon;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DetectorRailBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    public static Supplier<Block> COPPER_RAIL = register("copper_rail", CopperRailBlock::new, BlockBehaviour.Properties.of().noCollission().strength(0.7F).sound(SoundType.METAL));
    public static Supplier<Block> COPPER_ACTIVATOR_RAIL = register("copper_activator_rail", CopperPoweredRailBlock::new, BlockBehaviour.Properties.of().noCollission().strength(0.7F).sound(SoundType.METAL));
    public static Supplier<Block> COPPER_DETECTOR_RAIL = register("copper_detector_rail", DetectorRailBlock::new, BlockBehaviour.Properties.of().noCollission().strength(0.7F).sound(SoundType.METAL));
    public static Supplier<Block> COPPER_POWERED_RAIL = register("copper_powered_rail", CopperPoweredRailBlock::new, BlockBehaviour.Properties.of().noCollission().strength(0.7F).sound(SoundType.METAL));

    public static void init() {}

    private static Supplier<Block> register(String id, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerBlock(id, block, properties);
    }
}
