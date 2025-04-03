package com.nemonotfound.nemos.copper.client.data.models.model;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

public class ModelTemplates {

    public static final ModelTemplate COPPER_CAULDRON_LEVEL1 = create(
            "template_copper_cauldron_level1", 
            TextureSlot.CONTENT, 
            TextureSlot.INSIDE, 
            TextureSlot.PARTICLE, 
            TextureSlot.TOP, 
            TextureSlot.BOTTOM, 
            TextureSlot.SIDE
    );
    public static final ModelTemplate COPPER_CAULDRON_LEVEL2 = create(
            "template_copper_cauldron_level2", 
            TextureSlot.CONTENT, 
            TextureSlot.INSIDE, 
            TextureSlot.PARTICLE, 
            TextureSlot.TOP, 
            TextureSlot.BOTTOM, 
            TextureSlot.SIDE
    );
    public static final ModelTemplate COPPER_CAULDRON_FULL = create(
            "template_copper_cauldron_full", 
            TextureSlot.CONTENT, 
            TextureSlot.INSIDE, 
            TextureSlot.PARTICLE, 
            TextureSlot.TOP, 
            TextureSlot.BOTTOM, 
            TextureSlot.SIDE
    );

    private static ModelTemplate create(String name, TextureSlot... requiredSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + name)), Optional.empty(), requiredSlots);
    }
}
