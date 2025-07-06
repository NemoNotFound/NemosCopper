package com.devnemo.nemos.copper.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static com.devnemo.nemos.copper.Constants.MOD_ID;

public class ModBlockTags {

    public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "incorrect_for_copper_tool"));
    public static final TagKey<Block> COPPER_CAULDRONS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "copper_cauldrons"));

    public static void init() {}
}
