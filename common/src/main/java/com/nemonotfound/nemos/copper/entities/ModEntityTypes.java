package com.nemonotfound.nemos.copper.entities;

import com.nemonotfound.nemos.copper.Constants;
import com.nemonotfound.nemos.copper.NemosCopperCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.*;

import java.util.function.Supplier;

public class ModEntityTypes {

    public static final Supplier<EntityType<MinecartChest>> COPPER_CHEST_MINECART = register("copper_chest_minecart",
            EntityType.Builder.of(MinecartChest::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<MinecartCommandBlock>> COPPER_COMMAND_BLOCK_MINECART = register("copper_command_block_minecart",
            EntityType.Builder.of(MinecartCommandBlock::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<MinecartFurnace>> COPPER_FURNACE_MINECART = register("copper_furnace_minecart",
            EntityType.Builder.of(MinecartFurnace::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<MinecartHopper>> COPPER_HOPPER_MINECART = register("copper_hopper_minecart",
            EntityType.Builder.of(MinecartHopper::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<Minecart>> COPPER_MINECART = register("copper_minecart",
            EntityType.Builder.of(Minecart::new, MobCategory.MISC)
                    .noLootTable()
                    .sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<MinecartSpawner>> COPPER_SPAWNER_MINECART = register("copper_spawner_minecart",
            EntityType.Builder.of(MinecartSpawner::new, MobCategory.MISC)
                    .noLootTable().sized(0.98F, 0.7F)
                    .passengerAttachments(0.1875F)
                    .clientTrackingRange(8));

    public static final Supplier<EntityType<MinecartTNT>> COPPER_TNT_MINECART = register("copper_tnt_minecart",
            EntityType.Builder.of(MinecartTNT::new, MobCategory.MISC)
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
