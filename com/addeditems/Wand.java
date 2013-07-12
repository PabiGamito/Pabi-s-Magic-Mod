package com.addeditems;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class Wand extends Item {

	public Wand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("PabiModBase:Wand");
    }

}
