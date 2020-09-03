package com.github.platysquid.brewbloodandblade.init;

import com.github.platysquid.brewbloodandblade.blocks.Mithril_Ore;
import com.github.platysquid.brewbloodandblade.blocks.ModBlocks;
import com.github.platysquid.brewbloodandblade.items.Dev_Tool;
import com.github.platysquid.brewbloodandblade.items.ModItemGroups;
import com.github.platysquid.brewbloodandblade.setup.ClientProxy;
import com.github.platysquid.brewbloodandblade.setup.IProxy;
import com.github.platysquid.brewbloodandblade.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(com.github.platysquid.brewbloodandblade.init.BrewBloodAndBlade.MODID)
public class BrewBloodAndBlade
{
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static final String MODID = "brew-blood-and-blade";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public BrewBloodAndBlade()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    //    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onRegisterItems(RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(
                    new Dev_Tool(),
                    new BlockItem(ModBlocks.MITHRIL_ORE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(64)).setRegistryName(ModBlocks.MITHRIL_ORE.getRegistryName())
            );
        }

        @SubscribeEvent
        public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(
                    new Mithril_Ore()

            );
        }
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        proxy.init();
        proxy.getClientWorld();
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("brew-blood-and-blade", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }


}
