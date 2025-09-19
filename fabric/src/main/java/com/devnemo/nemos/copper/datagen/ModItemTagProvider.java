package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.item.CopperItems;
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
                .add(CopperItems.COPPER_AXE.get());

        valueLookupBuilder(ItemTags.HOES)
                .add(CopperItems.COPPER_HOE.get());

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(CopperItems.COPPER_PICKAXE.get());

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(CopperItems.COPPER_SHOVEL.get());

        valueLookupBuilder(ItemTags.SWORDS)
                .add(CopperItems.COPPER_SWORD.get());

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(CopperItems.COPPER_HELMET.get())
                .add(CopperItems.COPPER_CHESTPLATE.get())
                .add(CopperItems.COPPER_LEGGINGS.get())
                .add(CopperItems.COPPER_BOOTS.get());

        valueLookupBuilder(ModItemTags.COPPER_BUCKETS)
                .add(CopperItems.COPPER_BUCKET.get())
                .add(CopperItems.COPPER_WATER_BUCKET.get())
                .add(CopperItems.COPPER_LAVA_BUCKET.get())
                .add(CopperItems.COPPER_POWDER_SNOW_BUCKET.get())
                .add(CopperItems.COPPER_MILK_BUCKET.get())
                .add(CopperItems.COPPER_PUFFERFISH_BUCKET.get())
                .add(CopperItems.COPPER_SALMON_BUCKET.get())
                .add(CopperItems.COPPER_COD_BUCKET.get())
                .add(CopperItems.COPPER_TROPICAL_FISH_BUCKET.get())
                .add(CopperItems.COPPER_AXOLOTL_BUCKET.get())
                .add(CopperItems.COPPER_TADPOLE_BUCKET.get());

        valueLookupBuilder(ModItemTags.COPPER_NUGGETS)
                .add(CopperItems.COPPER_NUGGET.get());

        valueLookupBuilder(NemosItemTags.SHEARS)
                .add(CopperItems.COPPER_SHEARS.get());

        valueLookupBuilder(NemosItemTags.EMPTY_BUCKETS)
                .add(CopperItems.COPPER_BUCKET.get());

        valueLookupBuilder(NemosItemTags.WATER_BUCKETS)
                .add(CopperItems.COPPER_WATER_BUCKET.get());

        valueLookupBuilder(NemosItemTags.LAVA_BUCKETS)
                .add(CopperItems.COPPER_LAVA_BUCKET.get());

        valueLookupBuilder(NemosItemTags.POWDER_SNOW_BUCKETS)
                .add(CopperItems.COPPER_POWDER_SNOW_BUCKET.get());

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(CopperItems.COPPER_BOOTS.get());

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(CopperItems.COPPER_LEGGINGS.get());

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(CopperItems.COPPER_CHESTPLATE.get());

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(CopperItems.COPPER_HELMET.get());
    }
}
