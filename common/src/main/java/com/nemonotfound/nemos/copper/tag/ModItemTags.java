package com.nemonotfound.nemos.copper.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

public class ModItemTags {

    public static final TagKey<Item> COPPER_TOOL_MATERIALS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "copper_tool_materials"));
    public static final TagKey<Item> REPAIRS_COPPER_ARMOR = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "repairs_copper_armor"));

    public static void init() {}
}
