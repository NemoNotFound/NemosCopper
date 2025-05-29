package com.nemonotfound.nemos.copper.world.entity;

import com.nemonotfound.nemos.copper.Constants;
import com.nemonotfound.nemos.copper.NemosCopperCommon;
import com.nemonotfound.nemos.copper.world.entity.vehicle.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class ModEntityTypes {

    public static final Supplier<EntityType<CopperMinecartChest>> COPPER_CHEST_MINECART = register("copper_chest_minecart",
            EntityType.Builder.of(CopperMinecartChest::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<CopperMinecartCommandBlock>> COPPER_COMMAND_BLOCK_MINECART = register("copper_command_block_minecart",
            EntityType.Builder.of(CopperMinecartCommandBlock::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<CopperMinecartFurnace>> COPPER_FURNACE_MINECART = register("copper_furnace_minecart",
            EntityType.Builder.of(CopperMinecartFurnace::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<CopperMinecartHopper>> COPPER_HOPPER_MINECART = register("copper_hopper_minecart",
            EntityType.Builder.of(CopperMinecartHopper::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<CopperMinecart>> COPPER_MINECART = register("copper_minecart",
            EntityType.Builder.of(CopperMinecart::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<CopperMinecartSpawner>> COPPER_SPAWNER_MINECART = register("copper_spawner_minecart",
            EntityType.Builder.of(CopperMinecartSpawner::new, MobCategory.MISC)
                    .noLootTable().sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<CopperMinecartTNT>> COPPER_TNT_MINECART = register("copper_tnt_minecart",
            EntityType.Builder.of(CopperMinecartTNT::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static void init() {}

    private static <T extends Entity> Supplier<EntityType<T>> register(String name, EntityType.Builder<T> entityTypeBuilder) {
        return NemosCopperCommon.REGISTRY_HELPER.registerEntity(name, () -> entityTypeBuilder.build(
                ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name))));
    }
}
