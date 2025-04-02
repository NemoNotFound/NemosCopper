package com.nemonotfound.nemos.copper.mixin;

import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemGetter;
import com.nemonotfound.nemos.copper.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.LavaFluid;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LavaFluid.class)
public class LavaFluidMixin implements CopperBucketItemGetter {

    @Override
    public Item nemosCopper$getCopperBucket() {
        return Items.COPPER_LAVA_BUCKET.get();
    }
}
