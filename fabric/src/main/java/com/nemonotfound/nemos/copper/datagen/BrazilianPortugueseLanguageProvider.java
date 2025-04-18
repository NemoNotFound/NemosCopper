package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.Items;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class BrazilianPortugueseLanguageProvider extends FabricLanguageProvider {

    public BrazilianPortugueseLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "pt_br", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.COPPER_CHAIN.get(), "Corrente de cobre");
        translationBuilder.add(ModBlocks.COPPER_LANTERN.get(), "Lampião de cobre");
        translationBuilder.add(ModBlocks.COPPER_SOUL_LANTERN.get(), "Lampião das almas de cobre");
        translationBuilder.add(ModBlocks.COPPER_RAIL.get(), "Trilho de cobre");
        translationBuilder.add(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), "Trilho ativador de cobre");
        translationBuilder.add(ModBlocks.COPPER_DETECTOR_RAIL.get(), "Trilho detector de cobre");
        translationBuilder.add(ModBlocks.COPPER_POWERED_RAIL.get(), "Trilho elétrico de cobre");
        translationBuilder.add(Items.COPPER_MINECART.get(), "Carrinho de mina de cobre");
        translationBuilder.add(Items.COPPER_CHEST_MINECART.get(), "Carrinho de mina de cobre com baú");
        translationBuilder.add(Items.COPPER_FURNACE_MINECART.get(), "Carrinho de mina de cobre com fornalha");
        translationBuilder.add(Items.COPPER_TNT_MINECART.get(), "Carrinho de mina de cobre com TNT");
        translationBuilder.add(Items.COPPER_HOPPER_MINECART.get(), "Carrinho de mina de cobre com funil");
        translationBuilder.add(Items.COPPER_COMMAND_BLOCK_MINECART.get(), "Carrinho de mina de cobre com bloco de comando");
        translationBuilder.add(EntityTypes.COPPER_MINECART.get(), "Carrinho de mina de cobre");
        translationBuilder.add(EntityTypes.COPPER_CHEST_MINECART.get(), "Carrinho de mina de cobre com baú");
        translationBuilder.add(EntityTypes.COPPER_FURNACE_MINECART.get(), "Carrinho de mina de cobre com fornalha");
        translationBuilder.add(EntityTypes.COPPER_TNT_MINECART.get(), "Carrinho de mina de cobre com TNT");
        translationBuilder.add(EntityTypes.COPPER_HOPPER_MINECART.get(), "Carrinho de mina de cobre com funil");
        translationBuilder.add(EntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Carrinho de mina de cobre com bloco de comando");
        translationBuilder.add(EntityTypes.COPPER_SPAWNER_MINECART.get(), "Carrinho de mina de cobre com criador de monstros");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(Items.COPPER_SHEARS.get(), "Tesoura de cobre");
        translationBuilder.add(Items.COPPER_PICKAXE.get(), "Picareta de cobre");
        translationBuilder.add(Items.COPPER_AXE.get(), "Machado de cobre");
        translationBuilder.add(Items.COPPER_SHOVEL.get(), "Pá de cobre");
        translationBuilder.add(Items.COPPER_SWORD.get(), "Espada de cobre");
        translationBuilder.add(Items.COPPER_HOE.get(), "Enxada de cobre");
        translationBuilder.add(Items.COPPER_HELMET.get(), "Capacete de cobre");
        translationBuilder.add(Items.COPPER_CHESTPLATE.get(), "Peitoral de cobre");
        translationBuilder.add(Items.COPPER_LEGGINGS.get(), "Calças de cobre");
        translationBuilder.add(Items.COPPER_BOOTS.get(), "Botas de cobre");
        translationBuilder.add(Items.COPPER_NUGGET.get(), "Pepita de cobre");
        translationBuilder.add(Items.COPPER_BUCKET.get(), "Balde de cobre");
        translationBuilder.add(Items.COPPER_WATER_BUCKET.get(), "Balde de Água de Cobre");
        translationBuilder.add(Items.COPPER_COD_BUCKET.get(), "Balde de Bacalhau de Cobre");
        translationBuilder.add(Items.COPPER_SALMON_BUCKET.get(), "Balde de Salmão de Cobre");
        translationBuilder.add(Items.COPPER_TROPICAL_FISH_BUCKET.get(), "Balde de Peixe Tropical de Cobre");
        translationBuilder.add(Items.COPPER_PUFFERFISH_BUCKET.get(), "Balde de Baiacu de Cobre");
        translationBuilder.add(Items.COPPER_AXOLOTL_BUCKET.get(), "Balde de Axolote de Cobre");
        translationBuilder.add(Items.COPPER_TADPOLE_BUCKET.get(), "Balde de Girino de Cobre");
        translationBuilder.add(Items.COPPER_LAVA_BUCKET.get(), "Balde de Lava de Cobre");
        translationBuilder.add(Items.COPPER_POWDER_SNOW_BUCKET.get(), "Balde de Neve Fofa de Cobre");
        translationBuilder.add(Items.COPPER_MILK_BUCKET.get(), "Balde de Leite de Cobre");
    }
}
