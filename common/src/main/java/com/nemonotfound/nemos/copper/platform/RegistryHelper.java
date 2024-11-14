package com.nemonotfound.nemos.copper.platform;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public interface RegistryHelper {

    Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties);
    Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties);
}
