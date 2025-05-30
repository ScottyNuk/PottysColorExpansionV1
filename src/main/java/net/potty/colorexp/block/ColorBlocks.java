package net.potty.colorexp.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.potty.colorexp.ColorExp;
import net.potty.colorexp.block.custom.CustomGlassBlock;
import net.potty.colorexp.block.custom.CustomGlassPaneBlock;
import net.potty.colorexp.block.custom.PowderBlock;

public class ColorBlocks {

    public static final Block LIGHT_RED_CONCRETE = registerBlock("light_red_concrete",
            new Block(AbstractBlock.Settings.create()));
    public static final Block LIGHT_RED_CONCRETE_POWDER = registerBlock("light_red_concrete_powder",
            new PowderBlock(
                    AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND),ColorBlocks.LIGHT_RED_CONCRETE::getDefaultState));


    public static final Block LIGHT_RED_WOOL = registerBlock("light_red_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));





    public static final Block LIGHT_RED_GLASS = registerBlock("light_red_glass",
            new CustomGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque().mapColor(MapColor.PINK)));

    public static final Block LIGHT_RED_GLASS_PANE = registerBlock("light_red_glass_pane",
            new CustomGlassPaneBlock());















    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ColorExp.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ColorExp.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }
    public static void registerColorBlocks() {
        ColorExp.LOGGER.info("Registering Color Blocks for " + ColorExp.MOD_ID);
    }
}
