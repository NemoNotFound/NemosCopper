package com.devnemo.nemos.copper.mixin;

import com.devnemo.nemos.copper.interfaces.CopperBucketItemStackGetter;
import com.devnemo.nemos.copper.item.ModItems;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Axolotl.class)
public class AxolotlMixin implements CopperBucketItemStackGetter {

    @Override
    public ItemStack nemosCopper$getCopperBucketItemStack() {
        return new ItemStack(ModItems.COPPER_AXOLOTL_BUCKET.get());
    }
}
