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
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_ALEX = registerBlock("plushie_alex",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.GUITAR).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_CREEPER = registerBlock("plushie_creeper",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_VILLAGER_PLAINS = registerBlock("plushie_villager_plains",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BANJO).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_DANTDM = registerBlock("plushie_dantdm",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_STAMPY = registerBlock("plushie_stampy",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.GUITAR).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_GRIAN = registerBlock("plushie_grian",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.FLUTE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_MUMBO_JUMBO = registerBlock("plushie_mumbo_jumbo",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HAT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_XISUMAVOID = registerBlock("plushie_xisumavoid",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.COW_BELL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_THEMIGHTYNEBBY = registerBlock("plushie_themightynebby",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.PLING).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_MARKIPLIER = registerBlock("plushie_markiplier",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_VANOSS = registerBlock("plushie_vanoss",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.GUITAR).sound(SoundType.WOOL)));

//    public static final RegistryObject<Block> PLUSHIE_RALSEI = registerBlock("plushie_ralsei",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HARP).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_FREDDY_FAZBEAR = registerBlock("plushie_freddy_fazbear",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.DIDGERIDOO).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_BONNIE_WITHERED = registerBlock("plushie_bonnie_withered",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.IRON_XYLOPHONE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_BOYFRIEND = registerBlock("plushie_boyfriend",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.CHIME).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_THE_KNIGHT = registerBlock("plushie_the_knight",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.DIDGERIDOO).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_ZOE_MP = registerBlock("plushie_zoe_mp",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.PLING).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_NIKO = registerBlock("plushie_niko",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BELL).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_SONIC = registerBlock("plushie_sonic",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_PRINCESS_PEACH = registerBlock("plushie_princess_peach",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.CHIME).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_SANS = registerBlock("plushie_sans",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.XYLOPHONE).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_BMO = registerBlock("plushie_bmo",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_THE_SECOND_COMING = registerBlock("plushie_the_second_coming",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HAT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_FEATHERS_MCGRAW = registerBlock("plushie_feathers_mcgraw",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.COW_BELL).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_KIT_BODEGA = registerBlock("plushie_kit_bodega",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_TRICKY = registerBlock("plushie_tricky",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_POMNI = registerBlock("plushie_pomni",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.FLUTE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_JAX = registerBlock("plushie_jax",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_KINGER = registerBlock("plushie_kinger",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.CHIME).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_SUN_WUKONG = registerBlock("plushie_sun_wukong",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.FLUTE).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_SCP_049 = registerBlock("plushie_scp_049",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.IRON_XYLOPHONE).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_SCP_999 = registerBlock("plushie_scp_999",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.PLING).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_GARFIELD = registerBlock("plushie_garfield",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_INA = registerBlock("plushie_ina",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HARP).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_EMMY = registerBlock("plushie_emmy",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.PLING).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_MUIR = registerBlock("plushie_muir",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.CHIME).sound(SoundType.WOOL)));
//    public static final RegistryObject<Block> PLUSHIE_TIDY = registerBlock("plushie_tidy",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.PLING).sound(SoundType.WOOL)));

//    public static final RegistryObject<Block> PLUSHIE_BITSY = registerBlock("plushie_bitsy",
//            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BELL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_MIKU = registerBlock("plushie_miku",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_MIKU_SAKURA = registerBlock("plushie_miku_sakura",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_MIKU_SUMMER = registerBlock("plushie_miku_summer",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PLUSHIE_HIM = registerBlock("plushie_him",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.IRON_XYLOPHONE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_THRILLING_HORROR_MOD = registerBlock("plushie_thrilling_horror_mod",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.DIDGERIDOO).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_TRICKY_TONY = registerBlock("plushie_tricky_tony",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_YOU = registerBlock("plushie_you",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HARP).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_PUKICHO = registerBlock("plushie_pukicho",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PLUSHIE_YELLOW_MIKU = registerBlock("plushie_yellow_miku",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BIT).sound(SoundType.WOOL)));


    public static final RegistryObject<Block> TEST_PLUSHIE_1 = registerBlock("test_plushie_1",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.GUITAR).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> TEST_PLUSHIE_2 = registerBlock("test_plushie_2",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> TEST_PLUSHIE_3 = registerBlock("test_plushie_3",
            () -> new ModPlushieBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.SNARE).sound(SoundType.WOOL)));


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
