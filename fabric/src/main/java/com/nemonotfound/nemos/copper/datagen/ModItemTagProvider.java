package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.COPPER_TOOL_MATERIALS)
                .add(Items.COPPER_INGOT);

        getOrCreateTagBuilder(ModItemTags.REPAIRS_COPPER_ARMOR)
                .add(Items.COPPER_INGOT);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get());

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get());

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get());

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_BOOTS.get());
    }
}
