package com.my66.fire.util;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import com.my66.fire.*;
import com.my66.fire.items.*;
import com.my66.fire.tools.*;
import com.my66.fire.block.*;
import net.minecraftforge.registries.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.javafmlmod.*;

public class RegistryHandler {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "fire");
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "fire");
	//物品组
	
	public static void init() {
	//注册信箱（函数）
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
//物品
//	public static final RegistryObject<Item> SHINGLE = ITEMS.register("shingle",ItemBase::new);
////砾石
	
//方块
	public static final RegistryObject<Item> SHINGLE = ITEMS.register("shingle",ItemBase::new);
////砾石
	public static final RegistryObject<Block> SHINGLE_BLOCK = BLOCKS.register("shingle_block", shingleBlock::new);
//////放地上
	public static final RegistryObject<Item> SHINGLE_BLOCK_ITEM = ITEMS.register("shingle_block",() -> new BlockItemBase(SHINGLE_BLOCK.get()));
//////拿在手上

	//工具 剑=SwordItem 工具=ToolItem
	public static final RegistryObject<PickaxeItem> OLDOWAN_SWORD = ITEMS.register("oldowan_sword", () -> new PickaxeItem(ModItemTier.OLDOWAN, 2, 2, new Item.Properties().tab(fire.SA_TAB)));
	////奥杜威砍砸器
}
