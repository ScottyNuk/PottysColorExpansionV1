package net.potty.colorexp;

import net.fabricmc.api.ModInitializer;

import net.potty.colorexp.block.ColorBlocks;
import net.potty.colorexp.item.DyeItems;
import net.potty.colorexp.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorExp implements ModInitializer {
	public static final String MOD_ID = "colorexp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();


		DyeItems.registerDyeItems();
		ColorBlocks.registerColorBlocks();


	}
}