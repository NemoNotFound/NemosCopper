package com.devnemo.nemos.copper.datagen.lang;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.copper.datagen.lang.EnglishLanguageProvider.getCopperShieldDescriptionId;

public class BrazilianPortugueseLanguageProvider extends FabricLanguageProvider {

    public BrazilianPortugueseLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "pt_br", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(CopperBlocks.COPPER_CHAIN.get(), "Corrente de Cobre");
        translationBuilder.add(CopperBlocks.COPPER_LANTERN.get(), "Lampião de Cobre");
        translationBuilder.add(CopperBlocks.COPPER_SOUL_LANTERN.get(), "Lampião das almas de Cobre");
        translationBuilder.add(CopperBlocks.COPPER_RAIL.get(), "Trilho de Cobre");
        translationBuilder.add(CopperBlocks.COPPER_ACTIVATOR_RAIL.get(), "Trilho ativador de Cobre");
        translationBuilder.add(CopperBlocks.COPPER_DETECTOR_RAIL.get(), "Trilho detector de Cobre");
        translationBuilder.add(CopperBlocks.COPPER_POWERED_RAIL.get(), "Trilho elétrico de Cobre");
        translationBuilder.add(CopperItems.COPPER_MINECART.get(), "Carrinho de Mina de Cobre");
        translationBuilder.add(CopperItems.COPPER_CHEST_MINECART.get(), "Carrinho de Mina de Cobre com Baú");
        translationBuilder.add(CopperItems.COPPER_FURNACE_MINECART.get(), "Carrinho de Mina de Cobre com Fornalha");
        translationBuilder.add(CopperItems.COPPER_TNT_MINECART.get(), "Carrinho de Mina de Cobre com TNT");
        translationBuilder.add(CopperItems.HOPPER_COPPER_MINECART.get(), "Carrinho de Mina de Cobre com Funil");
        translationBuilder.add(CopperItems.COPPER_HOPPER_COPPER_MINECART.get(), "Carrinho de Mina de Cobre com Funil de Cobre");
        translationBuilder.add(CopperItems.COPPER_HOPPER_MINECART.get(), "Carrinho de Mina com Funil de Cobre");
        translationBuilder.add(CopperItems.COPPER_COMMAND_BLOCK_MINECART.get(), "Carrinho de Mina de Cobre com Bloco de Comando");
        translationBuilder.add(ModEntityTypes.COPPER_MINECART.get(), "Carrinho de Mina de Cobre");
        translationBuilder.add(ModEntityTypes.COPPER_CHEST_MINECART.get(), "Carrinho de Mina de Cobre com Baú");
        translationBuilder.add(ModEntityTypes.COPPER_FURNACE_MINECART.get(), "Carrinho de Mina de Cobre com Fornalha");
        translationBuilder.add(ModEntityTypes.COPPER_TNT_MINECART.get(), "Carrinho de Mina de Cobre com TNT");
        translationBuilder.add(ModEntityTypes.HOPPER_COPPER_MINECART.get(), "Carrinho de Mina de Cobre com Funil");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_COPPER_MINECART.get(), "Carrinho de Mina de Cobre com Funil de Cobre");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_MINECART.get(), "Carrinho de Mina com Funil de Cobre");
        translationBuilder.add(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Carrinho de Mina de Cobre com Bloco de Comando");
        translationBuilder.add(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), "Carrinho de Mina de Cobre com Criador de Monstros");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(CopperItems.COPPER_SHEARS.get(), "Tesoura de Cobre");
        translationBuilder.add(CopperItems.COPPER_PICKAXE.get(), "Picareta de Cobre");
        translationBuilder.add(CopperItems.COPPER_AXE.get(), "Machado de Cobre");
        translationBuilder.add(CopperItems.COPPER_SHOVEL.get(), "Pá de Cobre");
        translationBuilder.add(CopperItems.COPPER_SWORD.get(), "Espada de Cobre");
        translationBuilder.add(CopperItems.COPPER_HOE.get(), "Enxada de Cobre");
        translationBuilder.add(CopperItems.COPPER_HELMET.get(), "Capacete de Cobre");
        translationBuilder.add(CopperItems.COPPER_CHESTPLATE.get(), "Peitoral de Cobre");
        translationBuilder.add(CopperItems.COPPER_LEGGINGS.get(), "Calças de Cobre");
        translationBuilder.add(CopperItems.COPPER_BOOTS.get(), "Botas de Cobre");
        translationBuilder.add(CopperItems.COPPER_NUGGET.get(), "Pepita de Cobre");
        translationBuilder.add(CopperItems.COPPER_BUCKET.get(), "Balde de Cobre");
        translationBuilder.add(CopperItems.COPPER_WATER_BUCKET.get(), "Balde de Água de Cobre");
        translationBuilder.add(CopperItems.COPPER_COD_BUCKET.get(), "Balde de Bacalhau de Cobre");
        translationBuilder.add(CopperItems.COPPER_SALMON_BUCKET.get(), "Balde de Salmão de Cobre");
        translationBuilder.add(CopperItems.COPPER_TROPICAL_FISH_BUCKET.get(), "Balde de Peixe Tropical de Cobre");
        translationBuilder.add(CopperItems.COPPER_PUFFERFISH_BUCKET.get(), "Balde de Baiacu de Cobre");
        translationBuilder.add(CopperItems.COPPER_AXOLOTL_BUCKET.get(), "Balde de Axolote de Cobre");
        translationBuilder.add(CopperItems.COPPER_TADPOLE_BUCKET.get(), "Balde de Girino de Cobre");
        translationBuilder.add(CopperItems.COPPER_LAVA_BUCKET.get(), "Balde de Lava de Cobre");
        translationBuilder.add(CopperItems.COPPER_POWDER_SNOW_BUCKET.get(), "Balde de Neve Fofa de Cobre");
        translationBuilder.add(CopperItems.COPPER_MILK_BUCKET.get(), "Balde de Leite de Cobre");
        translationBuilder.add(CopperItems.COPPER_CAULDRON.get(), "Caldeirão de Cobre");
        translationBuilder.add(CopperItems.COPPER_SHIELD.get(), "Escudo de Cobre");
        translationBuilder.add(getCopperShieldDescriptionId() + ".black", "Escudo de Cobre Preto");
        translationBuilder.add(getCopperShieldDescriptionId() + ".red", "Escudo de Cobre Vermelho");
        translationBuilder.add(getCopperShieldDescriptionId() + ".green", "Escudo de Cobre Verde");
        translationBuilder.add(getCopperShieldDescriptionId() + ".lime", "Escudo de Cobre Verde-limão");
        translationBuilder.add(getCopperShieldDescriptionId() + ".yellow", "Escudo de Cobre Amarelo");
        translationBuilder.add(getCopperShieldDescriptionId() + ".brown", "Escudo de Cobre Marrom");
        translationBuilder.add(getCopperShieldDescriptionId() + ".purple", "Escudo de Cobre Roxo");
        translationBuilder.add(getCopperShieldDescriptionId() + ".light_blue", "Escudo de Cobre Azul-claro");
        translationBuilder.add(getCopperShieldDescriptionId() + ".blue", "Escudo de Cobre Azul");
        translationBuilder.add(getCopperShieldDescriptionId() + ".cyan", "Escudo de Cobre Ciano");
        translationBuilder.add(getCopperShieldDescriptionId() + ".light_gray", "Escudo de Cobre Cinza-claro");
        translationBuilder.add(getCopperShieldDescriptionId() + ".gray", "Escudo de Cobre Cinza");
        translationBuilder.add(getCopperShieldDescriptionId() + ".pink", "Escudo de Cobre Rosa");
        translationBuilder.add(getCopperShieldDescriptionId() + ".magenta", "Escudo de Cobre Magenta");
        translationBuilder.add(getCopperShieldDescriptionId() + ".orange", "Escudo de Cobre Laranja");
        translationBuilder.add(getCopperShieldDescriptionId() + ".white", "Escudo de Cobre Branco");
        translationBuilder.add(CopperItems.COPPER_BARS.get(), "Barras de Cobre");
        translationBuilder.add(CopperItems.COPPER_HOPPER.get(), "Funil de Cobre");
    }
}
