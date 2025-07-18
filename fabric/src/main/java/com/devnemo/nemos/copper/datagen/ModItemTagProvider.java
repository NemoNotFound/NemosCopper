package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.item.ModItems;
import com.devnemo.nemos.copper.tag.ModItemTags;
import com.devnemo.nemos.tags.tags.NemosItemTags;
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
        valueLookupBuilder(ModItemTags.COPPER_TOOL_MATERIALS)
                .add(net.minecraft.world.item.Items.COPPER_INGOT);

        valueLookupBuilder(ModItemTags.REPAIRS_COPPER_ARMOR)
                .add(net.minecraft.world.item.Items.COPPER_INGOT);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get());

        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get());

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get());

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get());

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get());

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_BOOTS.get());

        valueLookupBuilder(ModItemTags.COPPER_BUCKETS)
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

        valueLookupBuilder(ModItemTags.COPPER_NUGGETS)
                .add(ModItems.COPPER_NUGGET.get());

        valueLookupBuilder(NemosItemTags.SHEARS)
                .add(ModItems.COPPER_SHEARS.get());

        valueLookupBuilder(NemosItemTags.EMPTY_BUCKETS)
                .add(ModItems.COPPER_BUCKET.get());

        valueLookupBuilder(NemosItemTags.WATER_BUCKETS)
                .add(ModItems.COPPER_WATER_BUCKET.get());

        valueLookupBuilder(NemosItemTags.LAVA_BUCKETS)
                .add(ModItems.COPPER_LAVA_BUCKET.get());

        valueLookupBuilder(NemosItemTags.POWDER_SNOW_BUCKETS)
                .add(ModItems.COPPER_POWDER_SNOW_BUCKET.get());

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.COPPER_BOOTS.get());

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.COPPER_LEGGINGS.get());

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.COPPER_CHESTPLATE.get());

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.COPPER_HELMET.get());
    }
}
