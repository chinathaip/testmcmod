package chinathai.realtestmod;

import chinathai.realtestmod.init.CreateBlock;
import chinathai.realtestmod.init.CreateItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static chinathai.realtestmod.Realtestmod.MODID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class Realtestmod {
    public static final String MODID = "realtestmod";

    public Realtestmod() {
        // Register the setup method for modloading
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register ourselves for server and other game events we are interested in
        CreateBlock.BLOCKS.register(bus);
        CreateItem.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
