package com.devnemo.nemos.copper.datagen.lang;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.copper.datagen.lang.EnglishLanguageProvider.getCopperShieldDescriptionId;

public class GermanLanguageProvider extends FabricLanguageProvider {

    public GermanLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(CopperBlocks.COPPER_CHAIN.get(), "Kupferkette");
        translationBuilder.add(CopperBlocks.COPPER_LANTERN.get(), "Kupferlaterne");
        translationBuilder.add(CopperBlocks.COPPER_SOUL_LANTERN.get(), "Kupferseelenlaterne");
        translationBuilder.add(CopperBlocks.COPPER_RAIL.get(), "Kupferschiene");
        translationBuilder.add(CopperBlocks.COPPER_ACTIVATOR_RAIL.get(), "Kupferaktivierungsschiene");
        translationBuilder.add(CopperBlocks.COPPER_DETECTOR_RAIL.get(), "Kupfersensorschiene");
        translationBuilder.add(CopperBlocks.COPPER_POWERED_RAIL.get(), "Kupferantriebsschiene");
        translationBuilder.add(CopperItems.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(CopperItems.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(CopperItems.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(CopperItems.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(CopperItems.HOPPER_COPPER_MINECART.get(), "Trichterkupferlore");
        translationBuilder.add(CopperItems.COPPER_HOPPER_COPPER_MINECART.get(), "Kupfertrichter-Kupferlore");
        translationBuilder.add(CopperItems.COPPER_HOPPER_MINECART.get(), "Kupfertrichterlore");
        translationBuilder.add(CopperItems.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_MINECART.get(), "Kupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_CHEST_MINECART.get(), "Güterkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_FURNACE_MINECART.get(), "Ofenkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_TNT_MINECART.get(), "TNT-Kupferlore");
        translationBuilder.add(ModEntityTypes.HOPPER_COPPER_MINECART.get(), "Trichterkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_COPPER_MINECART.get(), "Kupfertrichter-Kupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_HOPPER_MINECART.get(), "Kupfertrichterlore");
        translationBuilder.add(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get(), "Befehlsblockkupferlore");
        translationBuilder.add(ModEntityTypes.COPPER_SPAWNER_MINECART.get(), "Spawner-Kupferlore");
        translationBuilder.add("itemGroup.nemos_copper", "Nemo's Copper");
        translationBuilder.add(CopperItems.COPPER_SHEARS.get(), "Kupferschere");
        translationBuilder.add(CopperItems.COPPER_PICKAXE.get(), "Kupferspitzhacke");
        translationBuilder.add(CopperItems.COPPER_AXE.get(), "Kupferaxt");
        translationBuilder.add(CopperItems.COPPER_SHOVEL.get(), "Kupferschaufel");
        translationBuilder.add(CopperItems.COPPER_SWORD.get(), "Kupferschwert");
        translationBuilder.add(CopperItems.COPPER_HOE.get(), "Kupferhacke");
        translationBuilder.add(CopperItems.COPPER_HELMET.get(), "Kupferhelm");
        translationBuilder.add(CopperItems.COPPER_CHESTPLATE.get(), "Kupferharnisch");
        translationBuilder.add(CopperItems.COPPER_LEGGINGS.get(), "Kupferbeinschutz");
        translationBuilder.add(CopperItems.COPPER_BOOTS.get(), "Kupferstiefel");
        translationBuilder.add(CopperItems.COPPER_NUGGET.get(), "Kupferklumpen");
        translationBuilder.add(CopperItems.COPPER_BUCKET.get(), "Kupfereimer");
        translationBuilder.add(CopperItems.COPPER_WATER_BUCKET.get(), "Kupferwassereimer");
        translationBuilder.add(CopperItems.COPPER_COD_BUCKET.get(), "Kupferkabeljaueimer");
        translationBuilder.add(CopperItems.COPPER_SALMON_BUCKET.get(), "Kupferlachseimer");
        translationBuilder.add(CopperItems.COPPER_TROPICAL_FISH_BUCKET.get(), "Kupfertropenfischeimer");
        translationBuilder.add(CopperItems.COPPER_PUFFERFISH_BUCKET.get(), "Kupferkugelfischeimer");
        translationBuilder.add(CopperItems.COPPER_AXOLOTL_BUCKET.get(), "Kupferaxolotleimer");
        translationBuilder.add(CopperItems.COPPER_TADPOLE_BUCKET.get(), "Kupferkaulquappeneimer");
        translationBuilder.add(CopperItems.COPPER_LAVA_BUCKET.get(), "Kupferlavaeimer");
        translationBuilder.add(CopperItems.COPPER_POWDER_SNOW_BUCKET.get(), "Kupferpulverschneeeimer");
        translationBuilder.add(CopperItems.COPPER_MILK_BUCKET.get(), "Kupfermilcheimer");
        translationBuilder.add(CopperItems.COPPER_CAULDRON.get(), "Kupferkessel");
        translationBuilder.add(CopperItems.COPPER_SHIELD.get(), "Kupferschild");
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
        translationBuilder.add(CopperItems.COPPER_BARS.get(), "Kupfergitter");
        translationBuilder.add(CopperItems.COPPER_HOPPER.get(), "Kupfertrichter");
    }
}
