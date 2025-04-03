package com.nemonotfound.nemos.copper.mixin;

import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemGetter;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.WaterFluid;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(WaterFluid.class)
public class WaterFluidMixin implements CopperBucketItemGetter {

    @Override
    public Item nemosCopper$getCopperBucket() {
        return ModItems.COPPER_WATER_BUCKET.get();
    }
}
