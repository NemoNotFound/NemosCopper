package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.Items;
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
        blockStateModelGenerator.registerSimpleFlatItemModel(Items.COPPER_CHAIN.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(Items.COPPER_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_CHEST_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_COMMAND_BLOCK_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_FURNACE_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_HOPPER_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_TNT_MINECART.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_SHEARS.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.WATER_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.COD_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.SALMON_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.TROPICAL_FISH_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.PUFFERFISH_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.AXOLOTL_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.TADPOLE_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.LAVA_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.POWDER_SNOW_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.MILK_COPPER_BUCKET.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateTrimmableItem(Items.COPPER_HELMET.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(Items.COPPER_CHESTPLATE.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(Items.COPPER_LEGGINGS.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(Items.COPPER_BOOTS.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_BOOTS, false);
    }
}
