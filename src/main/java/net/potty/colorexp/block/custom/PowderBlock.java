package net.potty.colorexp.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.function.Supplier;

public class PowderBlock extends FallingBlock {
    private final Supplier<BlockState> hardenedStateSupplier;

    public PowderBlock(Settings settings, Supplier<BlockState> hardenedStateSupplier) {
        super(settings);
        this.hardenedStateSupplier = hardenedStateSupplier;
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingState, BlockState currentState, FallingBlockEntity entity) {
        if (shouldHarden(world, pos, currentState)) {
            world.setBlockState(pos, hardenedStateSupplier.get(), Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockView world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        return shouldHarden(world, pos, world.getBlockState(pos)) ? hardenedStateSupplier.get() : super.getPlacementState(ctx);
    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state, Direction dir, BlockState neighborState,
            WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return shouldHarden(world, pos, state) ? hardenedStateSupplier.get()
                : super.getStateForNeighborUpdate(state, dir, neighborState, world, pos, neighborPos);
    }

    private static boolean shouldHarden(BlockView world, BlockPos pos, BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER) || isWaterNearby(world, pos);
    }

    private static boolean isWaterNearby(BlockView world, BlockPos pos) {
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction dir : Direction.values()) {
            mutable.set(pos, dir);
            BlockState neighborState = world.getBlockState(mutable);
            if (neighborState.getFluidState().isIn(FluidTags.WATER)
                    && !neighborState.isSideSolidFullSquare(world, pos, dir.getOpposite())) {
                return true;
            }
        }
        return false;
    }
}