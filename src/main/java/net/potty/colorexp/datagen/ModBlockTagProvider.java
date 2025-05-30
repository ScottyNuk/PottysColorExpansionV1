package net.potty.colorexp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.potty.colorexp.block.ColorBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ColorBlocks.LIGHT_RED_CONCRETE)
                .add(ColorBlocks.LIGHT_RED_GLASS)
                .add(ColorBlocks.LIGHT_RED_GLASS_PANE);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ColorBlocks.LIGHT_RED_CONCRETE_POWDER);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ColorBlocks.LIGHT_RED_CONCRETE)
                .add(ColorBlocks.LIGHT_RED_CONCRETE_POWDER)
                .add(ColorBlocks.LIGHT_RED_GLASS)
                .add(ColorBlocks.LIGHT_RED_GLASS_PANE);


    }
}
