package net.potty.colorexp.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;

public class CustomGlassBlock extends TransparentBlock {
    // Use the vanilla connection properties
    public static final BooleanProperty NORTH = Properties.NORTH;
    public static final BooleanProperty EAST = Properties.EAST;
    public static final BooleanProperty SOUTH = Properties.SOUTH;
    public static final BooleanProperty WEST = Properties.WEST;

    public CustomGlassBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(NORTH, false)
                .with(EAST, false)
                .with(SOUTH, false)
                .with(WEST, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST);
    }
}
