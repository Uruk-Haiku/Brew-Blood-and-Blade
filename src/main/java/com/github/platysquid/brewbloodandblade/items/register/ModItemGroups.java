package com.github.platysquid.brewbloodandblade.items.register;

import com.github.platysquid.brewbloodandblade.init.BrewBloodAndBlade;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import java.util.function.Supplier;

public class ModItemGroups
{
    public static class ModItemGroup extends ItemGroup
    {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup (final String name, final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon()
        {
            return iconSupplier.get();
        }
    }

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(BrewBloodAndBlade.MODID, () -> new ItemStack(ModItems.DEV_TOOL));

    public void init()
    {

    }
}
