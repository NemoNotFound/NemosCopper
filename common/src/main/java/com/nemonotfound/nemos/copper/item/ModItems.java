package com.nemonotfound.nemos.copper.item;

import com.nemonotfound.nemos.copper.NemosCopperCommon;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.entities.ModEntityTypes;
import com.nemonotfound.nemos.copper.item.equipment.ModArmorMaterials;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    public static Supplier<Item> COPPER_RAIL = registerBlockItem("copper_rail", properties -> new BlockItem(ModBlocks.COPPER_RAIL.get(), properties));
    public static Supplier<Item> COPPER_ACTIVATOR_RAIL = registerBlockItem("copper_activator_rail", properties -> new BlockItem(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), properties));
    public static Supplier<Item> COPPER_DETECTOR_RAIL = registerBlockItem("copper_detector_rail", properties -> new BlockItem(ModBlocks.COPPER_DETECTOR_RAIL.get(), properties));
    public static Supplier<Item> COPPER_POWERED_RAIL = registerBlockItem("copper_powered_rail", properties -> new BlockItem(ModBlocks.COPPER_POWERED_RAIL.get(), properties));
    //TODO: Fix NullPointer for Forge
    public static Supplier<Item> COPPER_MINECART = register("copper_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_CHEST_MINECART = register("copper_chest_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_CHEST_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_FURNACE_MINECART = register("copper_furnace_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_FURNACE_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_TNT_MINECART = register("copper_tnt_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_TNT_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_HOPPER_MINECART = register("copper_hopper_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_HOPPER_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static Supplier<Item> COPPER_COMMAND_BLOCK_MINECART = register("copper_command_block_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), properties), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
    public static Supplier<Item> COPPER_SHEARS = register("copper_shears", ShearsItem::new, () -> new Item.Properties().durability(188).component(DataComponents.TOOL, ShearsItem.createToolProperties()));
    public static final Supplier<Item> COPPER_SWORD = register("copper_sword", properties -> new SwordItem(ModToolMaterials.COPPER, 3.0F, -2.4F, properties));
    public static final Supplier<Item> COPPER_SHOVEL = register("copper_shovel", properties -> new ShovelItem(ModToolMaterials.COPPER, 1.5F, -3.0F, properties));
    public static final Supplier<Item> COPPER_PICKAXE = register("copper_pickaxe", properties -> new PickaxeItem(ModToolMaterials.COPPER, 1.0F, -2.8F, properties));
    public static final Supplier<Item> COPPER_AXE = register("copper_axe", properties -> new AxeItem(ModToolMaterials.COPPER, 6.5F, -3.15F, properties));
    public static final Supplier<Item> COPPER_HOE = register("copper_hoe", properties -> new HoeItem(ModToolMaterials.COPPER, -1.5F, -1.5F, properties));
    public static final Supplier<Item> COPPER_HELMET = register("copper_helmet", properties -> new ArmorItem(ModArmorMaterials.COPPER, ArmorType.HELMET, properties));
    public static final Supplier<Item> COPPER_CHESTPLATE = register("copper_chestplate", properties -> new ArmorItem(ModArmorMaterials.COPPER, ArmorType.CHESTPLATE, properties));
    public static final Supplier<Item> COPPER_LEGGINGS = register("copper_leggings", properties -> new ArmorItem(ModArmorMaterials.COPPER, ArmorType.LEGGINGS, properties));
    public static final Supplier<Item> COPPER_BOOTS = register("copper_boots", properties -> new ArmorItem(ModArmorMaterials.COPPER, ArmorType.BOOTS, properties));

    public static void init() {}

    private static Supplier<Item> registerBlockItem(String id, Function<Item.Properties, Item> function) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, function, new Item.Properties().useBlockDescriptionPrefix());
    }

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, function, new Item.Properties());
    }

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, function, properties);
    }

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function, Supplier<Item.Properties> properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, function, properties);
    }
}
