package com.nemonotfound.nemos.copper;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class NemosCopperNeoForge {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Constants.MOD_ID);

    public NemosCopperNeoForge(IEventBus eventBus) {
        NemosCopperCommon.init();

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}