package com.devnemo.nemos.copper.world.entity.vehicle;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.item.CopperItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.MinecartHopper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CopperMinecartCopperHopper extends MinecartHopper {

    public CopperMinecartCopperHopper(EntityType<? extends MinecartHopper> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected @NotNull Item getDropItem() {
        return CopperItems.COPPER_HOPPER_COPPER_MINECART.get();
    }

    @Override
    public @NotNull ItemStack getPickResult() {
        return new ItemStack(CopperItems.COPPER_HOPPER_COPPER_MINECART.get());
    }

    @Override
    public @NotNull BlockState getDefaultDisplayBlockState() {
        return CopperBlocks.COPPER_HOPPER.get().defaultBlockState();
    }
}
