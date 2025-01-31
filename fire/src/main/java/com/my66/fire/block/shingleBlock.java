package com.my66.fire.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;

public class shingleBlock extends Block {
	public shingleBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS)
			//.hardnssAndResistance(0, 0)
//挖掘时间和爆炸抗性
			//.harvestLevel(0)
//挖掘等级
		);
	}
}