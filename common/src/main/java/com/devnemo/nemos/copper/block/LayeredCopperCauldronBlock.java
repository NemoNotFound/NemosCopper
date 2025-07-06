package com.devnemo.nemos.copper.block;

import com.devnemo.nemos.copper.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class LayeredCopperCauldronBlock extends LayeredCauldronBlock {

    public LayeredCopperCauldronBlock(Biome.Precipitation precipitationType, CauldronInteraction.InteractionMap interactions, Properties properties) {
        super(precipitationType, interactions, properties);
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
