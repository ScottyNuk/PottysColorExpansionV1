package net.potty.colorexp;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.potty.colorexp.datagen.ModBlockTagProvider;
import net.potty.colorexp.datagen.ModItemTagProvider;
import net.potty.colorexp.datagen.ModLootTableProvider;
import net.potty.colorexp.datagen.ModModelProvider;

public class ColorExpDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);


	}
}
