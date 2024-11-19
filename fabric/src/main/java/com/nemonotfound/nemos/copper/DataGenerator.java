package com.nemonotfound.nemos.copper;

import com.nemonotfound.nemos.copper.datagen.EnglishLanguageProvider;
import com.nemonotfound.nemos.copper.datagen.ModRecipeProvider;
import com.nemonotfound.nemos.copper.datagen.ModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
