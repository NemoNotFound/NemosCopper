package com.devnemo.nemos.copper.world.entity.vehicle;

import com.devnemo.nemos.copper.item.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.MinecartSpawner;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CopperMinecartSpawner extends MinecartSpawner {

    public CopperMinecartSpawner(EntityType<? extends MinecartSpawner> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected @NotNull Item getDropItem() {
        return ModItems.COPPER_MINECART.get();
    }

    @Override
    public @NotNull ItemStack getPickResult() {
        return new ItemStack(ModItems.COPPER_MINECART.get());
    }
}
