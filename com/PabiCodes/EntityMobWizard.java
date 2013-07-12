package com.PabiCodes;

import java.util.UUID;

import com.Pabi.pabimodbase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMobWizard extends EntityMob{
	
	private static final UUID field_110189_bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");

	private static final AttributeModifier field_110190_br = (new AttributeModifier(field_110189_bq, "Attacking speed boost", 0.25D, 0)).func_111168_a(false);
	
	/**
	 * Add wizard mob and its parameters (damage, speed, break doors, drops, etc)..
	 */
        public EntityMobWizard(World par1World) 
        {
            super(par1World);
            //this.texture = "/mods/PabiModBase/textures/skin_wizard.png";
            //this.moveSpeed = 0.25F;
            //this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
            this.tasks.addTask(4, new EntityAIWander(this, 0.65D));
            this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIBreakDoor(this));
	        //this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
	        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        //this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, true));
	        this.setCurrentItemOrArmor(0, new ItemStack(pabimodbase.ThorAxe));
	        
	        
        }
        
        public int getAttackStrength(Entity par1Entity)
	    {
        	return 6;
	    }
        
        protected boolean isAIEnabled()
	    {
	        return true;
	    }

        public int getMaxHealth() 
        {
                return 45;
        }
        
         public String getTexture()
         {
        	 return "/mods/pabimodbase/textures/skin_wizard.png";
         }

        public int getTotalArmorValue()
        {
            return 6;
        }

        protected String getLivingSound()
        {
            return "mob.witch.say";
        }

	    protected String getHurtSound()
	    {
	        return "mob.witch.hurt";
	    }
	    
	    protected String getDeathSound()
	    {
	        return "mob.witch.death";
	    }
            
        protected void playStepSound(int par1, int par2, int par3, int par4)
        {
            this.worldObj.playSoundAtEntity(this, "mob.witch.step", 0.15F, 1.0F);
        }
        
        protected int getDropItemId()
        {
            return pabimodbase.Wand.itemID;
        }
            
        protected void dropRareDrop(int par1)
        {
        	switch(this.rand.nextInt(5))
        			{
        		case 0:
        			this.dropItem(pabimodbase.FireWand.itemID, 1);
        			break;
        		case 1:
        			this.dropItem(pabimodbase.FlyWand.itemID, 1);
        			break;
        		case 2:
        			this.dropItem(pabimodbase.TnTWand.itemID, 1);
        			break;
        		case 3:
        			this.dropItem(pabimodbase.SpeedWand.itemID, 1);
        			break;
        		case 4:
        			this.dropItem(pabimodbase.PoisonWand.itemID, 1);
        			break;
        			}
        }
        public void onLivingUpdate()
        {
            if (!this.worldObj.isRemote)
            {
                ticks++;
                
                if ((ticks + nextThrowTick) %150 == 0)
                {
                    nextThrowTick = (int)(Math.random() * 75);
                //  ItemStack healPotion = new ItemStack(new Item.po);
                //  ItemPotion potion = new ItemPotion(par1)
                // +2 is instant damage
                // +4 is invisibility
                // +7 is regeneration
                // +8 is speed
                // +9 is fire resistance
                // +10 is poison
                // +11 is instant health
                // +12 is night vision
                // +14 is weakness
                // +15 is strength
                // +16 is slowness
                // +18 is instant damage
                // +20 is invisibility 
                // +23 is regeneration 2
                // +24 is speed 2
                // +31 is strength 2
                    this.worldObj.spawnEntityInWorld(new EntityPotion(this.worldObj, this, Potion.regeneration.id + 10));
                    this.worldObj.spawnEntityInWorld(new EntityPotion(this.worldObj, this, Potion.regeneration.id + 24));
                    this.worldObj.spawnEntityInWorld(new EntityPotion(this.worldObj, this, Potion.regeneration.id + 14));
                }
               
            }

            super.onLivingUpdate();
        }
        
        private int ticks = 0;
        private int nextThrowTick = 20;
        
       
            
            
        
}