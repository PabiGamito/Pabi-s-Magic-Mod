package com.addeditems;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.html.parser.Entity;

import com.Pabi.PabiModBase;
import com.PabiCodes.EntityMobWizard;
import com.PabiCodes.util;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class StartArena extends Block
{
    public StartArena(int par1, Material par2Material) 
    {
		super(par1, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockUnbreakable();
        
	}
    public void registerIcons(IconRegister iconReg) 
    {
        blockIcon = iconReg.registerIcon("PabiModBase:ArenaStart"); 
    }
    
    /*public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
    	setLightValue(0.5f);
    }
    */
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	setLightValue(0.8f);
    	
    	activated = true;
    	num_chicken = 0;
    	num_cow = 0;
    	num_pig = 0;
    	num_zombie = 0;
    	num_skeleton = 0;
    	num_spider = 0;
        num_zombie2 = 0;
        num_zombiepigman = 0;
        num_cavespider = 0;
        num_creeper = 0;
        num_blaze = 0;
        num_witch = 0;
        num_boss = 0;
        boss_health = 20;
        
        //par1World.setBlock(par2, par3, par4, PabiModBase.StartArenaGlowing.blockID);
        
    	par1World.scheduleBlockUpdate(par2, par3, par4, blockID, 1);
        return false;
    }
    

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) 
    {
    	if(activated == true)
    	{
    		if(allcreatures.size()<maxnumcreatures)
    		{
    			if(num_zombie < maxnum_zombie)
    			{
    				EntityZombie zombie = new EntityZombie(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				zombie.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(zombie);
    				num_zombie++;
    				allcreatures.add(zombie);
    			}
    			else if(num_skeleton < maxnum_skeleton)
    			{
    				EntitySkeleton skeleton = new EntitySkeleton(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				skeleton.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(skeleton);
    				skeleton.setCurrentItemOrArmor(0, new ItemStack(Item.bow));
    				num_skeleton++;
    				allcreatures.add(skeleton);	
    			}
    			else if(num_chicken < maxnum_chicken)
    			{
    				EntityChicken chk = new EntityChicken(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				chk.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(chk);
    				/*if(chk.isDead){
    					chk.dropItem(Item.flintAndSteel.itemID, 1);
    				}
    				chk.dropItem(Item.swordDiamond.itemID, 1);
    				chk.dropItem(Item.appleGold.itemID, 1);
    				chk.dropItem(Item.potion.itemID, 1);*/
    				num_chicken++;
    				allcreatures.add(chk);
    			}
    			else if(num_spider < maxnum_spider)
    			{
    				EntitySpider spider = new EntitySpider(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				spider.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(spider);
    				num_spider++;
    				allcreatures.add(spider);	
    			}
    			else if(num_zombie2 < maxnum_zombie2)
    			{
    				EntityZombie zombie2 = new EntityZombie(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				zombie2.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(zombie2);
    				zombie2.setCurrentItemOrArmor(0, new ItemStack(Item.swordStone));
    				num_zombie2++;
    				allcreatures.add(zombie2);
    			}
    			else if(num_pig < maxnum_pig)
    			{
    				EntityPig pig = new EntityPig(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				pig.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(pig);
    				num_pig++;
    				allcreatures.add(pig);
    			}
    			else if(num_zombiepigman < maxnum_zombiepigman)
    			{
    				EntityPigZombie zombiepigman = new EntityPigZombie(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				zombiepigman.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(zombiepigman);
    				zombiepigman.setCurrentItemOrArmor(0, new ItemStack(Item.swordGold));
    				num_zombiepigman++;
    				allcreatures.add(zombiepigman);
    			}
    			else if(num_cavespider < maxnum_cavespider)
    			{
    				EntityCaveSpider cavespider = new EntityCaveSpider(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				cavespider.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(cavespider);
    				num_cavespider++;
    				allcreatures.add(cavespider);
    			}
    			else if(num_creeper < maxnum_creeper)
    			{
    				EntityCreeper creeper = new EntityCreeper(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				creeper.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(creeper);
    				num_creeper++;
    				allcreatures.add(creeper);
    			}
        		else if(num_cow < maxnum_cow)
    			{
    				EntityCow cow = new EntityCow(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				cow.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(cow);
    				num_cow++;
    				allcreatures.add(cow);
    			}
        		else if(num_blaze < maxnum_blaze)
    			{
    				EntityBlaze blaze = new EntityBlaze(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				blaze.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(blaze);
    				num_blaze++;
    				allcreatures.add(blaze);
    			}
        		else if(num_minizombie < maxnum_minizombie)
    			{
    				EntityZombie minizombie = new EntityZombie(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				minizombie.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(minizombie);
    				minizombie.setCurrentItemOrArmor(0, new ItemStack(Item.swordStone));
    				minizombie.setCurrentItemOrArmor(1, new ItemStack(Item.bootsChain));
    				minizombie.setCurrentItemOrArmor(2, new ItemStack(Item.legsChain));
    				minizombie.setCurrentItemOrArmor(3, new ItemStack(Item.plateChain));
    				minizombie.setCurrentItemOrArmor(4, new ItemStack(Item.helmetChain));
    				minizombie.setChild(true);
    				minizombie.setSneaking(true);
    				num_minizombie++;
    				allcreatures.add(minizombie);
    			}
        		else if(num_witch < maxnum_witch)
    			{
        			EntityBlaze witch = new EntityBlaze(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				witch.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(witch);
    				num_witch++;
    				allcreatures.add(witch);
    			}
        		else if(num_silverfish < maxnum_silverfish)
    			{
    				EntitySilverfish silverfish = new EntitySilverfish(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				silverfish.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(silverfish);
    				num_silverfish++;
    				allcreatures.add(silverfish);
    			}
        		else if(num_magmacube < maxnum_magmacube)
    			{
    				EntityMagmaCube magmacube = new EntityMagmaCube(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				magmacube.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(magmacube);
    				num_magmacube++;
    				allcreatures.add(magmacube);
    			}
        		else if(num_wizard < maxnum_wizard)
    			{
    				EntityMobWizard wizard = new EntityMobWizard(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				wizard.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(wizard);
    				wizard.setCurrentItemOrArmor(0, new ItemStack(PabiModBase.Wand));
    				num_wizard++;
    				allcreatures.add(wizard);
    			}
        		else if (allcreatures.size() == 0 && getMaxCreatures()-1 == getNumCreated())
    			{
        			EntityZombie boss = new EntityZombie(par1World);
    				Vec3 vec = util.placeInRandomDir(par2, par3, par4, 5);
    				boss.setPosition(vec.xCoord, vec.yCoord, vec.zCoord);
    				par1World.spawnEntityInWorld(boss);
    				ItemStack diamondsword = new ItemStack(Item.swordDiamond);
    				diamondsword.addEnchantment(Enchantment.sharpness, 1);
    				diamondsword.addEnchantment(Enchantment.knockback, 2);
    				boss.setCurrentItemOrArmor(0, diamondsword);
    				boss.setCurrentItemOrArmor(3, new ItemStack(Item.plateDiamond));
    				boss.setCurrentItemOrArmor(2, new ItemStack(Item.legsDiamond));
    				boss.setCurrentItemOrArmor(1, new ItemStack(Item.bootsDiamond));
    				boss.setCurrentItemOrArmor(4, new ItemStack(Item.helmetDiamond));
    				boss.setEntityHealth(boss_health+=5);
    				num_boss++;
    				allcreatures.add(boss);
    			}
        		else if (getMaxCreatures() <= getNumCreated() && allcreatures.size() == 0)
        		{
        			num_chicken = 0;
        	    	num_cow = 0;
        	    	num_pig = 0;
        	    	num_zombie = 0;
        	    	num_skeleton = 0;
        	    	num_spider = 0;
        	        num_zombie2 = 0;
        	        num_zombiepigman = 0;
        	        num_cavespider = 0;
        	        num_creeper = 0;
        	        num_blaze = 0;
        	        num_minizombie = 0;
        	        num_witch = 0;
        	        num_magmacube = 0;
        	        num_silverfish = 0;
        	        
        	        maxnum_zombie +=3;
        	        maxnum_skeleton++;
        	        maxnum_spider++;
        	        maxnum_zombie2++;
        	        maxnum_zombiepigman ++;
        	        maxnum_cavespider ++;
        	        maxnum_creeper++;
        	        maxnumcreatures +=2;
        	        maxnum_blaze ++;
        	        maxnum_minizombie +=2;
        	        maxnum_witch ++;
        	        maxnum_magmacube ++;
        	        maxnum_silverfish ++;
        	        
        		}
    	        
    		}
    		for( int i = allcreatures.size()-1;i>=0;i--)
    		{
    			if (allcreatures.get(i).isDead)
    			{
    				allcreatures.remove(i);
    			}
    		}
    		

    		
    		par1World.scheduleBlockUpdate(par2, par3, par4, blockID, 60);
    	}
    }	
        	
    protected int getMaxCreatures()
    {
    	return maxnum_blaze+maxnum_cavespider+maxnum_chicken+maxnum_cow+maxnum_pig+maxnum_skeleton+maxnum_spider+maxnum_zombie+maxnum_zombie2+maxnum_zombiepigman+maxnum_witch+maxnum_boss+maxnum_creeper+maxnum_minizombie+maxnum_magmacube+maxnum_silverfish+maxnum_wizard;
    }
       
    protected int getNumCreated()
    {
    	return num_blaze+num_cavespider+num_chicken+num_cow+num_pig+num_skeleton+num_spider+num_zombie+num_zombie2+num_zombiepigman+num_boss+num_witch+num_creeper+num_minizombie+num_magmacube+num_silverfish+num_wizard;
    }
    private boolean activated = false; 
    
    private int numloop = 0;
    private int numwave = 0;
    
    private int maxnumcreatures = 8;
    private int num_cow = 0;
    private int num_chicken = 0;
    private int num_pig = 0;
    private int num_zombie = 0;
    private int num_zombie2 = 0;
    private int num_skeleton = 0;
    private int num_spider = 0;
    private int num_zombiepigman = 0;
    private int num_cavespider = 0;
    private int num_creeper = 0;
    private int num_minizombie = 0;
    private int num_magmacube = 0;
    private int num_silverfish = 0;
    
    private int num_blaze = 0;
    private int num_witch = 0;
    private int num_wizard = 0;
    
    private int num_boss = 0;
    
    private int maxnum_cow = 5;
    private int maxnum_chicken = 5;
    private int maxnum_pig = 5;
    private int maxnum_zombie = 5;
    private int maxnum_skeleton = 6;
    private int maxnum_spider = 5;
    private int maxnum_zombie2 = 5;
    private int maxnum_zombiepigman = 3;
    private int maxnum_cavespider = 3;
    private int maxnum_creeper = 3;
    private int maxnum_minizombie = 4;
    private int maxnum_magmacube = 2;
    private int maxnum_silverfish = 5;
    
    private int maxnum_blaze = 1;
    private int maxnum_witch = 1;
    private int maxnum_wizard = 1;
    
    private int maxnum_boss = 1;
    
    private int boss_health = 20;
    
    private ArrayList<EntityLiving> allcreatures = new ArrayList<EntityLiving>();
    
        
}
        
     
        
       