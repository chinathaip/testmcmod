package chinathai.realtestmod.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegisterUtil {
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = CreateBlock.BLOCKS.register(name, supplier);
        CreateItem.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
