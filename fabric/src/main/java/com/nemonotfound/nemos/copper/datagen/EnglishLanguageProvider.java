package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.Items;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
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
        translationBuilder.add(Items.COPPER_MINECART.get(), "Copper Minecart");
        translationBuilder.add(Items.COPPER_CHEST_MINECART.get(), "Copper Minecart with Chest");
        translationBuilder.add(Items.COPPER_FURNACE_MINECART.get(), "Copper Minecart with Furnace");
        translationBuilder.add(Items.COPPER_TNT_MINECART.get(), "Copper Minecart with TNT");
        translationBuilder.add(Items.COPPER_HOPPER_MINECART.get(), "Copper Minecart with Hopper");
        translationBuilder.add(Items.COPPER_COMMAND_BLOCK_MINECART.get(), "Copper Minecart with Command Block");
        translationBuilder.add(EntityTypes.COPPER_MINECART.get(), "Copper Minecart");
        translationBuilder.add(EntityTypes.COPPER_CHEST_MINECART.get(), "Copper Minecart with Chest");
        translationBuilder.add(EntityTypes.COPPER_FURNACE_MINECART.get(), "Copper Minecart with Furnace");
        translationBuilder.add(EntityTypes.COPPER_TNT_MINECART.get(), "Copper Minecart with TNT");
        translationBuilder.add(EntityTypes.COPPER_HOPPER_MINECART.get(), "Copper Minecart with Hopper");
        translationBuilder.add(EntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Copper Minecart with Command Block");
        translationBuilder.add(EntityTypes.COPPER_SPAWNER_MINECART.get(), "Copper Minecart with Monster Spawner");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(Items.COPPER_SHEARS.get(), "Copper Shears");
        translationBuilder.add(Items.COPPER_PICKAXE.get(), "Copper Pickaxe");
        translationBuilder.add(Items.COPPER_AXE.get(), "Copper Axe");
        translationBuilder.add(Items.COPPER_SHOVEL.get(), "Copper Shovel");
        translationBuilder.add(Items.COPPER_SWORD.get(), "Copper Sword");
        translationBuilder.add(Items.COPPER_HOE.get(), "Copper Hoe");
        translationBuilder.add(Items.COPPER_HELMET.get(), "Copper Helmet");
        translationBuilder.add(Items.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        translationBuilder.add(Items.COPPER_LEGGINGS.get(), "Copper Leggings");
        translationBuilder.add(Items.COPPER_BOOTS.get(), "Copper Boots");
        translationBuilder.add(Items.COPPER_NUGGET.get(), "Copper Nugget");
        translationBuilder.add(Items.COPPER_BUCKET.get(), "Copper Bucket");
        //ToDo: Add translation for other buckets
    }
}
