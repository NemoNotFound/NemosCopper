package com.devnemo.nemos.copper.item.equipment;

import com.devnemo.nemos.copper.tag.ModItemTags;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

public interface ModArmorMaterials {

    ArmorMaterial COPPER = new ArmorMaterial(15, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 4);
    }), 18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            ModItemTags.REPAIRS_COPPER_ARMOR,  ModEquipmentAssets.COPPER);
}
