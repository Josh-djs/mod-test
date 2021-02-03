package jukebro.firstmod.proxy;

import jukebro.firstmod.init.Items;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() 
	{
		Items.registerRenders();
	}
}
