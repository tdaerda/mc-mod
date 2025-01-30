package com.my66.fire.util;

import net.minecraft.world.item.*;
import com.my66.fire.*;
import com.my66.fire.items.*;
import com.my66.fire.tools.*;
import net.minecraftforge.registries.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.javafmlmod.*;

public class RegistryHandler {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,"fire");
	//物品组
	
	public static void init() {
	//注册信箱（函数）
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//物品
	public static final RegistryObject<Item> SHINGLE = ITEMS.register("shingle",ItemBase::new);
	////砾石
	
	//工具 剑=SwordItem 工具=ToolItem
	public static final RegistryObject<ToolItem> OLDOWAN_SWORD = ITEMS.register("oldowan_sword", () -> new ToolItem(ModItemTier.OLDOWAN, 2, 2, new Item.Properties().tab(fire.TAB)));
	////奥杜威砍砸器
}
