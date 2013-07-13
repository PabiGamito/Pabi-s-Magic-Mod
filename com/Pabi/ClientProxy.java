package com.Pabi;

import com.PabiCodes.RenderSuperexppotion;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {
	
	public int addArmor(String armor){
	return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	public void printMessageToPlayer(String msg) {
    }
		/*@Override
		public void registerRenderers() {
		EntityRegistry.registerGlobalEntityID(EntitySuperexppotion.class, "superExpPotion", EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(EntitySuperexppotion.class, new RenderSuperexppotion(pabimodbase.Superexppotion));
		}*/
}
