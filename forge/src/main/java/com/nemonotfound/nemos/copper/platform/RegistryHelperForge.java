package com.nemonotfound.nemos.copper.platform;

import com.nemonotfound.nemos.copper.Constants;
import com.nemonotfound.nemos.copper.NemosCopperForge;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class RegistryHelperForge implements RegistryHelper {

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return NemosCopperForge.BLOCKS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.BLOCK, id))));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return NemosCopperForge.ITEMS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.ITEM, id))));
    }

    @Override
    public <T extends Entity> Supplier<EntityType<T>> registerEntity(String id, Supplier<EntityType<T>> entity) {
        return NemosCopperForge.ENTITIES.register(id, entity);
    }

    private static <T> ResourceKey<T> createResourceKey(ResourceKey<Registry<T>> registryResourceKey, String id) {
        return ResourceKey.create(registryResourceKey, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, id));
    }
}
