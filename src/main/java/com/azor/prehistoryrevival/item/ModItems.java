package com.azor.prehistoryrevival.item;

import com.azor.prehistoryrevival.PrehistoryRevival;
import net.minecraft.world.item.Item;
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
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
