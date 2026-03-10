package net.tomsyalad.tylsplushies.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylsplushies.TYLsPlushies;
import net.tomsyalad.tylsplushies.block.custom.ModPlushieBlock;
import net.tomsyalad.tylsplushies.item.ModItems;

import java.util.function.Supplier;

//import static org.openjdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TYLsPlushies.MOD_ID);

    public static final RegistryObject<Block> PLUSHIE_STEVE = registerBlock("plushie_steve",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.GUITAR).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_ALEX = registerBlock("plushie_alex",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_CREEPER = registerBlock("plushie_creeper",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_HEROBRINE = registerBlock("plushie_herobrine",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.IRON_XYLOPHONE).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_THEMIGHTYNEBBY = registerBlock("plushie_themightynebby",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.PLING).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_WITHERED_BONNIE = registerBlock("plushie_withered_bonnie",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.IRON_XYLOPHONE).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_TRICKY = registerBlock("plushie_tricky",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HAT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_KINGER = registerBlock("plushie_kinger",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.FLUTE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_FEATHERS_MCGRAW = registerBlock("plushie_feathers_mcgraw",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.COW_BELL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_MUIR = registerBlock("plushie_muir",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.CHIME).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_HATSUNE_MIKU = registerBlock("plushie_hatsune_miku",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_PUKICHO = registerBlock("plushie_pukicho",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_RED_EYE_BARRY = registerBlock("plushie_red_eye_barry",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.DIDGERIDOO).sound(SoundType.WOOL)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
