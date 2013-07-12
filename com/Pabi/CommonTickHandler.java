package com.Pabi;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class CommonTickHandler implements ITickHandler
{
public void tickStart(EnumSet<TickType> type, Object... tickData)
{
playerTick((EntityPlayer) tickData[0]);
}
public void tickEnd(EnumSet<TickType> type, Object... tickData)
{
}
public EnumSet<TickType> ticks()
{
return EnumSet.of(TickType.PLAYER);
}
public String getLabel()
{
return null;
}
public void playerTick(EntityPlayer player)
{
//1 for helm, 2 for chest, 3 for legs, 4 for boots
	//To add armor effect to armor. Doesn't work yet.
if (player.getCurrentItemOrArmor(2) != null)
{
	ItemStack itemstack = player.inventory.armorItemInSlot(2);
if (itemstack.itemID == pabimodbase.chestplateSuper.itemID && player.motionY < 0.0D)
{
    player.motionY /= 0.2000000238418579D;
    player.fallDistance = 0.0F;
}
}
}
}
