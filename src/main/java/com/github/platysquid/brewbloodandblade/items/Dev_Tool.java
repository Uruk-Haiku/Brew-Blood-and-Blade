package com.github.platysquid.brewbloodandblade.items;

import com.github.platysquid.brewbloodandblade.items.register.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class Dev_Tool extends Item
{
    public Dev_Tool()
    {
        super(new Item.Properties()
                .group(ModItemGroups.MOD_ITEM_GROUP)
                .maxDamage(500)//We're here on the oldest anarchy server in minecraft...
                .addToolType(ToolType.PICKAXE, 2)

        );
        setRegistryName("dev_tool");
    }
}
