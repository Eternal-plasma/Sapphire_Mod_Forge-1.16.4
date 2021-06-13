package com.eternalplasma.smep.util;


import com.eternalplasma.smep.Main;
import com.eternalplasma.smep.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	private static final DeferredRegister  ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
	
	
	//items
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);
	
	
	public static void init()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
