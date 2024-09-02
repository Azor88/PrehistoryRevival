package com.azor.prehistoryrevival.event;

import com.azor.prehistoryrevival.PrehistoryRevival;
import com.azor.prehistoryrevival.entity.client.Ankylosaurus;
import com.azor.prehistoryrevival.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PrehistoryRevival.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ANKYLO_LAYER, Ankylosaurus::createBodyLayer);
    }
}
