package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.block.ModBlocks;
import com.devnemo.nemos.copper.item.ModItems;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.copper.datagen.EnglishLanguageProvider.getCopperShieldDescriptionId;

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
        translationBuilder.add(ModEntityTypes.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_MINECART.get(), "TrichterKupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), "Spawner-Kupferlore");
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
        translationBuilder.add(ModItems.COPPER_CAULDRON.get(), "Kupferkessel");
        translationBuilder.add(ModItems.COPPER_SHIELD.get(), "Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".black", "Schwarzer Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".red", "Roter Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".green", "Grüner Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".lime", "Hellgrüner Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".yellow", "Gelber Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".brown", "Brauner Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".purple", "Violetter Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".light_blue", "Hellblauer Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".blue", "Blauer Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".cyan", "Türkiser Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".light_gray", "Hellgrauer Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".gray", "Grauer Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".pink", "Rosa Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".magenta", "Magenta Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".orange", "Oranger Kupferschild");
        translationBuilder.add(getCopperShieldDescriptionId() + ".white", "Weißer Kupferschild");
        translationBuilder.add(ModItems.COPPER_BARS.get(), "Kupfergitter");
        translationBuilder.add(ModItems.COPPER_HOPPER.get(), "Kupfertrichter");
    }
}
