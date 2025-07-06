package com.devnemo.nemos.copper.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.devnemo.nemos.copper.Constants.MOD_ID;

public class ModItemTags {

    public static final TagKey<Item> COPPER_TOOL_MATERIALS = createTag("copper_tool_materials");
    public static final TagKey<Item> REPAIRS_COPPER_ARMOR = createTag("repairs_copper_armor");
    public static final TagKey<Item> COPPER_BUCKETS = createTag("copper_buckets");
    public static final TagKey<Item> COPPER_NUGGETS = createTag("copper_nuggets");

    public static void init() {}

    private static TagKey<Item> createTag(String id) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, id));
    }
}
