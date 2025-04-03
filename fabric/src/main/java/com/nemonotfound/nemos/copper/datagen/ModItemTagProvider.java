package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.item.ModItems;
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

        getOrCreateTagBuilder(ModItemTags.COPPER_BUCKETS)
                .add(ModItems.COPPER_BUCKET.get())
                .add(ModItems.COPPER_WATER_BUCKET.get())
                .add(ModItems.COPPER_LAVA_BUCKET.get())
                .add(ModItems.COPPER_POWDER_SNOW_BUCKET.get())
                .add(ModItems.COPPER_MILK_BUCKET.get())
                .add(ModItems.COPPER_PUFFERFISH_BUCKET.get())
                .add(ModItems.COPPER_SALMON_BUCKET.get())
                .add(ModItems.COPPER_COD_BUCKET.get())
                .add(ModItems.COPPER_TROPICAL_FISH_BUCKET.get())
                .add(ModItems.COPPER_AXOLOTL_BUCKET.get())
                .add(ModItems.COPPER_TADPOLE_BUCKET.get());
    }
}
