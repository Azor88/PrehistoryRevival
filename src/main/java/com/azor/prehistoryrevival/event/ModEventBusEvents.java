package com.azor.prehistoryrevival.event;

import com.azor.prehistoryrevival.PrehistoryRevival;
import com.azor.prehistoryrevival.entity.ModEntities;
import com.azor.prehistoryrevival.entity.custom.AnkyloEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PrehistoryRevival.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ANKYLO.get(), AnkyloEntity.createAttributes().build());
    }
}
