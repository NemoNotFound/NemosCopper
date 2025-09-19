package com.devnemo.nemos.copper.item;

import com.devnemo.nemos.copper.NemosCopperCommon;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static com.devnemo.nemos.copper.Constants.MOD_ID;

public class ModCreativeModeTabs {

    public static Supplier<CreativeModeTab> NEMOS_COPPER = NemosCopperCommon.REGISTRY_HELPER.registerCreativeModeTab(MOD_ID, () -> NemosCopperCommon.REGISTRY_HELPER.createCreativeModeTab()
            .title(Component.translatable("itemGroup." + MOD_ID))
            .icon(() -> new ItemStack(CopperItems.COPPER_MINECART.get()))
            .displayItems((parameters, output) -> {
                output.accept(CopperItems.COPPER_BARS.get());
                output.accept(CopperItems.COPPER_CHAIN.get());
                output.accept(CopperItems.COPPER_LANTERN.get());
                output.accept(CopperItems.COPPER_SOUL_LANTERN.get());
                output.accept(CopperItems.COPPER_CAULDRON.get());
                output.accept(CopperItems.COPPER_HOPPER.get());
                output.accept(CopperItems.COPPER_RAIL.get());
                output.accept(CopperItems.COPPER_POWERED_RAIL.get());
                output.accept(CopperItems.COPPER_DETECTOR_RAIL.get());
                output.accept(CopperItems.COPPER_ACTIVATOR_RAIL.get());
                output.accept(CopperItems.COPPER_HOPPER_MINECART.get());
                output.accept(CopperItems.COPPER_MINECART.get());
                output.accept(CopperItems.HOPPER_COPPER_MINECART.get());
                output.accept(CopperItems.COPPER_HOPPER_COPPER_MINECART.get());
                output.accept(CopperItems.COPPER_CHEST_MINECART.get());
                output.accept(CopperItems.COPPER_FURNACE_MINECART.get());
                output.accept(CopperItems.COPPER_TNT_MINECART.get());
                output.accept(CopperItems.COPPER_SHOVEL.get());
                output.accept(CopperItems.COPPER_PICKAXE.get());
                output.accept(CopperItems.COPPER_AXE.get());
                output.accept(CopperItems.COPPER_HOE.get());
                output.accept(CopperItems.COPPER_SHEARS.get());
                output.accept(CopperItems.COPPER_SWORD.get());
                output.accept(CopperItems.COPPER_SHIELD.get());
                output.accept(CopperItems.COPPER_HELMET.get());
                output.accept(CopperItems.COPPER_CHESTPLATE.get());
                output.accept(CopperItems.COPPER_LEGGINGS.get());
                output.accept(CopperItems.COPPER_BOOTS.get());
                output.accept(CopperItems.COPPER_NUGGET.get());
                output.accept(CopperItems.COPPER_BUCKET.get());
                output.accept(CopperItems.COPPER_WATER_BUCKET.get());
                output.accept(CopperItems.COPPER_COD_BUCKET.get());
                output.accept(CopperItems.COPPER_SALMON_BUCKET.get());
                output.accept(CopperItems.COPPER_TROPICAL_FISH_BUCKET.get());
                output.accept(CopperItems.COPPER_PUFFERFISH_BUCKET.get());
                output.accept(CopperItems.COPPER_AXOLOTL_BUCKET.get());
                output.accept(CopperItems.COPPER_TADPOLE_BUCKET.get());
                output.accept(CopperItems.COPPER_LAVA_BUCKET.get());
                output.accept(CopperItems.COPPER_POWDER_SNOW_BUCKET.get());
                output.accept(CopperItems.COPPER_MILK_BUCKET.get());
            })
            .build());

    public static void init() {}
}