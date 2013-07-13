package com.PabiCodes;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

	//@SideOnly(Side.CLIENT)
	public class RenderSuperexppotion extends RenderSnowball
	{
	public RenderSuperexppotion(Item par1Item, int par2)
	{
	         super(par1Item, par2);
	}
	public RenderSuperexppotion(Item par1Item)
	{
	         super(par1Item);
	}

	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
	         super.doRender(par1Entity, par2, par4, par6, par8, par9);
	}
	}
