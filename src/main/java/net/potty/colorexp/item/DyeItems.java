package net.potty.colorexp.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.potty.colorexp.ColorExp;

public class DyeItems {
    public static final Item LIGHT_RED_DYE = registerItem("light_red_dye", new Item(new Item.Settings()));
    public static final Item DARK_RED_DYE = registerItem("dark_red_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_ORANGE_DYE = registerItem("light_orange_dye", new Item(new Item.Settings()));
    public static final Item KUMQUAT_ORANGE_DYE = registerItem("kumquat_orange_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_YELLOW_DYE = registerItem("light_yellow_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_LIME_GREEN_DYE = registerItem("light_lime_green_dye", new Item(new Item.Settings()));
    public static final Item RICH_LAWN_LIME_GREEN_DYE = registerItem("rich_lawn_lime_green_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_GREEN_DYE = registerItem("light_green_dye", new Item(new Item.Settings()));
    public static final Item MUTED_IRISH_GREEN_DYE = registerItem("muted_irish_green_dye", new Item(new Item.Settings()));
    public static final Item LIME_TURQUOISE_DYE = registerItem("lime_turquoise_dye", new Item(new Item.Settings()));
    public static final Item BABY_BLUE_DYE = registerItem("baby_blue_dye", new Item(new Item.Settings()));
    public static final Item BLUE_PERIWINKLE_DYE = registerItem("blue_periwinkle_dye", new Item(new Item.Settings()));
    public static final Item PURPUREUS_MAGENTA_DYE = registerItem("purpureus_magenta_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_PINK_DYE = registerItem("light_pink_dye", new Item(new Item.Settings()));
    public static final Item HOT_PINK_DYE = registerItem("hot_pink_dye", new Item(new Item.Settings()));
    public static final Item DARK_BLUE_DYE = registerItem("dark_blue_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_PURPLE_DYE = registerItem("light_purple_dye", new Item(new Item.Settings()));
    public static final Item ENDER_GREEN_DYE = registerItem("ender_green_dye", new Item(new Item.Settings()));
    public static final Item BERRY_RED_DYE = registerItem("berry_red_dye", new Item(new Item.Settings()));
    public static final Item DARK_MAGENTA_DYE = registerItem("dark_magenta_dye", new Item(new Item.Settings()));
    public static final Item LIGHT_BROWN_DYE = registerItem("light_brown_dye", new Item(new Item.Settings()));
    public static final Item DARK_BROWN_DYE = registerItem("dark_brown_dye", new Item(new Item.Settings()));






   private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, Identifier.of(ColorExp.MOD_ID, name), item);
   }



    public static void registerDyeItems(){
        ColorExp.LOGGER.info("Registering Dye Items for " + ColorExp.MOD_ID);
    }
}
