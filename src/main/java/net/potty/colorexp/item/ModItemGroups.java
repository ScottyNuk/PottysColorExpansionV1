package net.potty.colorexp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.potty.colorexp.ColorExp;
import net.potty.colorexp.block.ColorBlocks;

public class ModItemGroups {

    public static final ItemGroup DYES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ColorExp.MOD_ID, "dyes"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(DyeItems.LIME_TURQUOISE_DYE))
                    .displayName(Text.translatable("itemgroup.colorexp.dyes"))
                    .entries((displayContext, entries) -> {
                        entries.add(DyeItems.LIGHT_RED_DYE);
                        entries.add(DyeItems.DARK_RED_DYE);
                        entries.add(DyeItems.LIGHT_ORANGE_DYE);
                        entries.add(DyeItems.KUMQUAT_ORANGE_DYE);
                        entries.add(DyeItems.LIGHT_YELLOW_DYE);
                        entries.add(DyeItems.LIGHT_LIME_GREEN_DYE);
                        entries.add(DyeItems.RICH_LAWN_LIME_GREEN_DYE);
                        entries.add(DyeItems.LIGHT_GREEN_DYE);
                        entries.add(DyeItems.MUTED_IRISH_GREEN_DYE);
                        entries.add(DyeItems.LIME_TURQUOISE_DYE);
                        entries.add(DyeItems.BABY_BLUE_DYE);
                        entries.add(DyeItems.BLUE_PERIWINKLE_DYE);
                        entries.add(DyeItems.PURPUREUS_MAGENTA_DYE);
                        entries.add(DyeItems.LIGHT_PINK_DYE);
                        entries.add(DyeItems.HOT_PINK_DYE);
                        entries.add(DyeItems.DARK_BLUE_DYE);
                        entries.add(DyeItems.LIGHT_PURPLE_DYE);
                        entries.add(DyeItems.ENDER_GREEN_DYE);
                        entries.add(DyeItems.BERRY_RED_DYE);
                        entries.add(DyeItems.DARK_MAGENTA_DYE);
                        entries.add(DyeItems.LIGHT_BROWN_DYE);
                        entries.add(DyeItems.DARK_BROWN_DYE);
                    }).build());
    public static final ItemGroup COLORED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ColorExp.MOD_ID, "colored_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ColorBlocks.LIGHT_RED_CONCRETE))
                    .displayName(Text.translatable("itemgroup.colorexp.colored_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ColorBlocks.LIGHT_RED_CONCRETE);
                        entries.add(ColorBlocks.LIGHT_RED_CONCRETE_POWDER);
                        entries.add(ColorBlocks.LIGHT_RED_WOOL);
                        entries.add(ColorBlocks.LIGHT_RED_GLASS);
                        entries.add(ColorBlocks.LIGHT_RED_GLASS_PANE);
                    }).build());

    public static void  registerItemGroups() {
        ColorExp.LOGGER.info(("Registering Item Groups for " + ColorExp.MOD_ID));

    }
}
