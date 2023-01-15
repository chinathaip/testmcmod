package chinathai.realtestmod.init;

import chinathai.realtestmod.Realtestmod;
import chinathai.realtestmod.blocks.HahaBlock;
import chinathai.realtestmod.blocks.LolBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CreateBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Realtestmod.MODID);

    //register new block here!
    public static final RegistryObject<Block> LOL_BLOCK = RegisterUtil.registerBlock("lol_block",
            () -> new LolBlock(BlockBehaviour.Properties.of(Material.STONE).dynamicShape().noOcclusion()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> HAHA_BLOCK = RegisterUtil.registerBlock("haha_block",
            () -> new HahaBlock(BlockBehaviour.Properties.of(Material.STONE).dynamicShape().noOcclusion()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

}
