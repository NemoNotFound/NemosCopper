package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.Items;
import com.nemonotfound.nemos.copper.world.entity.EntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class GermanLanguageProvider extends FabricLanguageProvider {

    public GermanLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.COPPER_CHAIN.get(), "Kupferkette");
        translationBuilder.add(ModBlocks.COPPER_LANTERN.get(), "Kupferlaterne");
        translationBuilder.add(ModBlocks.COPPER_SOUL_LANTERN.get(), "Kupferseelenlaterne");
        translationBuilder.add(ModBlocks.COPPER_RAIL.get(), "Kupferschiene");
        translationBuilder.add(ModBlocks.COPPER_ACTIVATOR_RAIL.get(), "Kupferaktivierungsschiene");
        translationBuilder.add(ModBlocks.COPPER_DETECTOR_RAIL.get(), "Kupfersensorschiene");
        translationBuilder.add(ModBlocks.COPPER_POWERED_RAIL.get(), "Kupferantriebsschiene");
        translationBuilder.add(Items.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(Items.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(Items.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(Items.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(Items.COPPER_HOPPER_MINECART.get(), "Trichterkupferlore");
        translationBuilder.add(Items.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(EntityTypes.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(EntityTypes.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(EntityTypes.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(EntityTypes.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(EntityTypes.COPPER_HOPPER_MINECART.get(), "TrichterKupferlore");
        translationBuilder.add(EntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(EntityTypes.COPPER_SPAWNER_MINECART.get(), "Spawner-Kupferlore");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(Items.COPPER_SHEARS.get(), "Kupferschere");
        translationBuilder.add(Items.COPPER_PICKAXE.get(), "Kupferspitzhacke");
        translationBuilder.add(Items.COPPER_AXE.get(), "Kupferaxt");
        translationBuilder.add(Items.COPPER_SHOVEL.get(), "Kupferschaufel");
        translationBuilder.add(Items.COPPER_SWORD.get(), "Kupferschwert");
        translationBuilder.add(Items.COPPER_HOE.get(), "Kupferhacke");
        translationBuilder.add(Items.COPPER_HELMET.get(), "Kupferhelm");
        translationBuilder.add(Items.COPPER_CHESTPLATE.get(), "Kupferharnisch");
        translationBuilder.add(Items.COPPER_LEGGINGS.get(), "Kupferbeinschutz");
        translationBuilder.add(Items.COPPER_BOOTS.get(), "Kupferstiefel");
        translationBuilder.add(Items.COPPER_NUGGET.get(), "Kupferklumpen");
        translationBuilder.add(Items.COPPER_BUCKET.get(), "Kupfereimer");
    }
}
