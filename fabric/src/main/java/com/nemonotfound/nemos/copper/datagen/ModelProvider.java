package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.client.data.models.model.TextureMappings;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.item.equipment.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.special.ShieldSpecialRenderer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static com.nemonotfound.nemos.copper.client.data.models.model.ModelTemplates.*;
import static net.minecraft.client.data.models.BlockModelGenerators.*;
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

        createCauldrons(blockStateModelGenerator);
        createIronBars(blockStateModelGenerator, ModBlocks.COPPER_BARS.get());
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
        itemModelGenerator.generateFlatItem(ModItems.COPPER_WATER_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_COD_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_SALMON_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_TROPICAL_FISH_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_PUFFERFISH_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_AXOLOTL_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_TADPOLE_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_LAVA_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_POWDER_SNOW_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_MILK_BUCKET.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_HELMET.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_CHESTPLATE.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_LEGGINGS.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.COPPER_BOOTS.get(), ModEquipmentAssets.COPPER, TRIM_PREFIX_BOOTS, false);

        generateCustomShield(itemModelGenerator, ModItems.COPPER_SHIELD.get());
    }

    private void createCauldrons(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.registerSimpleFlatItemModel(ModItems.COPPER_CAULDRON.get());
        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.COPPER_CAULDRON.get());
        blockModelGenerators.blockStateOutput.accept(
                createSimpleBlock(
                        ModBlocks.COPPER_LAVA_CAULDRON.get(),
                        plainVariant(
                                COPPER_CAULDRON_FULL.create(
                                        ModBlocks.COPPER_LAVA_CAULDRON.get(),
                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.LAVA, "_still")),
                                        blockModelGenerators.modelOutput)
                        )
                )
        );
        blockModelGenerators.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(ModBlocks.COPPER_WATER_CAULDRON.get())
                        .with(
                                PropertyDispatch.initial(LayeredCauldronBlock.LEVEL)
                                        .select(
                                                1,
                                                plainVariant(
                                                        COPPER_CAULDRON_LEVEL1
                                                                .createWithSuffix(
                                                                        ModBlocks.COPPER_WATER_CAULDRON.get(),
                                                                        "_level1",
                                                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.WATER, "_still")),
                                                                        blockModelGenerators.modelOutput)
                                                )
                                        )
                                        .select(
                                                2,
                                                plainVariant(
                                                        COPPER_CAULDRON_LEVEL2
                                                                .createWithSuffix(
                                                                        ModBlocks.COPPER_WATER_CAULDRON.get(),
                                                                        "_level2",
                                                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.WATER, "_still")),
                                                                        blockModelGenerators.modelOutput)
                                                )
                                        )
                                        .select(
                                                3,
                                                plainVariant(
                                                        COPPER_CAULDRON_FULL
                                                                .createWithSuffix(
                                                                        ModBlocks.COPPER_WATER_CAULDRON.get(),
                                                                        "_full",
                                                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.WATER, "_still")),
                                                                        blockModelGenerators.modelOutput)
                                                )
                                        )
                        )
        );
        blockModelGenerators.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get())
                        .with(
                                PropertyDispatch.initial(LayeredCauldronBlock.LEVEL)
                                        .select(
                                                1,
                                                plainVariant(
                                                        COPPER_CAULDRON_LEVEL1
                                                                .createWithSuffix(
                                                                        ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get(),
                                                                        "_level1",
                                                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.POWDER_SNOW)),
                                                                        blockModelGenerators.modelOutput
                                                                )
                                                )
                                        )
                                        .select(
                                                2,
                                                plainVariant(
                                                        COPPER_CAULDRON_LEVEL2
                                                                .createWithSuffix(
                                                                        ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get(),
                                                                        "_level2",
                                                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.POWDER_SNOW)),
                                                                        blockModelGenerators.modelOutput
                                                                )
                                                )
                                        )
                                        .select(
                                                3,
                                                plainVariant(
                                                        COPPER_CAULDRON_FULL
                                                                .createWithSuffix(
                                                                        ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get(),
                                                                        "_full",
                                                                        TextureMappings.cauldron(TextureMapping.getBlockTexture(Blocks.POWDER_SNOW)),
                                                                        blockModelGenerators.modelOutput)
                                                )
                                        )
                        )
        );
    }

    private void createIronBars(BlockModelGenerators blockModelGenerators, Block block) {
        MultiVariant multiVariant = plainVariant(ModelLocationUtils.getModelLocation(block, "_post_ends"));
        MultiVariant multiVariant2 = plainVariant(ModelLocationUtils.getModelLocation(block, "_post"));
        MultiVariant multiVariant3 = plainVariant(ModelLocationUtils.getModelLocation(block, "_cap"));
        MultiVariant multiVariant4 = plainVariant(ModelLocationUtils.getModelLocation(block, "_cap_alt"));
        MultiVariant multiVariant5 = plainVariant(ModelLocationUtils.getModelLocation(block, "_side"));
        MultiVariant multiVariant6 = plainVariant(ModelLocationUtils.getModelLocation(block, "_side_alt"));
        blockModelGenerators.blockStateOutput.accept(MultiPartGenerator.multiPart(block).with(multiVariant).with(condition().term(BlockStateProperties.NORTH, false).term(BlockStateProperties.EAST, false).term(BlockStateProperties.SOUTH, false).term(BlockStateProperties.WEST, false), multiVariant2).with(condition().term(BlockStateProperties.NORTH, true).term(BlockStateProperties.EAST, false).term(BlockStateProperties.SOUTH, false).term(BlockStateProperties.WEST, false), multiVariant3).with(condition().term(BlockStateProperties.NORTH, false).term(BlockStateProperties.EAST, true).term(BlockStateProperties.SOUTH, false).term(BlockStateProperties.WEST, false), multiVariant3.with(Y_ROT_90)).with(condition().term(BlockStateProperties.NORTH, false).term(BlockStateProperties.EAST, false).term(BlockStateProperties.SOUTH, true).term(BlockStateProperties.WEST, false), multiVariant4).with(condition().term(BlockStateProperties.NORTH, false).term(BlockStateProperties.EAST, false).term(BlockStateProperties.SOUTH, false).term(BlockStateProperties.WEST, true), multiVariant4.with(Y_ROT_90)).with(condition().term(BlockStateProperties.NORTH, true), multiVariant5).with(condition().term(BlockStateProperties.EAST, true), multiVariant5.with(Y_ROT_90)).with(condition().term(BlockStateProperties.SOUTH, true), multiVariant6).with(condition().term(BlockStateProperties.WEST, true), multiVariant6.with(Y_ROT_90)));
        blockModelGenerators.registerSimpleFlatItemModel(block);
    }

    private void generateCustomShield(ItemModelGenerators itemModelGenerators, Item shieldItem) {
        ItemModel.Unbaked unbaked = ItemModelUtils.specialModel(ModelLocationUtils.getModelLocation(Items.SHIELD), new ShieldSpecialRenderer.Unbaked());
        ItemModel.Unbaked unbaked2 = ItemModelUtils.specialModel(ModelLocationUtils.getModelLocation(Items.SHIELD, "_blocking"), new ShieldSpecialRenderer.Unbaked());
        itemModelGenerators.generateBooleanDispatch(shieldItem, ItemModelUtils.isUsingItem(), unbaked2, unbaked);
    }
}
