package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.world.entity.ModEntityTypes;
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
        translationBuilder.add(ModBlocks.COPPER_CHAIN.get(), "Copper Chain");
        translationBuilder.add(ModBlocks.COPPER_LANTERN.get(), "Copper Lantern");
        translationBuilder.add(ModBlocks.COPPER_SOUL_LANTERN.get(), "Copper Soul Lantern");
        translationBuilder.add(ModBlocks.COPPER_RAIL.get(), "Copper Rail");
        translationBuilder.add(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), "Copper Activator Rail");
        translationBuilder.add(ModBlocks.COPPER_DETECTOR_RAIL.get(), "Copper Detector Rail");
        translationBuilder.add(ModBlocks.COPPER_POWERED_RAIL.get(), "Copper Powered Rail");
        translationBuilder.add(ModItems.COPPER_MINECART.get(), "Copper Minecart");
        translationBuilder.add(ModItems.COPPER_CHEST_MINECART.get(), "Copper Minecart with Chest");
        translationBuilder.add(ModItems.COPPER_FURNACE_MINECART.get(), "Copper Minecart with Furnace");
        translationBuilder.add(ModItems.COPPER_TNT_MINECART.get(), "Copper Minecart with TNT");
        translationBuilder.add(ModItems.COPPER_HOPPER_MINECART.get(), "Copper Minecart with Hopper");
        translationBuilder.add(ModItems.COPPER_COMMAND_BLOCK_MINECART.get(), "Copper Minecart with Command Block");
        translationBuilder.add(ModEntityTypes.COPPER_MINECART.get(), "Copper Minecart");
        translationBuilder.add(ModEntityTypes.COPPER_CHEST_MINECART.get(), "Copper Minecart with Chest");
        translationBuilder.add(ModEntityTypes.COPPER_FURNACE_MINECART.get(), "Copper Minecart with Furnace");
        translationBuilder.add(ModEntityTypes.COPPER_TNT_MINECART.get(), "Copper Minecart with TNT");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_MINECART.get(), "Copper Minecart with Hopper");
        translationBuilder.add(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Copper Minecart with Command Block");
        translationBuilder.add(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), "Copper Minecart with Monster Spawner");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(ModItems.COPPER_SHEARS.get(), "Copper Shears");
        translationBuilder.add(ModItems.COPPER_PICKAXE.get(), "Copper Pickaxe");
        translationBuilder.add(ModItems.COPPER_AXE.get(), "Copper Axe");
        translationBuilder.add(ModItems.COPPER_SHOVEL.get(), "Copper Shovel");
        translationBuilder.add(ModItems.COPPER_SWORD.get(), "Copper Sword");
        translationBuilder.add(ModItems.COPPER_HOE.get(), "Copper Hoe");
        translationBuilder.add(ModItems.COPPER_HELMET.get(), "Copper Helmet");
        translationBuilder.add(ModItems.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        translationBuilder.add(ModItems.COPPER_LEGGINGS.get(), "Copper Leggings");
        translationBuilder.add(ModItems.COPPER_BOOTS.get(), "Copper Boots");
        translationBuilder.add(ModItems.COPPER_NUGGET.get(), "Copper Nugget");
        translationBuilder.add(ModItems.COPPER_BUCKET.get(), "Copper Bucket");
        translationBuilder.add(ModItems.COPPER_WATER_BUCKET.get(), "Copper Water Bucket");
        translationBuilder.add(ModItems.COPPER_COD_BUCKET.get(), "Copper Cod Bucket");
        translationBuilder.add(ModItems.COPPER_SALMON_BUCKET.get(), "Copper Salmon Bucket");
        translationBuilder.add(ModItems.COPPER_TROPICAL_FISH_BUCKET.get(), "Copper Tropical Fish Bucket");
        translationBuilder.add(ModItems.COPPER_PUFFERFISH_BUCKET.get(), "Copper Pufferfish Bucket");
        translationBuilder.add(ModItems.COPPER_AXOLOTL_BUCKET.get(), "Copper Axolotl Bucket");
        translationBuilder.add(ModItems.COPPER_TADPOLE_BUCKET.get(), "Copper Tadpole Bucket");
        translationBuilder.add(ModItems.COPPER_LAVA_BUCKET.get(), "Copper Lava Bucket");
        translationBuilder.add(ModItems.COPPER_POWDER_SNOW_BUCKET.get(), "Copper Powder Snow Bucket");
        translationBuilder.add(ModItems.COPPER_MILK_BUCKET.get(), "Copper Milk Bucket");
        translationBuilder.add(ModItems.COPPER_CAULDRON.get(), "Copper Cauldron");
        translationBuilder.add(ModItems.COPPER_SHIELD.get(), "Copper Shield");
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
        translationBuilder.add(ModItems.COPPER_BARS.get(), "Copper Bars");
    }

    public static String getCopperShieldDescriptionId() {
        return ModItems.COPPER_SHIELD.get().getDescriptionId();
    }
}
