package com.nemonotfound.nemos.copper.mixin;

import com.nemonotfound.nemos.copper.interfaces.CopperBucketItemStackGetter;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(Bucketable.class)
public interface BucketableMixin {

    @Inject(method = "bucketMobPickup", at = @At("HEAD"), cancellable = true)
    private static <T extends LivingEntity & Bucketable> void bucketMobPickup(Player player, InteractionHand hand, T entity, CallbackInfoReturnable<Optional<InteractionResult>> cir) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (itemstack.getItem() == ModItems.COPPER_WATER_BUCKET.get() && entity.isAlive()) {
            entity.playSound(entity.getPickupSound(), 1.0F, 1.0F);
            ItemStack bucketItemStack = ((CopperBucketItemStackGetter) entity).nemosCopper$getCopperBucketItemStack();
            entity.saveToBucketTag(bucketItemStack);
            ItemStack filledResult = ItemUtils.createFilledResult(itemstack, player, bucketItemStack, false);
            player.setItemInHand(hand, filledResult);
            Level level = entity.level();

            if (!level.isClientSide) {
                CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer)player, bucketItemStack);
            }

            entity.discard();
            cir.setReturnValue(Optional.of(InteractionResult.SUCCESS));
        }
    }
}
