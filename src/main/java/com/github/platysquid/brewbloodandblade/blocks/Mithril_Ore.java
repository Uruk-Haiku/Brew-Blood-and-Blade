package com.github.platysquid.brewbloodandblade.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class Mithril_Ore extends Block
{
    public Mithril_Ore()
    {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(15.0F, 15.0F)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)


        );
        setRegistryName("mithril_ore");
    }
}
