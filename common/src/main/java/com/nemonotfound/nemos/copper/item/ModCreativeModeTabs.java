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
                output.accept(ModItems.COPPER_CHAIN.get());
                output.accept(ModItems.COPPER_LANTERN.get());
                output.accept(ModItems.COPPER_SOUL_LANTERN.get());
                output.accept(ModItems.COPPER_RAIL.get());
                output.accept(ModItems.COPPER_POWERED_RAIL.get());
                output.accept(ModItems.COPPER_DETECTOR_RAIL.get());
                output.accept(ModItems.COPPER_ACTIVATOR_RAIL.get());
                output.accept(ModItems.COPPER_MINECART.get());
                output.accept(ModItems.COPPER_HOPPER_MINECART.get());
                output.accept(ModItems.COPPER_CHEST_MINECART.get());
                output.accept(ModItems.COPPER_FURNACE_MINECART.get());
                output.accept(ModItems.COPPER_TNT_MINECART.get());
                output.accept(ModItems.COPPER_SHOVEL.get());
                output.accept(ModItems.COPPER_PICKAXE.get());
                output.accept(ModItems.COPPER_AXE.get());
                output.accept(ModItems.COPPER_HOE.get());
                output.accept(ModItems.COPPER_SHEARS.get());
                output.accept(ModItems.COPPER_SWORD.get());
                output.accept(ModItems.COPPER_HELMET.get());
                output.accept(ModItems.COPPER_CHESTPLATE.get());
                output.accept(ModItems.COPPER_LEGGINGS.get());
                output.accept(ModItems.COPPER_BOOTS.get());
                output.accept(ModItems.COPPER_NUGGET.get());
                output.accept(ModItems.COPPER_BUCKET.get());
                output.accept(ModItems.WATER_COPPER_BUCKET.get());
                output.accept(ModItems.COD_COPPER_BUCKET.get());
                output.accept(ModItems.SALMON_COPPER_BUCKET.get());
                output.accept(ModItems.TROPICAL_FISH_COPPER_BUCKET.get());
                output.accept(ModItems.PUFFERFISH_COPPER_BUCKET.get());
                output.accept(ModItems.AXOLOTL_COPPER_BUCKET.get());
                output.accept(ModItems.TADPOLE_COPPER_BUCKET.get());
                output.accept(ModItems.LAVA_COPPER_BUCKET.get());
                output.accept(ModItems.POWDER_SNOW_COPPER_BUCKET.get());
                output.accept(ModItems.MILK_COPPER_BUCKET.get());
            })
            .build());

    public static void init() {}
}
