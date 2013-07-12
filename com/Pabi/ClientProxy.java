package com.Pabi;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	public int addArmor(String armor){
	return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	public void printMessageToPlayer(String msg) {
    }
}
