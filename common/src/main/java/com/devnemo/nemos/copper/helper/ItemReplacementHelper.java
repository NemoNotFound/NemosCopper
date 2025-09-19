package com.devnemo.nemos.copper.helper;

import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.tags.helper.ItemReplacementMaps;

public class ItemReplacementHelper {

    private ItemReplacementHelper() {}

    public static void addToItemReplacementMaps() {
        ItemReplacementMaps.BUCKET_TO_MILK_BUCKET.put(CopperItems.COPPER_BUCKET.get(), CopperItems.COPPER_MILK_BUCKET.get());

        ItemReplacementMaps.FILLED_BUCKET_TO_EMPTY_BUCKET.put(CopperItems.COPPER_LAVA_BUCKET.get(), CopperItems.COPPER_BUCKET.get());
        ItemReplacementMaps.FILLED_BUCKET_TO_EMPTY_BUCKET.put(CopperItems.COPPER_WATER_BUCKET.get(), CopperItems.COPPER_BUCKET.get());
        ItemReplacementMaps.FILLED_BUCKET_TO_EMPTY_BUCKET.put(CopperItems.COPPER_POWDER_SNOW_BUCKET.get(), CopperItems.COPPER_BUCKET.get());

        ItemReplacementMaps.EMPTY_BUCKET_TO_WATER_BUCKET.put(CopperItems.COPPER_BUCKET.get(), CopperItems.COPPER_WATER_BUCKET.get());

        ItemReplacementMaps.EMPTY_BUCKET_TO_LAVA_BUCKET.put(CopperItems.COPPER_BUCKET.get(), CopperItems.COPPER_LAVA_BUCKET.get());

        ItemReplacementMaps.EMPTY_BUCKET_TO_POWDER_SNOW_BUCKET.put(CopperItems.COPPER_BUCKET.get(), CopperItems.COPPER_POWDER_SNOW_BUCKET.get());
    }
}
