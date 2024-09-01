package com.azor.prehistoryrevival.item;

import com.azor.prehistoryrevival.PrehistoryRevival;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrehistoryRevival.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PREHISTORYREVIVAL_TAB =
            CREATIVE_MODE_TABS.register("prehistoryrevival_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLUB.get()))
                            .title(Component.translatable("creativetab.prehistoryrevival_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.CLUB.get());
                                pOutput.accept(ModItems.OSTEODERM.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
