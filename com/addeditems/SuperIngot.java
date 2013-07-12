package com.addeditems;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SuperIngot extends Item{

	public SuperIngot(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("PabiModBase:SuperIngot");
        
    }
    
}
