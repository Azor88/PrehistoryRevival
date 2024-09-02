package com.azor.prehistoryrevival.item;

import com.azor.prehistoryrevival.PrehistoryRevival;
import com.azor.prehistoryrevival.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoryRevival.MOD_ID);

    public static final RegistryObject<Item> OSTEODERM = ITEMS.register("osteoderm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLUB = ITEMS.register("club",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ANKYLO_SPAWN_EGG = ITEMS.register("ankylo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ANKYLO, 0x283b4c, 0x24201d,
                    new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
