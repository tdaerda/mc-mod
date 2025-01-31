package com.my66.fire.block;

import com.my66.fire.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

public class BlockItemBase extends BlockItem {
	public BlockItemBase(Block block) {
		super(block, new Item.Properties().tab(fire.SA_TAB));
	}
}