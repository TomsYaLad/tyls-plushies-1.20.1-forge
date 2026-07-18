package net.tomsyalad.tylsplushies.block.custom;

import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraftforge.common.ToolAction;
import net.tomsyalad.tylsplushies.block.ModBlocks;

import javax.annotation.Nullable;

public class ModPlushieBlock extends HorizontalDirectionalBlock {
    public ModPlushieBlock(Properties pProperties) {
        super(pProperties);
    }

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate)
    { if(context.getItemInHand().getItem() instanceof DiggerItem) {

            if(state.is(ModBlocks.PLUSHIE_DANTDM.get())) {
                return ModBlocks.PLUSHIE_DANTDM_BLUE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_DANTDM_BLUE.get())) {
                return ModBlocks.PLUSHIE_DANTDM.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }

            if(state.is(ModBlocks.PLUSHIE_GOODTIMESWITHSCAR.get())) {
                return ModBlocks.PLUSHIE_GOODTIMESWITHSCAR_S11.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_GOODTIMESWITHSCAR_S11.get())) {
                return ModBlocks.PLUSHIE_GOODTIMESWITHSCAR.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }

            if(state.is(ModBlocks.PLUSHIE_BONNIE.get())) {
                return ModBlocks.PLUSHIE_BONNIE_WITHERED.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_BONNIE_WITHERED.get())) {
                return ModBlocks.PLUSHIE_BONNIE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            
            if(state.is(ModBlocks.PLUSHIE_TRICKY.get())) {
                return ModBlocks.PLUSHIE_TRICKY_UNMASKED.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_TRICKY_UNMASKED.get())) {
                return ModBlocks.PLUSHIE_TRICKY.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }

            if(state.is(ModBlocks.PLUSHIE_MIKU.get())) {
                return ModBlocks.PLUSHIE_MIKU_SAKURA.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_MIKU_SAKURA.get())) {
                return ModBlocks.PLUSHIE_MIKU_SUMMER.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_MIKU_SUMMER.get())) {
                return ModBlocks.PLUSHIE_MIKU.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }

            if(state.is(ModBlocks.PLUSHIE_TETO.get())) {
                return ModBlocks.PLUSHIE_TETO_CLASSIC.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
            if(state.is(ModBlocks.PLUSHIE_TETO_CLASSIC.get())) {
                return ModBlocks.PLUSHIE_TETO.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }

        } return super.getToolModifiedState(state, context, toolAction, simulate);
    }//,
//    {
//        if(context.getItemInHand().getItem() instanceof ModPlushVersionSwitcherItem) {
//
//            if(state.is(ModBlocks.PLUSHIE_TRICKY.get())) {
//                return ModBlocks.PLUSHIE_TRICKY_DSIDES.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
//
//        }
//        return super.getToolModifiedState(state, context, toolAction, simulate);
//    }
}
