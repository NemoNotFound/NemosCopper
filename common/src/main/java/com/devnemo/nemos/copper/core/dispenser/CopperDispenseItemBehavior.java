package com.devnemo.nemos.copper.core.dispenser;

import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.copper.world.entity.ModEntityTypes;
import com.devnemo.nemos.tags.interfaces.CustomBucketPickup;
import net.minecraft.core.dispenser.*;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

public interface CopperDispenseItemBehavior {

    static void bootstrap() {
        DispenserBlock.registerBehavior(CopperItems.COPPER_SHEARS.get().asItem(), new ShearsDispenseItemBehavior());
        DispenseItemBehavior bucketDispenseitembehavior = new DefaultDispenseItemBehavior() {
            private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

            @Override
            public @NotNull ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
                var dispensiblecontaineritem = (DispensibleContainerItem)itemStack.getItem();
                var blockpos = blockSource.pos().relative(blockSource.state().getValue(DispenserBlock.FACING));
                var level = blockSource.level();

                if (dispensiblecontaineritem.emptyContents(null, level, blockpos, null)) {
                    dispensiblecontaineritem.checkExtraContent(null, level, itemStack, blockpos);
                    return this.consumeWithRemainder(blockSource, itemStack, new ItemStack(CopperItems.COPPER_BUCKET.get()));
                } else {
                    return this.defaultDispenseItemBehavior.dispense(blockSource, itemStack);
                }
            }
        };
        DispenserBlock.registerBehavior(CopperItems.COPPER_LAVA_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_WATER_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_POWDER_SNOW_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_SALMON_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_COD_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_PUFFERFISH_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_TROPICAL_FISH_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_AXOLOTL_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_TADPOLE_BUCKET.get(), bucketDispenseitembehavior);
        DispenserBlock.registerBehavior(CopperItems.COPPER_BUCKET.get(), new DefaultDispenseItemBehavior() {
            @Override
            public @NotNull ItemStack execute(@NotNull BlockSource blockSource, @NotNull ItemStack itemStack) {
                var levelAccessor = blockSource.level();
                var blockpos = blockSource.pos().relative(blockSource.state().getValue(DispenserBlock.FACING));
                var blockstate = levelAccessor.getBlockState(blockpos);

                if (blockstate.getBlock() instanceof CustomBucketPickup bucketpickup) {
                    ItemStack itemstack = bucketpickup.nemosTags$pickupBlock(CopperItems.COPPER_BUCKET.get(), levelAccessor, blockpos, blockstate);

                    if (itemstack.isEmpty()) {
                        return super.execute(blockSource, itemStack);
                    } else {
                        levelAccessor.gameEvent(null, GameEvent.FLUID_PICKUP, blockpos);
                        Item item = itemstack.getItem();
                        return this.consumeWithRemainder(blockSource, itemStack, new ItemStack(item));
                    }
                } else {
                    return super.execute(blockSource, itemStack);
                }
            }
        });
        DispenserBlock.registerBehavior(CopperItems.COPPER_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.COPPER_CHEST_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_CHEST_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.COPPER_FURNACE_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_FURNACE_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.COPPER_TNT_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_TNT_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.HOPPER_COPPER_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.HOPPER_COPPER_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.COPPER_HOPPER_COPPER_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_HOPPER_COPPER_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.COPPER_HOPPER_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_HOPPER_MINECART.get()));
        DispenserBlock.registerBehavior(CopperItems.COPPER_COMMAND_BLOCK_MINECART.get(), new MinecartDispenseItemBehavior(ModEntityTypes.COPPER_COMMAND_BLOCK_MINECART.get()));
    }
}
