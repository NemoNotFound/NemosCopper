package com.devnemo.nemos.copper.client.resources.model;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

import static com.devnemo.nemos.copper.Constants.MOD_ID;

public class ModModelBakery {


    public static final Material COPPER_SHIELD_BASE = new Material(Sheets.SHIELD_SHEET, ResourceLocation.fromNamespaceAndPath(MOD_ID, "entity/shield/copper_shield_base"));
    public static final Material NO_PATTERN_COPPER_SHIELD = new Material(Sheets.SHIELD_SHEET, ResourceLocation.fromNamespaceAndPath(MOD_ID, "entity/shield/copper_shield_base_nopattern"));
}
