package com.nemonotfound.nemos.copper;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class NemosCopperForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Constants.MOD_ID);

    public NemosCopperForge(FMLJavaModLoadingContext context) {
        final IEventBus modEventBus = context.getModEventBus();
        NemosCopperCommon.init();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }
}