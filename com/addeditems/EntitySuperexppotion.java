/*package com.addeditems;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySuperexppotion extends EntityExpBottle {
public EntitySuperexppotion(World par1World) {
super(par1World);
}
	public EntitySuperexppotion(World par1World,
	EntityLivingBase par2EntityLivingBase) {
	super(par1World, par2EntityLivingBase);
	}
	public EntitySuperexppotion(World par1World, double par2, double par4,
	double par6) {
	super(par1World, par2, par4, par6);
	
	}
	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
	{
        if (!this.worldObj.isRemote)
        {
            this.worldObj.playAuxSFX(2002, (int)Math.round(this.posX), (int)Math.round(this.posY), (int)Math.round(this.posZ), 0);
            int i = 3 + this.worldObj.rand.nextInt(5) + this.worldObj.rand.nextInt(5);

            while (i > 0)
            {
                int j = EntityXPOrb.getXPSplit(i);
                i -= j;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
            }

            this.setDead();
        }
	}
} */








/*public class EntitySuperexppotion extends EntityThrowable
{
    public EntitySuperexppotion(World par1World, EntityPlayer par3EntityPlayer)
    {
        super(par1World);
    }

    public EntitySuperexppotion(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntitySuperexppotion(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    /*protected float getGravityVelocity()
    {
        return 0.07F;
    }

    protected float func_70182_d()
    {
        return 0.7F;
    }

    protected float func_70183_g()
    {
        return -20.0F;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     *//*
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (!this.worldObj.isRemote)
        {
            this.worldObj.playAuxSFX(2002, (int)Math.round(this.posX), (int)Math.round(this.posY), (int)Math.round(this.posZ), 0);
            int i = 3 + this.worldObj.rand.nextInt(500) + this.worldObj.rand.nextInt(5);

            while (i > 0)
            {
                int j = EntityXPOrb.getXPSplit(i);
                i -= j;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
            }

            this.setDead();
        }
    }
}*/
