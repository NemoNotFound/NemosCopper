package com.devnemo.nemos.copper.helper;

import com.devnemo.nemos.copper.item.ModItems;
import com.devnemo.nemos.tags.helper.ItemReplacementMaps;

public class ItemReplacementHelper {

    private ItemReplacementHelper() {}

    public static void addToItemReplacementMaps() {
        ItemReplacementMaps.BUCKET_TO_MILK_BUCKET.put(ModItems.COPPER_BUCKET.get(), ModItems.COPPER_MILK_BUCKET.get());

        ItemReplacementMaps.FILLED_BUCKET_TO_EMPTY_BUCKET.put(ModItems.COPPER_LAVA_BUCKET.get(), ModItems.COPPER_BUCKET.get());
        ItemReplacementMaps.FILLED_BUCKET_TO_EMPTY_BUCKET.put(ModItems.COPPER_WATER_BUCKET.get(), ModItems.COPPER_BUCKET.get());
        ItemReplacementMaps.FILLED_BUCKET_TO_EMPTY_BUCKET.put(ModItems.COPPER_POWDER_SNOW_BUCKET.get(), ModItems.COPPER_BUCKET.get());

        ItemReplacementMaps.EMPTY_BUCKET_TO_WATER_BUCKET.put(ModItems.COPPER_BUCKET.get(), ModItems.COPPER_WATER_BUCKET.get());

        ItemReplacementMaps.EMPTY_BUCKET_TO_LAVA_BUCKET.put(ModItems.COPPER_BUCKET.get(), ModItems.COPPER_LAVA_BUCKET.get());

        ItemReplacementMaps.EMPTY_BUCKET_TO_POWDER_SNOW_BUCKET.put(ModItems.COPPER_BUCKET.get(), ModItems.COPPER_POWDER_SNOW_BUCKET.get());
    }
}
