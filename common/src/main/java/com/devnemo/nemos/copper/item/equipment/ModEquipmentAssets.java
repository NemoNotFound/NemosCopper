package com.devnemo.nemos.copper.item.equipment;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

import static com.devnemo.nemos.copper.Constants.MOD_ID;

public interface ModEquipmentAssets {

    ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset"));
    ResourceKey<EquipmentAsset> COPPER = createId("copper");

    static ResourceKey<EquipmentAsset> createId(String string) {
        return ResourceKey.create(ROOT_ID, ResourceLocation.fromNamespaceAndPath(MOD_ID, string));
    }
}
