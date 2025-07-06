package com.nemonotfound.nemos.copper.block;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.AbstractCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CopperLavaCauldronBlock extends AbstractCauldronBlock {

    public static final MapCodec<CopperLavaCauldronBlock> CODEC = simpleCodec(CopperLavaCauldronBlock::new);

    @Override
    public @NotNull MapCodec<CopperLavaCauldronBlock> codec() {
        return CODEC;
    }

    public CopperLavaCauldronBlock(Properties properties) {
        super(properties, CauldronInteraction.LAVA);
    }

    @Override
    protected double getContentHeight(@NotNull BlockState blockState) {
        return 0.9375;
    }

    @Override
    public boolean isFull(@NotNull BlockState blockState) {
        return true;
    }

    @Override
    protected void entityInside(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Entity entity, @NotNull InsideBlockEffectApplier insideBlockEffectApplier) {
            entity.lavaIgnite();
            entity.lavaHurt();
    }

    @Override
    protected int getAnalogOutputSignal(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos) {
        return 3;
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
