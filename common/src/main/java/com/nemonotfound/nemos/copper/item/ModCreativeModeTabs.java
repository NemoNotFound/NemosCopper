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
            .icon(() -> new ItemStack(Items.COPPER_MINECART.get()))
            .displayItems((parameters, output) -> {
                output.accept(Items.COPPER_CHAIN.get());
                output.accept(Items.COPPER_LANTERN.get());
                output.accept(Items.COPPER_SOUL_LANTERN.get());
                output.accept(Items.COPPER_RAIL.get());
                output.accept(Items.COPPER_POWERED_RAIL.get());
                output.accept(Items.COPPER_DETECTOR_RAIL.get());
                output.accept(Items.COPPER_ACTIVATOR_RAIL.get());
                output.accept(Items.COPPER_MINECART.get());
                output.accept(Items.COPPER_HOPPER_MINECART.get());
                output.accept(Items.COPPER_CHEST_MINECART.get());
                output.accept(Items.COPPER_FURNACE_MINECART.get());
                output.accept(Items.COPPER_TNT_MINECART.get());
                output.accept(Items.COPPER_SHOVEL.get());
                output.accept(Items.COPPER_PICKAXE.get());
                output.accept(Items.COPPER_AXE.get());
                output.accept(Items.COPPER_HOE.get());
                output.accept(Items.COPPER_SHEARS.get());
                output.accept(Items.COPPER_SWORD.get());
                output.accept(Items.COPPER_HELMET.get());
                output.accept(Items.COPPER_CHESTPLATE.get());
                output.accept(Items.COPPER_LEGGINGS.get());
                output.accept(Items.COPPER_BOOTS.get());
                output.accept(Items.COPPER_NUGGET.get());
                output.accept(Items.COPPER_BUCKET.get());
                output.accept(Items.COPPER_WATER_BUCKET.get());
                output.accept(Items.COPPER_COD_BUCKET.get());
                output.accept(Items.COPPER_SALMON_BUCKET.get());
                output.accept(Items.COPPER_TROPICAL_FISH_BUCKET.get());
                output.accept(Items.COPPER_PUFFERFISH_BUCKET.get());
                output.accept(Items.COPPER_AXOLOTL_BUCKET.get());
                output.accept(Items.COPPER_TADPOLE_BUCKET.get());
                output.accept(Items.COPPER_LAVA_BUCKET.get());
                output.accept(Items.COPPER_POWDER_SNOW_BUCKET.get());
                output.accept(Items.COPPER_MILK_BUCKET.get());
            })
            .build());

    public static void init() {}
}
