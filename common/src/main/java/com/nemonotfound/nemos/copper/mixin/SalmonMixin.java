package com.nemonotfound.nemos.copper.mixin;

import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemStackGetter;
import com.nemonotfound.nemos.copper.item.Items;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Salmon.class)
public class SalmonMixin implements CopperBucketItemStackGetter {

    @Override
    public ItemStack nemosCopper$getCopperBucketItemStack() {
        return new ItemStack(Items.COPPER_SALMON_BUCKET.get());
    }
}
