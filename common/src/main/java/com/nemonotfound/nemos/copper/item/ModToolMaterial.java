package com.nemonotfound.nemos.copper.item;

import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterial {

    public static final ToolMaterial COPPER = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 200, 5.0F, 1.5F, 12, ModItemTags.COPPER_TOOL_MATERIALS);

    public static void init() {}
}
