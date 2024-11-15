package com.nemonotfound.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.copper.block.ModBlocks;
import net.minecraft.world.entity.vehicle.OldMinecartBehavior;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(OldMinecartBehavior.class)
public class OldMinecartBehaviourMixin {

    @ModifyExpressionValue(method = "moveAlongTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/PoweredRailBlock;isActivatorRail()Z"))
    private boolean moveAlongTrack(boolean original, @Local BlockState state) {
        return original && !state.is(ModBlocks.COPPER_POWERED_RAIL.get());
    }

    @ModifyExpressionValue(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/PoweredRailBlock;isActivatorRail()Z"))
    private boolean tick(boolean original, @Local BlockState state) {
        return original && state.is(ModBlocks.COPPER_ACTIVATOR_RAIL.get());
    }
}
