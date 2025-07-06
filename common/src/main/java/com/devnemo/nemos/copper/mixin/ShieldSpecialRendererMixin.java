package com.devnemo.nemos.copper.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.devnemo.nemos.copper.client.resources.model.ModModelBakery;
import net.minecraft.client.renderer.special.ShieldSpecialRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ShieldSpecialRenderer.class)
public class ShieldSpecialRendererMixin {

    @ModifyVariable(method = "render(Lnet/minecraft/core/component/DataComponentMap;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;IIZ)V", at = @At(value = "STORE"))
    private Material getMaterial(Material material, @Local(argsOnly = true) DataComponentMap dataComponentMap, @Local(ordinal = 1) boolean hasBanner) {
        String itemName = String.valueOf(dataComponentMap.get(DataComponents.ITEM_NAME));

        if (itemName.contains("copper_shield")) {
            return hasBanner ? ModModelBakery.COPPER_SHIELD_BASE : ModModelBakery.NO_PATTERN_COPPER_SHIELD;
        }

        return material;
    }
}
