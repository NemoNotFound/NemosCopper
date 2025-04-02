package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.item.equipment.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;
import static net.minecraft.client.data.models.ItemModelGenerators.*;

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
        blockStateModelGenerator.createLantern(ModBlocks.COPPER_LANTERN.get());
        blockStateModelGenerator.createLantern(ModBlocks.COPPER_SOUL_LANTERN.get());
        blockStateModelGenerator.createAxisAlignedPillarBlockCustomModel(ModBlocks.COPPER_CHAIN.get(), plainVariant(ModelLocationUtils.getModelLocation(ModBlocks.COPPER_CHAIN.get())));
        blockStateModelGenerator.registerSimpleFlatItemModel(ModItems.COPPER_CHAIN.get());
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
        itemModelGenerator.generateFlatItem(ModItems.COPPER_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WATER_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COD_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SALMON_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TROPICAL_FISH_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PUFFERFISH_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AXOLOTL_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TADPOLE_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.LAVA_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.POWDER_SNOW_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MILK_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_HELMET.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_CHESTPLATE.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_LEGGINGS.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_BOOTS.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_BOOTS, false);
    }
}
