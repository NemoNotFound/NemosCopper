package com.nemonotfound.nemos.copper.client.data.models.model;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;

public class TextureMappings {

    public static TextureMapping cauldron(ResourceLocation texture) {
        return new TextureMapping()
                .put(TextureSlot.PARTICLE, getBlockTexture(ModBlocks.COPPER_CAULDRON.get(), "_side"))
                .put(TextureSlot.SIDE, getBlockTexture(ModBlocks.COPPER_CAULDRON.get(), "_side"))
                .put(TextureSlot.TOP, getBlockTexture(ModBlocks.COPPER_CAULDRON.get(), "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(ModBlocks.COPPER_CAULDRON.get(), "_bottom"))
                .put(TextureSlot.INSIDE, getBlockTexture(ModBlocks.COPPER_CAULDRON.get(), "_inner"))
                .put(TextureSlot.CONTENT, texture);
    }
}
