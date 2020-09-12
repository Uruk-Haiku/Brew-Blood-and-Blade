package com.github.platysquid.brewbloodandblade.items;

import com.github.platysquid.brewbloodandblade.items.register.ModItemGroups;
import net.minecraft.item.Item;

public class Tin_Ingot extends Item
{
    public Tin_Ingot ()
    {
        super(new Properties()
                .group(ModItemGroups.MOD_ITEM_GROUP)
        );
        setRegistryName("tin_ingot");
    }
}
