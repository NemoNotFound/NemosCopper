package com.nemonotfound.nemos.copper.item;

import com.nemonotfound.nemos.copper.NemosCopperCommon;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

public class ModCreativeModeTabs {

    public static Supplier<CreativeModeTab> NEMOS_COPPER = NemosCopperCommon.REGISTRY_HELPER.registerCreativeModeTab(MOD_ID, () -> NemosCopperCommon.REGISTRY_HELPER.createCreativeModeTab()
            .title(Component.translatable("itemGroup." + MOD_ID))
            .icon(() -> new ItemStack(ModItems.COPPER_MINECART.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.COPPER_RAIL.get());
                output.accept(ModItems.COPPER_POWERED_RAIL.get());
                output.accept(ModItems.COPPER_DETECTOR_RAIL.get());
                output.accept(ModItems.COPPER_ACTIVATOR_RAIL.get());
                output.accept(ModItems.COPPER_MINECART.get());
                output.accept(ModItems.COPPER_HOPPER_MINECART.get());
                output.accept(ModItems.COPPER_CHEST_MINECART.get());
                output.accept(ModItems.COPPER_FURNACE_MINECART.get());
                output.accept(ModItems.COPPER_TNT_MINECART.get());
                //output.accept(ModItems.COPPER_SHEARS.get());
            })
            .build());

    public static void init() {}
}
