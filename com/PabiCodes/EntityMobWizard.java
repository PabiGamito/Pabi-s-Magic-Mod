package com.PabiCodes;

import java.util.UUID;

import com.Pabi.pabimodbase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLivingData;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMobWizard extends EntityMob{
	
	protected static final Attribute field_110186_bp = (new RangedAttribute("zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).func_111117_a("Spawn Reinforcements Chance");
	//private static final UUID field_110189_bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final UUID field_110187_bq = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");;
    
	private static final AttributeModifier field_110190_br = (new AttributeModifier(field_110187_bq , "Attacking speed boost", 0.25D, 0)).func_111168_a(false);
	
	/**
	 * Add wizard mob and its parameters (damage, speed, break doors, drops, etc)..
	 */
    public EntityMobWizard(World par1World)
    {
        super(par1World);
        this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
    }
        
        public int getAttackStrength(Entity par1Entity)
	    {
        	return 6;
	    }
        
        protected boolean isAIEnabled()
	    {
	        return true;
	    }


        
         public String getTexture()
         {
        	 return "mods/pabimodbase/textures/entity/skin_wizard.png";
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
        
       
        public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
        {
            if (!super.attackEntityFrom(par1DamageSource, par2))
            {
                return false;
            }
            else
            {
                EntityLivingBase entitylivingbase = this.getAttackTarget();

                if (entitylivingbase == null && this.getEntityToAttack() instanceof EntityLivingBase)
                {
                    entitylivingbase = (EntityLivingBase)this.getEntityToAttack();
                }

                if (entitylivingbase == null && par1DamageSource.getEntity() instanceof EntityLivingBase)
                {
                    entitylivingbase = (EntityLivingBase)par1DamageSource.getEntity();
                }

                if (entitylivingbase != null && this.worldObj.difficultySetting >= 3 && (double)this.rand.nextFloat() < this.func_110148_a(field_110186_bp).func_111126_e())
                {
                    int i = MathHelper.floor_double(this.posX);
                    int j = MathHelper.floor_double(this.posY);
                    int k = MathHelper.floor_double(this.posZ);
                    EntityMobWizard EntityMobWizard = new EntityMobWizard(this.worldObj);

                    for (int l = 0; l < 50; ++l)
                    {
                        int i1 = i + MathHelper.getRandomIntegerInRange(this.rand, 7, 40) * MathHelper.getRandomIntegerInRange(this.rand, -1, 1);
                        int j1 = j + MathHelper.getRandomIntegerInRange(this.rand, 7, 40) * MathHelper.getRandomIntegerInRange(this.rand, -1, 1);
                        int k1 = k + MathHelper.getRandomIntegerInRange(this.rand, 7, 40) * MathHelper.getRandomIntegerInRange(this.rand, -1, 1);

                        if (this.worldObj.doesBlockHaveSolidTopSurface(i1, j1 - 1, k1) && this.worldObj.getBlockLightValue(i1, j1, k1) < 10)
                        {
                            EntityMobWizard.setPosition((double)i1, (double)j1, (double)k1);

                            if (this.worldObj.checkNoEntityCollision(EntityMobWizard.boundingBox) && this.worldObj.getCollidingBoundingBoxes(EntityMobWizard, EntityMobWizard.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(EntityMobWizard.boundingBox))
                            {
                                this.worldObj.spawnEntityInWorld(EntityMobWizard);
                                EntityMobWizard.setAttackTarget(entitylivingbase);
                                EntityMobWizard.func_110161_a((EntityLivingData)null);
                                this.func_110148_a(field_110186_bp).func_111121_a(new AttributeModifier("Zombie reinforcement caller charge", -0.05000000074505806D, 0));
                                EntityMobWizard.func_110148_a(field_110186_bp).func_111121_a(new AttributeModifier("Zombie reinforcement callee charge", -0.05000000074505806D, 0));
                                break;
                            }
                        }
                    }
                }

                return true;
            }
        }
            
            
        
}