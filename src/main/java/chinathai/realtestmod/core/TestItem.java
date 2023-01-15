package chinathai.realtestmod.core;

import chinathai.realtestmod.Realtestmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TestItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Realtestmod.MODID);

    public static final RegistryObject<Item> TEST_BLOCK = ITEMS.register("lol_block", () -> new BlockItem(TestBlock.TEST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> HAHA = ITEMS.register("haha_block", () -> new BlockItem(TestBlock.HAHA_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
