package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.entities.ModEntityTypes;
import com.nemonotfound.nemos.copper.item.ModItems;
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
        translationBuilder.add(ModItems.COPPER_MINECART.get(), "Carrinho de mina de cobre");
        translationBuilder.add(ModItems.COPPER_CHEST_MINECART.get(), "Carrinho de mina de cobre com baú");
        translationBuilder.add(ModItems.COPPER_FURNACE_MINECART.get(), "Carrinho de mina de cobre com fornalha");
        translationBuilder.add(ModItems.COPPER_TNT_MINECART.get(), "Carrinho de mina de cobre com TNT");
        translationBuilder.add(ModItems.COPPER_HOPPER_MINECART.get(), "Carrinho de mina de cobre com funil");
        translationBuilder.add(ModItems.COPPER_COMMAND_BLOCK_MINECART.get(), "Carrinho de mina de cobre com bloco de comando");
        translationBuilder.add(ModEntityTypes.COPPER_MINECART.get(), "Carrinho de mina de cobre");
        translationBuilder.add(ModEntityTypes.COPPER_CHEST_MINECART.get(), "Carrinho de mina de cobre com baú");
        translationBuilder.add(ModEntityTypes.COPPER_FURNACE_MINECART.get(), "Carrinho de mina de cobre com fornalha");
        translationBuilder.add(ModEntityTypes.COPPER_TNT_MINECART.get(), "Carrinho de mina de cobre com TNT");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_MINECART.get(), "Carrinho de mina de cobre com funil");
        translationBuilder.add(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Carrinho de mina de cobre com bloco de comando");
        translationBuilder.add(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), "Carrinho de mina de cobre com criador de monstros");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(ModItems.COPPER_SHEARS.get(), "Tesoura de cobre");
        translationBuilder.add(ModItems.COPPER_PICKAXE.get(), "Picareta de cobre");
        translationBuilder.add(ModItems.COPPER_AXE.get(), "Machado de cobre");
        translationBuilder.add(ModItems.COPPER_SHOVEL.get(), "Pá de cobre");
        translationBuilder.add(ModItems.COPPER_SWORD.get(), "Espada de cobre");
        translationBuilder.add(ModItems.COPPER_HOE.get(), "Enxada de cobre");
        translationBuilder.add(ModItems.COPPER_HELMET.get(), "Capacete de cobre");
        translationBuilder.add(ModItems.COPPER_CHESTPLATE.get(), "Peitoral de cobre");
        translationBuilder.add(ModItems.COPPER_LEGGINGS.get(), "Calças de cobre");
        translationBuilder.add(ModItems.COPPER_BOOTS.get(), "Botas de cobre");
        translationBuilder.add(ModItems.COPPER_NUGGET.get(), "Pepita de cobre");
        translationBuilder.add(ModItems.COPPER_BUCKET.get(), "Balde de cobre");
    }
}
