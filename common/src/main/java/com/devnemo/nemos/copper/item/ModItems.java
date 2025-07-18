package com.devnemo.nemos.copper.item;

import com.devnemo.nemos.copper.NemosCopperCommon;
import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.item.equipment.ModArmorMaterials;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.BlocksAttacks;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraft.world.level.material.Fluids;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    public static final Supplier<Item> COPPER_RAIL = registerBlockItem("copper_rail", ModBlocks.COPPER_RAIL);
    public static final Supplier<Item> COPPER_ACTIVATOR_RAIL = registerBlockItem("copper_activator_rail", ModBlocks.COPPER_ACTIVATOR_RAIL);
    public static final Supplier<Item> COPPER_DETECTOR_RAIL = registerBlockItem("copper_detector_rail", ModBlocks.COPPER_DETECTOR_RAIL);
    public static final Supplier<Item> COPPER_POWERED_RAIL = registerBlockItem("copper_powered_rail", ModBlocks.COPPER_POWERED_RAIL);
    public static final Supplier<Item> COPPER_MINECART = register("copper_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static final Supplier<Item> COPPER_CHEST_MINECART = register("copper_chest_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_CHEST_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static final Supplier<Item> COPPER_FURNACE_MINECART = register("copper_furnace_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_FURNACE_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static final Supplier<Item> COPPER_TNT_MINECART = register("copper_tnt_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_TNT_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static final Supplier<Item> COPPER_HOPPER_MINECART = register("copper_hopper_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_HOPPER_MINECART.get(), properties), new Item.Properties().stacksTo(1));
    public static final Supplier<Item> COPPER_COMMAND_BLOCK_MINECART = register("copper_command_block_minecart", properties -> new MinecartItem(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), properties), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
    public static final Supplier<Item> COPPER_SHEARS = register("copper_shears", ShearsItem::new, () -> new Item.Properties().durability(188).component(DataComponents.TOOL, ShearsItem.createToolProperties()));
    public static final Supplier<Item> COPPER_SWORD = register("copper_sword", () -> new Item.Properties().sword(ModToolMaterials.COPPER, 3.0F, -2.4F));
    public static final Supplier<Item> COPPER_SHOVEL = register("copper_shovel", properties -> new ShovelItem(ModToolMaterials.COPPER, 1.5F, -3.0F, properties));
    public static final Supplier<Item> COPPER_PICKAXE = register("copper_pickaxe", () -> new Item.Properties().pickaxe(ModToolMaterials.COPPER, 1.0F, -2.8F));
    public static final Supplier<Item> COPPER_AXE = register("copper_axe", properties -> new AxeItem(ModToolMaterials.COPPER, 6.5F, -3.15F, properties));
    public static final Supplier<Item> COPPER_HOE = register("copper_hoe", properties -> new HoeItem(ModToolMaterials.COPPER, -1.5F, -1.5F, properties));
    public static final Supplier<Item> COPPER_HELMET = register("copper_helmet", () -> new Item.Properties().humanoidArmor(ModArmorMaterials.COPPER, ArmorType.HELMET));
    public static final Supplier<Item> COPPER_CHESTPLATE = register("copper_chestplate", () -> new Item.Properties().humanoidArmor(ModArmorMaterials.COPPER, ArmorType.CHESTPLATE));
    public static final Supplier<Item> COPPER_LEGGINGS = register("copper_leggings", () -> new Item.Properties().humanoidArmor(ModArmorMaterials.COPPER, ArmorType.LEGGINGS));
    public static final Supplier<Item> COPPER_BOOTS = register("copper_boots", () -> new Item.Properties().humanoidArmor(ModArmorMaterials.COPPER, ArmorType.BOOTS));
    public static final Supplier<Item> COPPER_LANTERN = registerBlockItem("copper_lantern", ModBlocks.COPPER_LANTERN);
    public static final Supplier<Item> COPPER_SOUL_LANTERN = registerBlockItem("copper_soul_lantern", ModBlocks.COPPER_SOUL_LANTERN);
    public static final Supplier<Item> COPPER_NUGGET = register("copper_nugget", Item::new);
    public static final Supplier<Item> COPPER_CHAIN = registerBlockItem("copper_chain", ModBlocks.COPPER_CHAIN);
    public static final Supplier<Item> COPPER_BUCKET = register("copper_bucket", (properties) -> new BucketItem(Fluids.EMPTY, properties), (new Item.Properties()).stacksTo(16));
    public static final Supplier<Item> COPPER_WATER_BUCKET = register("copper_water_bucket", (properties) -> new BucketItem(Fluids.WATER, properties), () -> new Item.Properties().craftRemainder(COPPER_BUCKET.get()).stacksTo(1));
    public static final Supplier<Item> COPPER_LAVA_BUCKET = register("copper_lava_bucket", (properties) -> new BucketItem(Fluids.LAVA, properties), () -> new Item.Properties().craftRemainder(COPPER_BUCKET.get()).stacksTo(1));
    public static final Supplier<Item> COPPER_POWDER_SNOW_BUCKET = register("copper_powder_snow_bucket", (properties) -> new SolidBucketItem(Blocks.POWDER_SNOW, SoundEvents.BUCKET_EMPTY_POWDER_SNOW, properties), new Item.Properties().stacksTo(1).useItemDescriptionPrefix());
    public static final Supplier<Item> COPPER_MILK_BUCKET = register("copper_milk_bucket", Item::new, () -> new Item.Properties().craftRemainder(COPPER_BUCKET.get()).component(DataComponents.CONSUMABLE, Consumables.MILK_BUCKET).usingConvertsTo(COPPER_BUCKET.get()).stacksTo(1));
    public static final Supplier<Item> COPPER_PUFFERFISH_BUCKET = register("copper_pufferfish_bucket", (properties) -> new MobBucketItem(EntityType.PUFFERFISH, Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY));
    public static final Supplier<Item> COPPER_SALMON_BUCKET = register("copper_salmon_bucket", (properties) -> new MobBucketItem(EntityType.SALMON, Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY));
    public static final Supplier<Item> COPPER_COD_BUCKET = register("copper_cod_bucket", (properties) -> new MobBucketItem(EntityType.COD, Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY));
    public static final Supplier<Item> COPPER_TROPICAL_FISH_BUCKET = register("copper_tropical_fish_bucket", (properties) -> new MobBucketItem(EntityType.TROPICAL_FISH, Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY));
    public static final Supplier<Item> COPPER_AXOLOTL_BUCKET = register("copper_axolotl_bucket", (properties) -> new MobBucketItem(EntityType.AXOLOTL, Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY));
    public static final Supplier<Item> COPPER_TADPOLE_BUCKET = register(
            "copper_tadpole_bucket",
            (properties) -> new MobBucketItem(
                    EntityType.TADPOLE,
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_TADPOLE,
                    properties
            ),
            new Item.Properties()
                    .stacksTo(1)
                    .component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY)
    );
    public static final Supplier<Item> COPPER_CAULDRON = registerBlockItem("copper_cauldron", ModBlocks.COPPER_CAULDRON);
    public static final Supplier<Item> COPPER_SHIELD = register(
            "copper_shield",
            ShieldItem::new,
            () -> new Item.Properties()
                    .durability(236)
                    .component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY)
                    .repairable(ItemTags.WOODEN_TOOL_MATERIALS)
                    .equippableUnswappable(EquipmentSlot.OFFHAND)
                    .component(
                            DataComponents.BLOCKS_ATTACKS,
                            new BlocksAttacks(
                                    0.25F,
                                    1.0F,
                                    List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)),
                                    new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F),
                                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                                    Optional.of(SoundEvents.SHIELD_BLOCK),
                                    Optional.of(SoundEvents.SHIELD_BREAK)
                            )
                    )
                    .component(DataComponents.BREAK_SOUND, SoundEvents.SHIELD_BREAK)
    );
    public static final Supplier<Item> COPPER_BARS = registerBlockItem("copper_bars", ModBlocks.COPPER_BARS);
    public static final Supplier<Item> COPPER_HOPPER = registerBlockItem("copper_hopper", ModBlocks.COPPER_HOPPER, new Item.Properties().useBlockDescriptionPrefix().component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));

    public static void init() {}

    private static Supplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, properties -> new BlockItem(blockSupplier.get(), properties), new Item.Properties().useBlockDescriptionPrefix());
    }

    private static Supplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier, Item.Properties properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, itemProperties -> new BlockItem(blockSupplier.get(), itemProperties.useBlockDescriptionPrefix()), properties);
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

    private static Supplier<Item> register(String id, Supplier<Item.Properties> properties) {
        return NemosCopperCommon.REGISTRY_HELPER.registerItem(id, Item::new, properties);
    }
}
