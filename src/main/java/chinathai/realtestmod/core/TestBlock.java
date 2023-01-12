package chinathai.realtestmod.core;

import chinathai.realtestmod.Realtestmod;
import com.mojang.blocklist.BlockListSupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class TestBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Realtestmod.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("lol_block",
            () -> new CustomBlock(BlockBehaviour.Properties.of(Material.STONE)));


}
