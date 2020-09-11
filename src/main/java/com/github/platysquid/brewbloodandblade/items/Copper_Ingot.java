package com.github.platysquid.brewbloodandblade.items;

import com.github.platysquid.brewbloodandblade.items.register.ModItemGroups;
import net.minecraft.item.Item;

public class Copper_Ingot extends Item
{
    public Copper_Ingot ()
    {
        super(new Properties()
                .group(ModItemGroups.MOD_ITEM_GROUP)
        );
        setRegistryName("copper_ingot");
    }
}
