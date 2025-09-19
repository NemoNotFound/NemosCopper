package com.devnemo.nemos.copper.mixin;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.entity.vehicle.NewMinecartBehavior;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(NewMinecartBehavior.class)
public class NewMinecartBehaviourMixin {

    @ModifyExpressionValue(method = "calculateHaltTrackSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/PoweredRailBlock;isActivatorRail()Z"))
    private boolean calculateHaltTrackSpeed(boolean original, @Local(argsOnly = true) BlockState state) {
        return original && !state.is(CopperBlocks.COPPER_POWERED_RAIL.get());
    }

    @ModifyExpressionValue(method = "calculateBoostTrackSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/PoweredRailBlock;isActivatorRail()Z"))
    private boolean calculateBoostTrackSpeed(boolean original, @Local(argsOnly = true) BlockState state) {
        return original && state.is(CopperBlocks.COPPER_POWERED_RAIL.get());
    }

    @ModifyExpressionValue(method = "moveAlongTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/PoweredRailBlock;isActivatorRail()Z"))
    private boolean moveAlongTrack(boolean original, @Local BlockState state) {
        return original && state.is(CopperBlocks.COPPER_ACTIVATOR_RAIL.get());
    }
}
