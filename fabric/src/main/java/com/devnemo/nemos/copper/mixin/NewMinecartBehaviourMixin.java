package com.devnemo.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.devnemo.nemos.copper.block.ModBlocks;
import net.minecraft.world.entity.vehicle.NewMinecartBehavior;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(NewMinecartBehavior.class)
public class NewMinecartBehaviourMixin {

    //TODO: use tag

    @ModifyExpressionValue(method = "calculateHaltTrackSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean calculateHaltTrackSpeed(boolean original, @Local(argsOnly = true) BlockState state) {
        return original || state.is(ModBlocks.COPPER_POWERED_RAIL.get());
    }

    @ModifyExpressionValue(method = "calculateBoostTrackSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean calculateBoostTrackSpeed(boolean original, @Local(argsOnly = true) BlockState state) {
        return original || state.is(ModBlocks.COPPER_POWERED_RAIL.get());
    }

    @ModifyExpressionValue(method = "moveAlongTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean moveAlongTrack(boolean original, @Local BlockState state) {
        return original || state.is(ModBlocks.COPPER_ACTIVATOR_RAIL.get());
    }
}
