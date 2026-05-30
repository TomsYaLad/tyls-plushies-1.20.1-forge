package net.tomsyalad.tylsplushies.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylsplushies.TYLsPlushies;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TYLsPlushies.MOD_ID);

    public static final RegistryObject<Item> PLUSH_TEMPLATE_GENERIC = ITEMS.register("plush_template_generic",
            () -> new Item(new Item.Properties()));
//    .craftRemainder(ModItems.PLUSH_TEMPLATE_GENERIC.get()) doesn't work?
    public static final RegistryObject<Item> PLUSH_TEMPLATE_MINECRAFT = ITEMS.register("plush_template_minecraft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_TEMPLATE_CREATOR = ITEMS.register("plush_template_creator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_TEMPLATE_GAME = ITEMS.register("plush_template_game",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_TEMPLATE_VIDEO = ITEMS.register("plush_template_video",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_TEMPLATE_TEXT = ITEMS.register("plush_template_text",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_TEMPLATE_COMIC = ITEMS.register("plush_template_comic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_TEMPLATE_MISC = ITEMS.register("plush_template_misc",
            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> PLUSH_STYLE_SWITCHER = ITEMS.register("plush_style_switcher",
//            () -> new ModPlushStyleSwitcherItem(new Item.Properties()));
//    public static final RegistryObject<Item> PLUSH_VERSION_SWITCHER = ITEMS.register("plush_version_switcher",
//            () -> new ModPlushVersionSwitcherItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}