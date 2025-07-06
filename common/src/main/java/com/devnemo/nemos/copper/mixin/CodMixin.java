package com.devnemo.nemos.copper.mixin;

import com.devnemo.nemos.copper.interfaces.CopperBucketItemStackGetter;
import com.devnemo.nemos.copper.item.ModItems;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Cod.class)
public class CodMixin implements CopperBucketItemStackGetter {

    @Override
    public ItemStack nemosCopper$getCopperBucketItemStack() {
        return new ItemStack(ModItems.COPPER_COD_BUCKET.get());
    }
}
