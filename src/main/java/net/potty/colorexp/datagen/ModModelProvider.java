package net.potty.colorexp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.potty.colorexp.block.ColorBlocks;
import net.potty.colorexp.item.DyeItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ColorBlocks.LIGHT_RED_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ColorBlocks.LIGHT_RED_CONCRETE_POWDER);
        blockStateModelGenerator.registerGlassPane(ColorBlocks.LIGHT_RED_GLASS, ColorBlocks.LIGHT_RED_GLASS_PANE);
        blockStateModelGenerator.registerWoolAndCarpet(ColorBlocks.LIGHT_RED_WOOL, ColorBlocks.LIGHT_RED_CARPET);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DyeItems.LIGHT_RED_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.DARK_RED_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_ORANGE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.KUMQUAT_ORANGE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_YELLOW_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_LIME_GREEN_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.RICH_LAWN_LIME_GREEN_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_GREEN_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.MUTED_IRISH_GREEN_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIME_TURQUOISE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.BABY_BLUE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.BLUE_PERIWINKLE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.PURPUREUS_MAGENTA_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_PINK_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.HOT_PINK_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.DARK_BLUE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_PURPLE_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.ENDER_GREEN_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.BERRY_RED_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.DARK_MAGENTA_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.LIGHT_BROWN_DYE, Models.GENERATED);
        itemModelGenerator.register(DyeItems.DARK_BROWN_DYE, Models.GENERATED);
    }
}
