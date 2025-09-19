package com.devnemo.nemos.copper.helper;

import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.copper.tag.ModBlockTags;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public class CauldronInteractionHelper {

    public static BlockState retrieveBlockState(BlockState actualBlockState, BlockState cauldronBlockState, BlockState copperCauldronBlockState) {
        if (actualBlockState.is(ModBlockTags.COPPER_CAULDRONS)) {
            return copperCauldronBlockState;
        }

        return cauldronBlockState;
    }

    public static void addCopperBucketInteractions() {
        Map<Item, CauldronInteraction> emptyMap = CauldronInteraction.EMPTY.map();
        nemosCopper$addDefaultInteractions(emptyMap);

        Map<Item, CauldronInteraction> waterMap = CauldronInteraction.WATER.map();
        waterMap.put(
                CopperItems.COPPER_BUCKET.get(),
                (blockState, level, blockPos, player, hand, itemStack) -> CauldronInteraction.fillBucket(
                        blockState,
                        level,
                        blockPos,
                        player,
                        hand,
                        itemStack,
                        new ItemStack(CopperItems.COPPER_WATER_BUCKET.get()),
                        state -> state.getValue(LayeredCauldronBlock.LEVEL) == 3,
                        SoundEvents.BUCKET_FILL
                )
        );
        nemosCopper$addDefaultInteractions(waterMap);

        Map<Item, CauldronInteraction> lavaMap = CauldronInteraction.LAVA.map();
        lavaMap.put(
                CopperItems.COPPER_BUCKET.get(),
                (blockState, level, blockPos, player, hand, itemStack) -> CauldronInteraction.fillBucket(
                        blockState,
                        level,
                        blockPos,
                        player,
                        hand,
                        itemStack,
                        new ItemStack(CopperItems.COPPER_LAVA_BUCKET.get()),
                        state -> true,
                        SoundEvents.BUCKET_FILL_LAVA
                )
        );
        nemosCopper$addDefaultInteractions(lavaMap);

        Map<Item, CauldronInteraction> powderSnowMap = CauldronInteraction.POWDER_SNOW.map();
        powderSnowMap.put(
                CopperItems.COPPER_BUCKET.get(),
                (blockState, level, blockPos, player, hand, itemStack) -> CauldronInteraction.fillBucket(
                        blockState,
                        level,
                        blockPos,
                        player,
                        hand,
                        itemStack,
                        new ItemStack(CopperItems.COPPER_POWDER_SNOW_BUCKET.get()),
                        state -> state.getValue(LayeredCauldronBlock.LEVEL) == 3,
                        SoundEvents.BUCKET_FILL_POWDER_SNOW
                )
        );

        nemosCopper$addDefaultInteractions(powderSnowMap);
    }

    private static void nemosCopper$addDefaultInteractions(Map<Item, CauldronInteraction> interactionsMap) {
        interactionsMap.put(CopperItems.COPPER_LAVA_BUCKET.get(), CauldronInteraction::fillLavaInteraction);
        interactionsMap.put(CopperItems.COPPER_WATER_BUCKET.get(), CauldronInteraction::fillWaterInteraction);
        interactionsMap.put(CopperItems.COPPER_POWDER_SNOW_BUCKET.get(), CauldronInteraction::fillPowderSnowInteraction);
    }
}
