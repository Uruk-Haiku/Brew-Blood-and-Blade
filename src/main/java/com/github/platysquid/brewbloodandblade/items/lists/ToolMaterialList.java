package com.github.platysquid.brewbloodandblade.items.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
    //mithril();
;
    private float attackDamage, efficiency;
    private int durability, harvestLevel, enchantibility;
    private Item repairMaterial;

    private ToolMaterialList (float attackDamage, float efficiency, int durability, int harvestLevel, int enchantibility, Item repairMaterial)
    {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantibility =  enchantibility;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses()
    {
        return this.durability;
    }

    @Override
    public float getEfficiency()
    {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantibility;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(repairMaterial);
    }
}
