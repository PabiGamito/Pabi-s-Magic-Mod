package com.addeditems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class LaunchPad extends Block
{
    private Icon field_94393_a;
	private Icon field_94392_b;
	public <isDoubleSlab> LaunchPad(int par1, Material par2Material) 
    {
		super(par1, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockUnbreakable();
        
	}
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("pabimodbase:JumpPad_Side");
        this.field_94393_a = par1IconRegister.registerIcon("pabimodbase:JumpPad_Top");
        this.field_94392_b = par1IconRegister.registerIcon("tnt_bottom");
    }
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.field_94393_a : (par1 == 0 ? Block.stoneDoubleSlab.getBlockTextureFromSide(par1) : this.blockIcon);
    }
    
    /**
     * When stepped on block launches you up into the air (diagonally).
     */
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	try 
    	{
    		EntityPlayer player = (EntityPlayer)par5Entity;
    		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 80, 20));
    		player.setVelocity((player.posX - player.lastTickPosX)*20, 2.3, (player.posZ - player.lastTickPosZ)*20);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	
    }
    public void velocityToAddToEntity(World par1World, int par2, int par3, int par4, Entity par5Entity, Vec3 par6Vec3) 
    {
    	/*
    	try 
    	{
    		EntityPlayer player = (EntityPlayer)par5Entity;
    		player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 20));
    		player.setVelocity(par2, par3 + 5, par4);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	//par6Vec3.yCoord += 5;
    	 * */
    	
    }
}