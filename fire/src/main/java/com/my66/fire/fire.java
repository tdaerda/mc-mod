package com.my66.fire;

import com.my66.fire.util.*;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fire")
public class fire {
	// Directly reference a slf4j logger
	private static final Logger LOGGER = LogUtils.getLogger();

	public fire() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		RegistryHandler.init();

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	private void enqueueIMC(final InterModEnqueueEvent event) {

	}
	
	public static final CreativeModeTab TAB = new CreativeModeTab("fire_SA") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(RegistryHandler.SHINGLE.get());
		}
	};
}