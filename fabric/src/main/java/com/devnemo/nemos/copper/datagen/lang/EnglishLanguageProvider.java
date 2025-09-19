package com.devnemo.nemos.copper.datagen.lang;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(CopperBlocks.COPPER_CHAIN.get(), "Copper Chain");
        translationBuilder.add(CopperBlocks.COPPER_LANTERN.get(), "Copper Lantern");
        translationBuilder.add(CopperBlocks.COPPER_SOUL_LANTERN.get(), "Copper Soul Lantern");
        translationBuilder.add(CopperBlocks.COPPER_RAIL.get(), "Copper Rail");
        translationBuilder.add(CopperBlocks.COPPER_ACTIVATOR_RAIL.get(), "Copper Activator Rail");
        translationBuilder.add(CopperBlocks.COPPER_DETECTOR_RAIL.get(), "Copper Detector Rail");
        translationBuilder.add(CopperBlocks.COPPER_POWERED_RAIL.get(), "Copper Powered Rail");
        translationBuilder.add(CopperItems.COPPER_MINECART.get(), "Copper Minecart");
        translationBuilder.add(CopperItems.COPPER_CHEST_MINECART.get(), "Copper Minecart with Chest");
        translationBuilder.add(CopperItems.COPPER_FURNACE_MINECART.get(), "Copper Minecart with Furnace");
        translationBuilder.add(CopperItems.COPPER_TNT_MINECART.get(), "Copper Minecart with TNT");
        translationBuilder.add(CopperItems.HOPPER_COPPER_MINECART.get(), "Copper Minecart with Hopper");
        translationBuilder.add(CopperItems.COPPER_HOPPER_COPPER_MINECART.get(), "Copper Minecart with Copper Hopper");
        translationBuilder.add(CopperItems.COPPER_HOPPER_MINECART.get(), "Minecart with Copper Hopper");
        translationBuilder.add(CopperItems.COPPER_COMMAND_BLOCK_MINECART.get(), "Copper Minecart with Command Block");
        translationBuilder.add(ModEntityTypes.COPPER_MINECART.get(), "Copper Minecart");
        translationBuilder.add(ModEntityTypes.COPPER_CHEST_MINECART.get(), "Copper Minecart with Chest");
        translationBuilder.add(ModEntityTypes.COPPER_FURNACE_MINECART.get(), "Copper Minecart with Furnace");
        translationBuilder.add(ModEntityTypes.COPPER_TNT_MINECART.get(), "Copper Minecart with TNT");
        translationBuilder.add(ModEntityTypes.HOPPER_COPPER_MINECART.get(), "Copper Minecart with Hopper");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_COPPER_MINECART.get(), "Copper Minecart with Copper Hopper");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_MINECART.get(), "Minecart with Copper Hopper");
        translationBuilder.add(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Copper Minecart with Command Block");
        translationBuilder.add(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), "Copper Minecart with Monster Spawner");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(CopperItems.COPPER_SHEARS.get(), "Copper Shears");
        translationBuilder.add(CopperItems.COPPER_PICKAXE.get(), "Copper Pickaxe");
        translationBuilder.add(CopperItems.COPPER_AXE.get(), "Copper Axe");
        translationBuilder.add(CopperItems.COPPER_SHOVEL.get(), "Copper Shovel");
        translationBuilder.add(CopperItems.COPPER_SWORD.get(), "Copper Sword");
        translationBuilder.add(CopperItems.COPPER_HOE.get(), "Copper Hoe");
        translationBuilder.add(CopperItems.COPPER_HELMET.get(), "Copper Helmet");
        translationBuilder.add(CopperItems.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        translationBuilder.add(CopperItems.COPPER_LEGGINGS.get(), "Copper Leggings");
        translationBuilder.add(CopperItems.COPPER_BOOTS.get(), "Copper Boots");
        translationBuilder.add(CopperItems.COPPER_NUGGET.get(), "Copper Nugget");
        translationBuilder.add(CopperItems.COPPER_BUCKET.get(), "Copper Bucket");
        translationBuilder.add(CopperItems.COPPER_WATER_BUCKET.get(), "Copper Water Bucket");
        translationBuilder.add(CopperItems.COPPER_COD_BUCKET.get(), "Copper Cod Bucket");
        translationBuilder.add(CopperItems.COPPER_SALMON_BUCKET.get(), "Copper Salmon Bucket");
        translationBuilder.add(CopperItems.COPPER_TROPICAL_FISH_BUCKET.get(), "Copper Tropical Fish Bucket");
        translationBuilder.add(CopperItems.COPPER_PUFFERFISH_BUCKET.get(), "Copper Pufferfish Bucket");
        translationBuilder.add(CopperItems.COPPER_AXOLOTL_BUCKET.get(), "Copper Axolotl Bucket");
        translationBuilder.add(CopperItems.COPPER_TADPOLE_BUCKET.get(), "Copper Tadpole Bucket");
        translationBuilder.add(CopperItems.COPPER_LAVA_BUCKET.get(), "Copper Lava Bucket");
        translationBuilder.add(CopperItems.COPPER_POWDER_SNOW_BUCKET.get(), "Copper Powder Snow Bucket");
        translationBuilder.add(CopperItems.COPPER_MILK_BUCKET.get(), "Copper Milk Bucket");
        translationBuilder.add(CopperItems.COPPER_CAULDRON.get(), "Copper Cauldron");
        translationBuilder.add(CopperItems.COPPER_SHIELD.get(), "Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".black", "Black Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".red", "Red Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".green", "Green Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".lime", "Lime Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".yellow", "Yellow Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".brown", "Brown Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".purple", "Purple Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".light_blue", "Light Blue Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".blue", "Blue Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".cyan", "Cyan Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".light_gray", "Light Gray Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".gray", "Gray Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".pink", "Pink Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".magenta", "Magenta Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".orange", "Orange Copper Shield");
        translationBuilder.add(getCopperShieldDescriptionId() + ".white", "White Copper Shield");
        translationBuilder.add(CopperItems.COPPER_BARS.get(), "Copper Bars");
        translationBuilder.add(CopperItems.COPPER_HOPPER.get(), "Copper Hopper");
    }

    public static String getCopperShieldDescriptionId() {
        return CopperItems.COPPER_SHIELD.get().getDescriptionId();
    }
}
