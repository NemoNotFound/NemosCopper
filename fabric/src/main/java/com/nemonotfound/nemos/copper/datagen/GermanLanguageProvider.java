package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
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
        translationBuilder.add(ModItems.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(ModItems.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(ModItems.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(ModItems.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(ModItems.COPPER_HOPPER_MINECART.get(), "Trichterkupferlore");
        translationBuilder.add(ModItems.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(EntityTypes.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(EntityTypes.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(EntityTypes.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(EntityTypes.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(EntityTypes.COPPER_HOPPER_MINECART.get(), "TrichterKupferlore");
        translationBuilder.add(EntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(EntityTypes.COPPER_SPAWNER_MINECART.get(), "Spawner-Kupferlore");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(ModItems.COPPER_SHEARS.get(), "Kupferschere");
        translationBuilder.add(ModItems.COPPER_PICKAXE.get(), "Kupferspitzhacke");
        translationBuilder.add(ModItems.COPPER_AXE.get(), "Kupferaxt");
        translationBuilder.add(ModItems.COPPER_SHOVEL.get(), "Kupferschaufel");
        translationBuilder.add(ModItems.COPPER_SWORD.get(), "Kupferschwert");
        translationBuilder.add(ModItems.COPPER_HOE.get(), "Kupferhacke");
        translationBuilder.add(ModItems.COPPER_HELMET.get(), "Kupferhelm");
        translationBuilder.add(ModItems.COPPER_CHESTPLATE.get(), "Kupferharnisch");
        translationBuilder.add(ModItems.COPPER_LEGGINGS.get(), "Kupferbeinschutz");
        translationBuilder.add(ModItems.COPPER_BOOTS.get(), "Kupferstiefel");
        translationBuilder.add(ModItems.COPPER_NUGGET.get(), "Kupferklumpen");
        translationBuilder.add(ModItems.COPPER_BUCKET.get(), "Kupfereimer");
        translationBuilder.add(ModItems.COPPER_WATER_BUCKET.get(), "Kupferwassereimer");
        translationBuilder.add(ModItems.COPPER_COD_BUCKET.get(), "Kupferkabeljaueimer");
        translationBuilder.add(ModItems.COPPER_SALMON_BUCKET.get(), "Kupferlachseimer");
        translationBuilder.add(ModItems.COPPER_TROPICAL_FISH_BUCKET.get(), "Kupfertropenfischeimer");
        translationBuilder.add(ModItems.COPPER_PUFFERFISH_BUCKET.get(), "Kupferkugelfischeimer");
        translationBuilder.add(ModItems.COPPER_AXOLOTL_BUCKET.get(), "Kupferaxolotleimer");
        translationBuilder.add(ModItems.COPPER_TADPOLE_BUCKET.get(), "Kupferkaulquappeneimer");
        translationBuilder.add(ModItems.COPPER_LAVA_BUCKET.get(), "Kupferlavaeimer");
        translationBuilder.add(ModItems.COPPER_POWDER_SNOW_BUCKET.get(), "Kupferpulverschneeeimer");
        translationBuilder.add(ModItems.COPPER_MILK_BUCKET.get(), "Kupfermilcheimer");
        translationBuilder.add(ModItems.COPPER_CAULDRON.get(), "Copper Cauldron");
    }
}
