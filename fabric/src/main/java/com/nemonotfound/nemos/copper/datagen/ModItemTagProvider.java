package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.item.Items;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.COPPER_TOOL_MATERIALS)
                .add(net.minecraft.world.item.Items.COPPER_INGOT);

        getOrCreateTagBuilder(ModItemTags.REPAIRS_COPPER_ARMOR)
                .add(net.minecraft.world.item.Items.COPPER_INGOT);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(Items.COPPER_AXE.get());

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(Items.COPPER_HOE.get());

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(Items.COPPER_PICKAXE.get());

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(Items.COPPER_SHOVEL.get());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(Items.COPPER_SWORD.get());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(Items.COPPER_HELMET.get())
                .add(Items.COPPER_CHESTPLATE.get())
                .add(Items.COPPER_LEGGINGS.get())
                .add(Items.COPPER_BOOTS.get());
    }
}
