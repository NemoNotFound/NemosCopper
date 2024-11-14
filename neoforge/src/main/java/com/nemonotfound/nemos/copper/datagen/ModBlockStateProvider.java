package com.nemonotfound.nemos.copper.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Function;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

//    private void createPassiveRail(Block railBlock) {
//        TextureMapping texturemapping = TextureMapping.rail(railBlock);
//        TextureMapping texturemapping1 = TextureMapping.rail(TextureMapping.getBlockTexture(railBlock, "_corner"));
//        ResourceLocation resourcelocation = ModelTemplates.RAIL_FLAT.create(railBlock, texturemapping, this.rail);
//        ResourceLocation resourcelocation1 = ModelTemplates.RAIL_CURVED.create(railBlock, texturemapping1, this.modelOutput);
//        ResourceLocation resourcelocation2 = ModelTemplates.RAIL_RAISED_NE.create(railBlock, texturemapping, this.modelOutput);
//        ResourceLocation resourcelocation3 = ModelTemplates.RAIL_RAISED_SW.create(railBlock, texturemapping, this.modelOutput);
//        this.createSimpleFlatItemModel(railBlock);
//        this.blockStateOutput
//                .accept(
//                        MultiVariantGenerator.multiVariant(railBlock)
//                                .with(
//                                        PropertyDispatch.property(BlockStateProperties.RAIL_SHAPE)
//                                                .select(RailShape.NORTH_SOUTH, Variant.variant().with(VariantProperties.MODEL, resourcelocation))
//                                                .select(
//                                                        RailShape.EAST_WEST,
//                                                        Variant.variant().with(VariantProperties.MODEL, resourcelocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
//                                                )
//                                                .select(
//                                                        RailShape.ASCENDING_EAST,
//                                                        Variant.variant()
//                                                                .with(VariantProperties.MODEL, resourcelocation2)
//                                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
//                                                )
//                                                .select(
//                                                        RailShape.ASCENDING_WEST,
//                                                        Variant.variant()
//                                                                .with(VariantProperties.MODEL, resourcelocation3)
//                                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
//                                                )
//                                                .select(RailShape.ASCENDING_NORTH, Variant.variant().with(VariantProperties.MODEL, resourcelocation2))
//                                                .select(RailShape.ASCENDING_SOUTH, Variant.variant().with(VariantProperties.MODEL, resourcelocation3))
//                                                .select(RailShape.SOUTH_EAST, Variant.variant().with(VariantProperties.MODEL, resourcelocation1))
//                                                .select(
//                                                        RailShape.SOUTH_WEST,
//                                                        Variant.variant()
//                                                                .with(VariantProperties.MODEL, resourcelocation1)
//                                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
//                                                )
//                                                .select(
//                                                        RailShape.NORTH_WEST,
//                                                        Variant.variant()
//                                                                .with(VariantProperties.MODEL, resourcelocation1)
//                                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
//                                                )
//                                                .select(
//                                                        RailShape.NORTH_EAST,
//                                                        Variant.variant()
//                                                                .with(VariantProperties.MODEL, resourcelocation1)
//                                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
//                                                )
//                                )
//                );
//    }
//
//    private void createActiveRail(Block railBlock) {
//        ResourceLocation resourcelocation = this.createSuffixedVariant(railBlock, "", ModelTemplates.RAIL_FLAT, TextureMapping::rail);
//        ResourceLocation resourcelocation1 = this.createSuffixedVariant(railBlock, "", ModelTemplates.RAIL_RAISED_NE, TextureMapping::rail);
//        ResourceLocation resourcelocation2 = this.createSuffixedVariant(railBlock, "", ModelTemplates.RAIL_RAISED_SW, TextureMapping::rail);
//        ResourceLocation resourcelocation3 = this.createSuffixedVariant(railBlock, "_on", ModelTemplates.RAIL_FLAT, TextureMapping::rail);
//        ResourceLocation resourcelocation4 = this.createSuffixedVariant(railBlock, "_on", ModelTemplates.RAIL_RAISED_NE, TextureMapping::rail);
//        ResourceLocation resourcelocation5 = this.createSuffixedVariant(railBlock, "_on", ModelTemplates.RAIL_RAISED_SW, TextureMapping::rail);
//        PropertyDispatch propertydispatch = PropertyDispatch.properties(BlockStateProperties.POWERED, BlockStateProperties.RAIL_SHAPE_STRAIGHT)
//                .generate(
//                        (p_176166_, p_176167_) -> {
//                            switch (p_176167_) {
//                                case NORTH_SOUTH:
//                                    return Variant.variant().with(VariantProperties.MODEL, p_176166_ ? resourcelocation3 : resourcelocation);
//                                case EAST_WEST:
//                                    return Variant.variant()
//                                            .with(VariantProperties.MODEL, p_176166_ ? resourcelocation3 : resourcelocation)
//                                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90);
//                                case ASCENDING_EAST:
//                                    return Variant.variant()
//                                            .with(VariantProperties.MODEL, p_176166_ ? resourcelocation4 : resourcelocation1)
//                                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90);
//                                case ASCENDING_WEST:
//                                    return Variant.variant()
//                                            .with(VariantProperties.MODEL, p_176166_ ? resourcelocation5 : resourcelocation2)
//                                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90);
//                                case ASCENDING_NORTH:
//                                    return Variant.variant().with(VariantProperties.MODEL, p_176166_ ? resourcelocation4 : resourcelocation1);
//                                case ASCENDING_SOUTH:
//                                    return Variant.variant().with(VariantProperties.MODEL, p_176166_ ? resourcelocation5 : resourcelocation2);
//                                default:
//                                    throw new UnsupportedOperationException("Fix you generator!");
//                            }
//                        }
//                );
//        this.createSimpleFlatItemModel(railBlock);
//        this.blockStateOutput.accept(MultiVariantGenerator.multiVariant(railBlock).with(propertydispatch));
//    }
//
//    private void createSimpleFlatItemModel(Block flatBlock) {
//        Item item = flatBlock.asItem();
//        if (item != Items.AIR) {
//            ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(flatBlock), this.modelOutput);
//        }
//    }
//
//    private ResourceLocation createSuffixedVariant(
//            Block block, String suffix, ModelTemplate modelTemplate, Function<ResourceLocation, TextureMapping> textureMappingGetter
//    ) {
//        return modelTemplate.createWithSuffix(block, suffix, textureMappingGetter.apply(TextureMapping.getBlockTexture(block, suffix)), this.modelOutput);
//    }
}
