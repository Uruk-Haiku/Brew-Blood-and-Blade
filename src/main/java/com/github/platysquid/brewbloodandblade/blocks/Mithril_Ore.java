package com.github.platysquid.brewbloodandblade.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Mithril_Ore extends Block
{
    public Mithril_Ore()
    {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0F, 3.0F)
        );
        setRegistryName("mithril_ore");
    }
}
