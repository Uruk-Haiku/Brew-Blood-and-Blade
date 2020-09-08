package com.github.platysquid.brewbloodandblade.items;

import com.github.platysquid.brewbloodandblade.items.register.ModItemGroups;
import net.minecraft.item.Item;

public class Mithril_Ingot extends Item
{
    public Mithril_Ingot ()
    {
        super(new Properties()
                .group(ModItemGroups.MOD_ITEM_GROUP)
        );
        setRegistryName("mithril_ingot");
    }
}
