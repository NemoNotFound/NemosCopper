package com.nemonotfound.nemos.copper.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.AbstractCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

public class CopperCauldronBlock extends AbstractCauldronBlock {

    public static final MapCodec<CopperCauldronBlock> CODEC = simpleCodec(CopperCauldronBlock::new);
    private static final float RAIN_FILL_CHANCE = 0.05F;
    private static final float POWDER_SNOW_FILL_CHANCE = 0.1F;


    public CopperCauldronBlock(BlockBehaviour.Properties properties) {
        super(properties, CauldronInteraction.EMPTY);
    }

    @Override
    protected @NotNull MapCodec<? extends AbstractCauldronBlock> codec() {
        return CODEC;
    }

    @Override
    public boolean isFull(@NotNull BlockState blockState) {
        return false;
    }

    @Override
    public void handlePrecipitation(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, Biome.@NotNull Precipitation precipitation) {
        if (shouldHandlePrecipitation(level, precipitation)) {
            if (precipitation == Biome.Precipitation.RAIN) {
                level.setBlockAndUpdate(blockPos, ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState());
                level.gameEvent(null, GameEvent.BLOCK_CHANGE, blockPos);
            } else if (precipitation == Biome.Precipitation.SNOW) {
                level.setBlockAndUpdate(blockPos, ModBlocks.COPPER_POWDER_SNOW_CAULDRON.get().defaultBlockState());
                level.gameEvent(null, GameEvent.BLOCK_CHANGE, blockPos);
            }
        }
    }

    protected static boolean shouldHandlePrecipitation(Level level, Biome.Precipitation precipitation) {
        if (precipitation == Biome.Precipitation.RAIN) {
            return level.getRandom().nextFloat() < RAIN_FILL_CHANCE;
        } else {
            return precipitation == Biome.Precipitation.SNOW && level.getRandom().nextFloat() < POWDER_SNOW_FILL_CHANCE;
        }
    }

    @Override
    protected boolean canReceiveStalactiteDrip(@NotNull Fluid fluid) {
        return true;
    }

    @Override
    protected void receiveStalactiteDrip(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Fluid fluid) {
        if (fluid == Fluids.WATER) {
            BlockState newBlockState = ModBlocks.COPPER_WATER_CAULDRON.get().defaultBlockState();
            level.setBlockAndUpdate(blockPos, newBlockState);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(newBlockState));
            level.levelEvent(1047, blockPos, 0);
        } else if (fluid == Fluids.LAVA) {
            BlockState newBlockState = ModBlocks.COPPER_LAVA_CAULDRON.get().defaultBlockState();
            level.setBlockAndUpdate(blockPos, newBlockState);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(newBlockState));
            level.levelEvent(1046, blockPos, 0);
        }
    }
}
