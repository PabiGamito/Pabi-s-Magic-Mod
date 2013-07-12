package com.addeditems;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class HutPart extends Item {

	public HutPart(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public void registerIcons(IconRegister iconReg) {
		itemIcon = iconReg.registerIcon("pabimodbase:HutPart");
	}
}