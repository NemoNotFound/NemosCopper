package com.nemonotfound.nemos.copper.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.AbstractCauldronBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

public class LayeredCopperCauldronBlock extends AbstractCauldronBlock {

    public static final MapCodec<LayeredCopperCauldronBlock> CODEC = RecordCodecBuilder.mapCodec(
        layeredCopperCauldronBlockInstance -> layeredCopperCauldronBlockInstance.group(
                Biome.Precipitation.CODEC.fieldOf("precipitation").forGetter(layeredCopperCauldronBlock -> layeredCopperCauldronBlock.precipitationType),
                CauldronInteraction.CODEC.fieldOf("interactions").forGetter(layeredCopperCauldronBlock -> layeredCopperCauldronBlock.interactions),
                propertiesCodec()
            )
            .apply(layeredCopperCauldronBlockInstance, LayeredCopperCauldronBlock::new)
    );
    public static final int MIN_FILL_LEVEL = 1;
    public static final int MAX_FILL_LEVEL = 3;
    public static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_CAULDRON;
    private static final int BASE_CONTENT_HEIGHT = 6;
    private static final double HEIGHT_PER_LEVEL = 3.0;
    private final Biome.Precipitation precipitationType;

    @Override
    public @NotNull MapCodec<LayeredCopperCauldronBlock> codec() {
        return CODEC;
    }

    public LayeredCopperCauldronBlock(Biome.Precipitation precipitationType, CauldronInteraction.InteractionMap interactions, Properties properties) {
        super(properties, interactions);
        this.precipitationType = precipitationType;
        this.registerDefaultState(this.stateDefinition.any().setValue(LEVEL, MIN_FILL_LEVEL));
    }

    @Override
    public boolean isFull(BlockState blockState) {
        return blockState.getValue(LEVEL) == MAX_FILL_LEVEL;
    }

    @Override
    protected boolean canReceiveStalactiteDrip(@NotNull Fluid fluid) {
        return fluid == Fluids.WATER && this.precipitationType == Biome.Precipitation.RAIN;
    }

    @Override
    protected double getContentHeight(BlockState blockState) {
        return (BASE_CONTENT_HEIGHT + blockState.getValue(LEVEL) * HEIGHT_PER_LEVEL) / 16.0;
    }

    @Override
    protected void entityInside(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Entity entity, @NotNull InsideBlockEffectApplier insideBlockEffectApplier) {
        if (level instanceof ServerLevel serverlevel && entity.isOnFire() && this.isEntityInsideContent(blockState, blockPos, entity)) {
            entity.clearFire();

            if (entity.mayInteract(serverlevel, blockPos)) {
                this.handleEntityOnFireInside(blockState, level, blockPos);
            }
        }
    }

    private void handleEntityOnFireInside(BlockState state, Level level, BlockPos pos) {
        if (this.precipitationType == Biome.Precipitation.SNOW) {
            lowerFillLevel(
                    ModBlocks.COPPER_WATER_CAULDRON.get()
                    .defaultBlockState()
                    .setValue(LEVEL, state.getValue(LEVEL)),
                    level,
                    pos
            );
        } else {
            lowerFillLevel(state, level, pos);
        }
    }

    public static void lowerFillLevel(BlockState state, Level level, BlockPos pos) {
        int i = state.getValue(LEVEL) - 1;
        BlockState blockstate = i == 0 ? ModBlocks.COPPER_CAULDRON.get().defaultBlockState() : state.setValue(LEVEL, i);
        level.setBlockAndUpdate(pos, blockstate);
        level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(blockstate));
    }

    @Override
    public void handlePrecipitation(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, Biome.@NotNull Precipitation precipitation) {
        if (CopperCauldronBlock.shouldHandlePrecipitation(level, precipitation) && blockState.getValue(LEVEL) != MAX_FILL_LEVEL && precipitation == this.precipitationType) {
            BlockState blockstate = blockState.cycle(LEVEL);
            level.setBlockAndUpdate(blockPos, blockstate);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(blockstate));
        }
    }

    @Override
    protected int getAnalogOutputSignal(BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos) {
        return blockState.getValue(LEVEL);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockStateBuilder) {
        blockStateBuilder.add(LEVEL);
    }

    @Override
    protected void receiveStalactiteDrip(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Fluid fluid) {
        if (!this.isFull(blockState)) {
            BlockState blockstate = blockState.setValue(LEVEL, blockState.getValue(LEVEL) + 1);
            level.setBlockAndUpdate(blockPos, blockstate);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(blockstate));
            level.levelEvent(1047, blockPos, 0);
        }
    }

    @Override
    protected @NotNull ItemStack getCloneItemStack(@NotNull LevelReader levelReader, @NotNull BlockPos blockPos, @NotNull BlockState blockState, boolean p_387375_) {
        return new ItemStack(ModItems.COPPER_CAULDRON.get());
    }

    @Override
    public @NotNull Item asItem() {
        return ModItems.COPPER_CAULDRON.get();
    }
}
