package chinathai.realtestmod.core;

import chinathai.realtestmod.Realtestmod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class TestBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Realtestmod.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("lol_block", () -> new CustomBlock(BlockBehaviour.Properties.of(Material.STONE).dynamicShape().noOcclusion()));

    public static final RegistryObject<Block> HAHA_BLOCK = BLOCKS.register("haha_block", () -> new HahaBlock(BlockBehaviour.Properties.of(Material.STONE).dynamicShape().noOcclusion()));

}
