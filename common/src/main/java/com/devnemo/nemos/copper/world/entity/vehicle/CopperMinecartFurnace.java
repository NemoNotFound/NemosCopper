package com.devnemo.nemos.copper.world.entity.vehicle;

import com.devnemo.nemos.copper.item.CopperItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.MinecartFurnace;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CopperMinecartFurnace extends MinecartFurnace {

    public CopperMinecartFurnace(EntityType<? extends MinecartFurnace> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected @NotNull Item getDropItem() {
        return CopperItems.COPPER_FURNACE_MINECART.get();
    }

    @Override
    public @NotNull ItemStack getPickResult() {
        return new ItemStack(CopperItems.COPPER_FURNACE_MINECART.get());
    }
}
