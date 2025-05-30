package net.potty.colorexp;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.potty.colorexp.block.ColorBlocks;

public class ColorExpClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),

                ColorBlocks.LIGHT_RED_GLASS,
                ColorBlocks.LIGHT_RED_GLASS_PANE
        );
    }
}
