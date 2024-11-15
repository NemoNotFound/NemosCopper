package com.nemonotfound.nemos.copper.platform;

import com.nemonotfound.nemos.copper.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class RegistryHelperFabric implements RegistryHelper {

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return registerSupplierWithResourceKey(BuiltInRegistries.BLOCK, id, key -> function.apply(properties.setId(key)));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return registerSupplierWithResourceKey(BuiltInRegistries.ITEM, id, key -> function.apply(properties.setId(key)));
    }

    @Override
    public <T extends Entity> Supplier<EntityType<T>> registerEntity(String id, Supplier<EntityType<T>> entity) {
        return registerSupplier(BuiltInRegistries.ENTITY_TYPE, id, entity);
    }

    private static <T, R extends Registry<? super T>> Supplier<T> registerSupplier(R registry, String id, Supplier<T> object) {
        final ResourceLocation resourceLocation = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, id);
        final T registeredObject = Registry.register((Registry<T>) registry, resourceLocation, object.get());

        return () -> registeredObject;
    }

    private static <T, R extends Registry<T>> Supplier<T> registerSupplierWithResourceKey(R registry, String id, Function<ResourceKey<T>, T> object) {
        final ResourceLocation resourceLocation = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, id);
        final T registeredObject = Registry.register(registry, resourceLocation, object.apply(ResourceKey.create(registry.key(), resourceLocation)));

        return () -> registeredObject;
    }
}
