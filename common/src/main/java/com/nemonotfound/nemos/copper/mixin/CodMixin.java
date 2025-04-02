package com.nemonotfound.nemos.copper.mixin;

import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemStackGetter;
import com.nemonotfound.nemos.copper.item.Items;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Cod.class)
public class CodMixin implements CopperBucketItemStackGetter {

    @Override
    public ItemStack nemosCopper$getCopperBucketItemStack() {
        return new ItemStack(Items.COPPER_COD_BUCKET.get());
    }
}
