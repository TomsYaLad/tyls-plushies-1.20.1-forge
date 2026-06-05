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
//                        output.accept(ModItems.PLUSH_TEMPLATE_TEXT.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_COMIC.get());
                        output.accept(ModItems.PLUSH_TEMPLATE_MISC.get());


                        output.accept(ModBlocks.PLUSHIE_STEVE.get());
                        output.accept(ModBlocks.PLUSHIE_ALEX.get());
                        output.accept(ModBlocks.PLUSHIE_SHEEP_PINK.get());
                        output.accept(ModBlocks.PLUSHIE_CREEPER.get());
//                        output.accept(ModBlocks.PLUSHIE_VILLAGER_PLAINS.get());

                        output.accept(ModBlocks.PLUSHIE_DANTDM.get());
                        output.accept(ModBlocks.PLUSHIE_STAMPY.get());
//                        output.accept(ModBlocks.PLUSHIE_GRIAN.get());
                        output.accept(ModBlocks.PLUSHIE_MUMBO_JUMBO.get());
                        output.accept(ModBlocks.PLUSHIE_XISUMAVOID.get());
                        output.accept(ModBlocks.PLUSHIE_THEMIGHTYNEBBY.get());
//                        output.accept(ModBlocks.PLUSHIE_MARKIPLIER.get());
//                        output.accept(ModBlocks.PLUSHIE_VANOSS.get());

//                        output.accept(ModBlocks.PLUSHIE_RALSEI.get());
                        output.accept(ModBlocks.PLUSHIE_FREDDY_FAZBEAR.get());
                        output.accept(ModBlocks.PLUSHIE_BONNIE_WITHERED.get());
                        output.accept(ModBlocks.PLUSHIE_BOYFRIEND.get());
//                        output.accept(ModBlocks.PLUSHIE_THE_KNIGHT.get());
                        output.accept(ModBlocks.PLUSHIE_ZOE_MP.get());
                        output.accept(ModBlocks.PLUSHIE_NIKO.get());
//                        output.accept(ModBlocks.PLUSHIE_SONIC.get());
                        output.accept(ModBlocks.PLUSHIE_PRINCESS_PEACH.get());
                        output.accept(ModBlocks.PLUSHIE_SANS.get());

                        output.accept(ModBlocks.PLUSHIE_BMO.get());
                        output.accept(ModBlocks.PLUSHIE_POMNI.get());
                        output.accept(ModBlocks.PLUSHIE_JAX.get());
                        output.accept(ModBlocks.PLUSHIE_KINGER.get());
                        output.accept(ModBlocks.PLUSHIE_THE_SECOND_COMING.get());
                        output.accept(ModBlocks.PLUSHIE_FEATHERS_MCGRAW.get());
//                        output.accept(ModBlocks.PLUSHIE_KIT_BODEGA.get());
                        output.accept(ModBlocks.PLUSHIE_TRICKY.get());

//                        output.accept(ModBlocks.PLUSHIE_SUN_WUKONG.get());
//                        output.accept(ModBlocks.PLUSHIE_SCP_049.get());
//                        output.accept(ModBlocks.PLUSHIE_SCP_999.get());

                        output.accept(ModBlocks.PLUSHIE_GARFIELD.get());
                        output.accept(ModBlocks.PLUSHIE_ASTERIX.get());
                        output.accept(ModBlocks.PLUSHIE_INA.get());
//                        output.accept(ModBlocks.PLUSHIE_EMMY.get());
//                        output.accept(ModBlocks.PLUSHIE_TIDY.get());
                        output.accept(ModBlocks.PLUSHIE_MUIR.get());

                        output.accept(ModBlocks.PLUSHIE_SUN_WUKONG.get()); //temporary location
                        output.accept(ModBlocks.PLUSHIE_BITSY.get());
                        output.accept(ModBlocks.PLUSHIE_MIKU.get());
                        output.accept(ModBlocks.PLUSHIE_MIKU_SAKURA.get());
                        output.accept(ModBlocks.PLUSHIE_MIKU_SUMMER.get());

                        output.accept(ModBlocks.PLUSHIE_HIM.get());
                        output.accept(ModBlocks.PLUSHIE_THRILLING_HORROR_MOD.get());
                        output.accept(ModBlocks.PLUSHIE_TRICKY_TONY.get());
                        output.accept(ModBlocks.PLUSHIE_YOU.get());
                        output.accept(ModBlocks.PLUSHIE_PUKICHO.get());
                        output.accept(ModBlocks.PLUSHIE_YELLOW_MIKU.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
