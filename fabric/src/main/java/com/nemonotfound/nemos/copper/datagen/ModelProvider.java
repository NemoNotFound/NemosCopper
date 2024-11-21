package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.equipment.EquipmentModel;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createPassiveRail(ModBlocks.COPPER_RAIL.get());
        blockStateModelGenerator.createActiveRail(ModBlocks.COPPER_POWERED_RAIL.get());
        blockStateModelGenerator.createActiveRail(ModBlocks.COPPER_DETECTOR_RAIL.get());
        blockStateModelGenerator.createActiveRail(ModBlocks.COPPER_ACTIVATOR_RAIL.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.COPPER_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_CHEST_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_COMMAND_BLOCK_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_FURNACE_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_HOPPER_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_TNT_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_SHEARS.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateArmorTrims(ModItems.COPPER_HELMET.get(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "copper_helmet"), onlyHumanoid("copper"), EquipmentSlot.HEAD);
        itemModelGenerator.generateArmorTrims(ModItems.COPPER_CHESTPLATE.get(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "copper_chestplate"), onlyHumanoid("copper"), EquipmentSlot.CHEST);
        itemModelGenerator.generateArmorTrims(ModItems.COPPER_LEGGINGS.get(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "copper_leggings"), onlyHumanoid("copper"), EquipmentSlot.LEGS);
        itemModelGenerator.generateArmorTrims(ModItems.COPPER_BOOTS.get(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "copper_boots"), onlyHumanoid("copper"), EquipmentSlot.FEET);
    }

    private static EquipmentModel onlyHumanoid(String string) {
        return EquipmentModel.builder().addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(MOD_ID, string)).build();
    }
}
