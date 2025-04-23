package com.nemonotfound.nemos.copper.helper;

import com.nemonotfound.nemos.copper.tag.ModBlockTags;
import net.minecraft.world.level.block.state.BlockState;

public class CauldronInteractionHelper {

    public static BlockState retrieveBlockState(BlockState actualBlockState, BlockState cauldronBlockState, BlockState copperCauldronBlockState) {
        if (actualBlockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return copperCauldronBlockState;
        }

        return cauldronBlockState;
    }
}
