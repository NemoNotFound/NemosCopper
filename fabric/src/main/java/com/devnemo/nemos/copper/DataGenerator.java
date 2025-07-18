package com.devnemo.nemos.copper;

import com.devnemo.nemos.copper.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelProvider::new);
        pack.addProvider(GermanLanguageProvider::new);
        pack.addProvider(BrazilianPortugueseLanguageProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(BlockLootTableProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
    }
}
