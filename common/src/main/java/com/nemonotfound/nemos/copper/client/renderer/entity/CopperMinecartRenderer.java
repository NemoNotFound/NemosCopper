package com.nemonotfound.nemos.copper.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.AbstractMinecartRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.MinecartRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import static com.nemonotfound.nemos.copper.Constants.MOD_ID;

public class CopperMinecartRenderer extends AbstractMinecartRenderer<AbstractMinecart, MinecartRenderState> {

    private static final ResourceLocation COPPER_MINECART_LOCATION = ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/entity/copper_minecart.png");

    public CopperMinecartRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, modelLayerLocation);
    }

    @Override
    public @NotNull MinecartRenderState createRenderState() {
        return new MinecartRenderState();
    }

    @Override
    public void render(@NotNull MinecartRenderState minecartRenderState, @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource, int p_361740_) {
        super.render(minecartRenderState, poseStack, multiBufferSource, p_361740_);
        poseStack.pushPose();
        long i = minecartRenderState.offsetSeed;
        float f = (((float)(i >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float f1 = (((float)(i >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float f2 = (((float)(i >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        poseStack.translate(f, f1, f2);

        if (minecartRenderState.isNewRender) {
            newRender(minecartRenderState, poseStack);
        } else {
            oldRender(minecartRenderState, poseStack);
        }

        float f3 = minecartRenderState.hurtTime;
        if (f3 > 0.0F) {
            poseStack.mulPose(Axis.XP.rotationDegrees(Mth.sin(f3) * f3 * minecartRenderState.damageTime / 10.0F * (float)minecartRenderState.hurtDir));
        }

        BlockState blockstate = minecartRenderState.displayBlockState;
        if (blockstate.getRenderShape() != RenderShape.INVISIBLE) {
            poseStack.pushPose();
            float f4 = 0.75F;
            poseStack.scale(0.75F, 0.75F, 0.75F);
            poseStack.translate(-0.5F, (float)(minecartRenderState.displayOffset - 8) / 16.0F, 0.5F);
            poseStack.mulPose(Axis.YP.rotationDegrees(90.0F));
            this.renderMinecartContents(minecartRenderState, blockstate, poseStack, multiBufferSource, p_361740_);
            poseStack.popPose();
        }

        poseStack.scale(-1.0F, -1.0F, 1.0F);
        this.model.setupAnim(minecartRenderState);
        VertexConsumer vertexconsumer = multiBufferSource.getBuffer(this.model.renderType(COPPER_MINECART_LOCATION));
        this.model.renderToBuffer(poseStack, vertexconsumer, p_361740_, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
    }

    private static <S extends MinecartRenderState> void newRender(S minecartRenderState, PoseStack poseStack) {
        poseStack.mulPose(Axis.YP.rotationDegrees(minecartRenderState.yRot));
        poseStack.mulPose(Axis.ZP.rotationDegrees(-minecartRenderState.xRot));
        poseStack.translate(0.0F, 0.375F, 0.0F);
    }

    private static <S extends MinecartRenderState> void oldRender(S minecartRenderState, PoseStack poseStack) {
        double d0 = minecartRenderState.x;
        double d1 = minecartRenderState.y;
        double d2 = minecartRenderState.z;
        float f = minecartRenderState.xRot;
        float f1 = minecartRenderState.yRot;
        if (minecartRenderState.posOnRail != null && minecartRenderState.frontPos != null && minecartRenderState.backPos != null) {
            Vec3 vec3 = minecartRenderState.frontPos;
            Vec3 vec31 = minecartRenderState.backPos;
            poseStack.translate(minecartRenderState.posOnRail.x - d0, (vec3.y + vec31.y) / 2.0 - d1, minecartRenderState.posOnRail.z - d2);
            Vec3 vec32 = vec31.add(-vec3.x, -vec3.y, -vec3.z);
            if (vec32.length() != 0.0) {
                vec32 = vec32.normalize();
                f1 = (float)(Math.atan2(vec32.z, vec32.x) * 180.0 / Math.PI);
                f = (float)(Math.atan(vec32.y) * 73.0);
            }
        }

        poseStack.translate(0.0F, 0.375F, 0.0F);
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - f1));
        poseStack.mulPose(Axis.ZP.rotationDegrees(-f));
    }
}
