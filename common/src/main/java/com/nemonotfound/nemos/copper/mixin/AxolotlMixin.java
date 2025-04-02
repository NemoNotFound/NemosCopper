package com.nemonotfound.nemos.copper.mixin;

import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemStackGetter;
import com.nemonotfound.nemos.copper.item.Items;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Axolotl.class)
public class AxolotlMixin implements CopperBucketItemStackGetter {

    @Override
    public ItemStack nemosCopper$getCopperBucketItemStack() {
        return new ItemStack(Items.COPPER_AXOLOTL_BUCKET.get());
    }
}
