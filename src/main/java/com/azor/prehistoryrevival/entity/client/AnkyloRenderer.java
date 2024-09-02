package com.azor.prehistoryrevival.entity.client;

import com.azor.prehistoryrevival.PrehistoryRevival;
import com.azor.prehistoryrevival.entity.custom.AnkyloEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AnkyloRenderer extends MobRenderer<AnkyloEntity, Ankylosaurus<AnkyloEntity>> {
    public AnkyloRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Ankylosaurus<>(pContext.bakeLayer(ModModelLayers.ANKYLO_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(AnkyloEntity pEntity) {
        return new ResourceLocation(PrehistoryRevival.MOD_ID, "textures/entity/ankylosaurus.png");
    }

    @Override
    public void render(AnkyloEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.3f, 0.3f, 0.3f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
