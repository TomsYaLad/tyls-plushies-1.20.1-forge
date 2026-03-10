package net.tomsyalad.tylsplushies.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylsplushies.TYLsPlushies;
import net.tomsyalad.tylsplushies.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TYLsPlushies.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TYLS_PLUSHIES_TAB = CREATIVE_MODE_TABS.register("tyls_plushies_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PLUSHIE_STEVE.get()))
                    .title(Component.translatable("creativetab.tyls_plushies_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.PLUSH_TEMPLATE_GENERIC.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_MINECRAFT.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_CREATOR.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_GAME.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_VIDEO.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_TEXT.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_COMIC.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_MISC.get());


                        output.accept(ModBlocks.PLUSHIE_STEVE.get());
                        output.accept(ModBlocks.PLUSHIE_ALEX.get());
                        output.accept(ModBlocks.PLUSHIE_CREEPER.get());
                        output.accept(ModBlocks.PLUSHIE_HEROBRINE.get());

                        output.accept(ModBlocks.PLUSHIE_THEMIGHTYNEBBY.get());

                        output.accept(ModBlocks.PLUSHIE_WITHERED_BONNIE.get());

                        output.accept(ModBlocks.PLUSHIE_TRICKY.get());
                        output.accept(ModBlocks.PLUSHIE_KINGER.get());
                        output.accept(ModBlocks.PLUSHIE_FEATHERS_MCGRAW.get());

                        output.accept(ModBlocks.PLUSHIE_MUIR.get());

                        output.accept(ModBlocks.PLUSHIE_HATSUNE_MIKU.get());

                        output.accept(ModBlocks.PLUSHIE_PUKICHO.get());
                        output.accept(ModBlocks.PLUSHIE_RED_EYE_BARRY.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
