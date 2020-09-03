package com.github.platysquid.brewbloodandblade.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class Dev_Tool extends Item
{
    public Dev_Tool()
    {
        super(new Properties()
                .group(ModItemGroups.MOD_ITEM_GROUP)
                .maxDamage(32767)//We're here on the oldest anarchy server in minecraft...
                .addToolType(ToolType.PICKAXE, 2)
        );
        setRegistryName("dev_tool");
    }
}
