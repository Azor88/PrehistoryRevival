package com.azor.prehistoryrevival.entity;

import com.azor.prehistoryrevival.PrehistoryRevival;
import com.azor.prehistoryrevival.entity.custom.AnkyloEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PrehistoryRevival.MOD_ID);

    public static final RegistryObject<EntityType<AnkyloEntity>> ANKYLO =
            ENTITY_TYPES.register("ankylo", () -> EntityType.Builder.of(AnkyloEntity::new, MobCategory.CREATURE)
                    .sized(1.875f, 2.125f).build("ankylo"));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
