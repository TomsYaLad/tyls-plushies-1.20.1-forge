package net.tomsyalad.tylsplushies.block.custom;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

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

//    @Override
//    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate)
//    {
//        if(context.getItemInHand().getItem() instanceof ModPlushStyleSwitcherItem) {
//
//            if(state.is(ModBlocks.PLUSHIE_TRICKY.get())) {
//                return ModBlocks.PLUSHIE_TRICKY_UNMASKED.get().defaultBlockState().setValue(FACING, state.getValue(FACING)); }
//
//        }
//        return super.getToolModifiedState(state, context, toolAction, simulate);
//    },
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
