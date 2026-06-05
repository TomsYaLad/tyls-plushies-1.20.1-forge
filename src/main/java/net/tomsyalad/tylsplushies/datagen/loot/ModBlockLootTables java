package net.tomsyalad.tylsplushies.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylsplushies.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PLUSHIE_STEVE.get());
        this.dropSelf(ModBlocks.PLUSHIE_ALEX.get());
        this.dropSelf(ModBlocks.PLUSHIE_CREEPER.get());

        this.dropSelf(ModBlocks.PLUSHIE_DANTDM.get());
        this.dropSelf(ModBlocks.PLUSHIE_STAMPY.get());
        this.dropSelf(ModBlocks.PLUSHIE_MUMBO_JUMBO.get());
        this.dropSelf(ModBlocks.PLUSHIE_XISUMAVOID.get());
        this.dropSelf(ModBlocks.PLUSHIE_THEMIGHTYNEBBY.get());

        this.dropSelf(ModBlocks.PLUSHIE_FREDDY_FAZBEAR.get());
        this.dropSelf(ModBlocks.PLUSHIE_BONNIE_WITHERED.get());
        this.dropSelf(ModBlocks.PLUSHIE_BOYFRIEND.get());
        this.dropSelf(ModBlocks.PLUSHIE_ZOE_MP.get());
        this.dropSelf(ModBlocks.PLUSHIE_NIKO.get());
        this.dropSelf(ModBlocks.PLUSHIE_PRINCESS_PEACH.get());
        this.dropSelf(ModBlocks.PLUSHIE_SANS.get());

        this.dropSelf(ModBlocks.PLUSHIE_BMO.get());
        this.dropSelf(ModBlocks.PLUSHIE_THE_SECOND_COMING.get());
        this.dropSelf(ModBlocks.PLUSHIE_FEATHERS_MCGRAW.get());
        this.dropSelf(ModBlocks.PLUSHIE_TRICKY.get());
        this.dropSelf(ModBlocks.PLUSHIE_POMNI.get());
        this.dropSelf(ModBlocks.PLUSHIE_JAX.get());
        this.dropSelf(ModBlocks.PLUSHIE_KINGER.get());

        this.dropSelf(ModBlocks.PLUSHIE_GARFIELD.get());
        this.dropSelf(ModBlocks.PLUSHIE_INA.get());
        this.dropSelf(ModBlocks.PLUSHIE_MUIR.get());

        this.dropSelf(ModBlocks.PLUSHIE_SUN_WUKONG.get());
        this.dropSelf(ModBlocks.PLUSHIE_MIKU.get());
        this.dropSelf(ModBlocks.PLUSHIE_MIKU_SAKURA.get());
        this.dropSelf(ModBlocks.PLUSHIE_MIKU_SUMMER.get());

        this.dropSelf(ModBlocks.PLUSHIE_HIM.get());
        this.dropSelf(ModBlocks.PLUSHIE_THRILLING_HORROR_MOD.get());
        this.dropSelf(ModBlocks.PLUSHIE_TRICKY_TONY.get());
        this.dropSelf(ModBlocks.PLUSHIE_YOU.get());
        this.dropSelf(ModBlocks.PLUSHIE_PUKICHO.get());
        this.dropSelf(ModBlocks.PLUSHIE_YELLOW_MIKU.get());


        this.dropSelf(ModBlocks.TEST_PLUSHIE_1.get());
        this.dropSelf(ModBlocks.TEST_PLUSHIE_2.get());
        this.dropSelf(ModBlocks.TEST_PLUSHIE_3.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}