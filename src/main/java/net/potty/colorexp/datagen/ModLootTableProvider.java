package net.potty.colorexp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.potty.colorexp.block.ColorBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ColorBlocks.LIGHT_RED_CONCRETE);
        addDrop(ColorBlocks.LIGHT_RED_CONCRETE_POWDER);
        addDrop(ColorBlocks.LIGHT_RED_GLASS);
        addDrop(ColorBlocks.LIGHT_RED_GLASS_PANE);

    }
}
