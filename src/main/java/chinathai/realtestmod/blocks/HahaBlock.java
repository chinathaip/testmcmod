package chinathai.realtestmod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class HahaBlock extends Block {

    private static final VoxelShape SHAPE = makeShape();

    public HahaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext ctx) {
        return SHAPE;
    }

    public static VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 1, 0.4375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.1875, 0.4375, 0.1875, 0.75, 0.8125, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.4375, 0, 0.125, 1.125, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.4375, 0, 1, 1.125, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.4375, 0.875, 1, 1.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.4375, 0.875, 1, 1.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.4375, 0.875, 0.125, 1.125, 1), BooleanOp.OR);

        return shape;
    }
}
