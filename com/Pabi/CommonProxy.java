package com.Pabi;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.client.MinecraftForgeClient;

public class CommonProxy 
{
	public static String ITEMS_PNG = "mods/PabiModBase/textures/items.png";
	public void registerRenderers()
	{
		//MinecraftForgeClient.preloadTexture("mods/PabiModBase/textures/items/super_2.png");
		//MinecraftForgeClient.preloadTexture("mods/PabiModBase/textures/items/super_1.png");

	}
	public int addArmor(String string){
		return 0;
	}
}
