package com.nemonotfound.nemos.copper.item;

import com.nemonotfound.nemos.copper.NemosCopperCommon;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    public static Supplier<Item> COPPER_RAIL = register("copper_rail", properties -> new BlockItem(ModBlocks.COPPER_RAIL.get(), properties));
    public static Supplier<Item> COPPER_ACTIVATOR_RAIL = register("copper_activator_rail", properties -> new BlockItem(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), properties));
    public static Supplier<Item> COPPER_DETECTOR_RAIL = register("copper_detector_rail", properties -> new BlockItem(ModBlocks.COPPER_DETECTOR_RAIL.get(), properties));
    public static Supplier<Item> COPPER_POWERED_RAIL = register("copper_powered_rail", properties -> new BlockItem(ModBlocks.COPPER_POWERED_RAIL.get(), properties));

    public static void init() {}

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function) {
        return NemosCopperCommon.REGISTER_HELPER.registerItem(id, function, new Item.Properties().useBlockDescriptionPrefix());
    }
}
