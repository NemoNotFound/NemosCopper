package com.nemonotfound.nemos.copper.item;

import com.nemonotfound.nemos.copper.NemosCopperCommon;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.entities.ModEntityTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    public static Supplier<Item> COPPER_RAIL = register("copper_rail", properties -> new BlockItem(ModBlocks.COPPER_RAIL.get(), properties));
    public static Supplier<Item> COPPER_ACTIVATOR_RAIL = register("copper_activator_rail", properties -> new BlockItem(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), properties));
    public static Supplier<Item> COPPER_DETECTOR_RAIL = register("copper_detector_rail", properties -> new BlockItem(ModBlocks.COPPER_DETECTOR_RAIL.get(), properties));
    public static Supplier<Item> COPPER_POWERED_RAIL = register("copper_powered_rail", properties -> new BlockItem(ModBlocks.COPPER_POWERED_RAIL.get(), properties));
    //TODO: Fix NullPointer for Forge
    public static Supplier<Item> COPPER_MINECART = register("copper_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_CHEST_MINECART = register("copper_chest_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_CHEST_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_FURNACE_MINECART = register("copper_furnace_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_FURNACE_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_TNT_MINECART = register("copper_tnt_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_TNT_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_HOPPER_MINECART = register("copper_hopper_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_HOPPER_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_COMMAND_BLOCK_MINECART = register("copper_command_block_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), properties), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));

    public static void init() {}

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, function, new Item.Properties().useBlockDescriptionPrefix());
    }

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, function, properties);
    }
}
