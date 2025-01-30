package com.my66.fire.tools;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.*;
import com.my66.fire.util.*;

import java.util.function.*;

public enum ModItemTier implements Tier {
	
	OLDOWAN (
		1,
		131,
		1,
		2,
		5,
		() -> Ingredient.of(RegistryHandler.OLDOWAN_SWORD.get())
	);
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float ettackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> repairMateria;
	
	ModItemTier(
		int harvestLevel,
		int maxUses,
		float efficiency,
		float ettackDamage,
		int enchantability,
		Supplier<Ingredient> repairMateria
	) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.ettackDamage = ettackDamage;
		this.enchantability = enchantability;
		this.repairMateria = repairMateria;
	}
	
	public int getLevel() {
		return this.harvestLevel;
	}
	
	public int getUses() {
		return this.maxUses;
	}

	public float getSpeed() {
		return this.efficiency;
	}
	
	public float getAttackDamageBonus() {
		return this.ettackDamage;
	}
	
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return this.repairMateria.get();
	}
}