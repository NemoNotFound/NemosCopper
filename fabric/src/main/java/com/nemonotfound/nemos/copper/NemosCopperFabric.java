package com.nemonotfound.nemos.copper;

import net.fabricmc.api.ModInitializer;

public class NemosCopperFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCopperCommon.init();
    }
}
