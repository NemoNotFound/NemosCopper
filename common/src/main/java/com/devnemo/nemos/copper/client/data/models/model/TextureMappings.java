package com.devnemo.nemos.copper.client.data.models.model;

import com.devnemo.nemos.copper.block.CopperBlocks;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;

public class TextureMappings {

    public static TextureMapping cauldron(ResourceLocation texture) {
        return new TextureMapping()
                .put(TextureSlot.PARTICLE, getBlockTexture(CopperBlocks.COPPER_CAULDRON.get(), "_side"))
                .put(TextureSlot.SIDE, getBlockTexture(CopperBlocks.COPPER_CAULDRON.get(), "_side"))
                .put(TextureSlot.TOP, getBlockTexture(CopperBlocks.COPPER_CAULDRON.get(), "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(CopperBlocks.COPPER_CAULDRON.get(), "_bottom"))
                .put(TextureSlot.INSIDE, getBlockTexture(CopperBlocks.COPPER_CAULDRON.get(), "_inner"))
                .put(TextureSlot.CONTENT, texture);
    }
}
