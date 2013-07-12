package com.PabiCodes;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderMobWizard extends RenderBiped {

	/**
	 * Render the wizard mob model in game so it can spawn and is visible.
	 */
        protected ModelZombie model;
        
        public RenderMobWizard(ModelBiped par1ModelBase, float par2) {
                super(new ModelSkeleton(), par2);
                model = ((ModelZombie)mainModel);
        }
        
        public void renderWizard(EntityMobWizard entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderWizard((EntityMobWizard)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderWizard((EntityMobWizard)par1Entity, par2, par4, par6, par8, par9);
    }

	

/*
	private static final ResourceLocation field_110888_a = new ResourceLocation("PabiModBase:textures/skin_wizard.png");
	private static final ResourceLocation field_110887_f = new ResourceLocation("PabiModBase:textures/skin_wizard.png");
	
	protected ResourceLocation func_110886_a(EntityMobWizard par1EntityMobWizard)
	{
	return field_110887_f;
	}
	protected ResourceLocation func_110775_a(Entity par1Entity)
	{
	return this.func_110886_a((EntityMobWizard) par1Entity);
	}
*/
}