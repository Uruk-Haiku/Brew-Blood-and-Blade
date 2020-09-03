package com.github.platysquid.brewbloodandblade.init;
/*
import com.github.platysquid.brewbloodandblade.blocks.Mithral_Ore;
import com.github.platysquid.brewbloodandblade.blocks.ModBlocks;
import com.github.platysquid.brewbloodandblade.items.Dev_Tool;
import com.github.platysquid.brewbloodandblade.items.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = BrewBloodAndBlade.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber
{
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new Dev_Tool(),
                new BlockItem(ModBlocks.MITHRAL_ORE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(64)).setRegistryName(ModBlocks.MITHRAL_ORE.getRegistryName())
        );
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                new Mithral_Ore()

        );
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name)
    {
        return setup(entry, new ResourceLocation(BrewBloodAndBlade.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName)
    {
        entry.setRegistryName(registryName);
        return entry;
    }
}
*/