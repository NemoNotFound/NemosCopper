package com.devnemo.nemos.copper.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.devnemo.nemos.copper.block.ModBlocks;
import net.minecraft.world.entity.vehicle.OldMinecartBehavior;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(OldMinecartBehavior.class)
public class OldMinecartBehaviourMixin {

    //TODO: Use tag

    @ModifyExpressionValue(method = "moveAlongTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean moveAlongTrack(boolean original, @Local BlockState state) {
        return original || state.is(ModBlocks.COPPER_POWERED_RAIL.get());
    }

    @ModifyExpressionValue(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean tick(boolean original, @Local BlockState state) {
        return original || state.is(ModBlocks.COPPER_ACTIVATOR_RAIL.get());
    }
}
