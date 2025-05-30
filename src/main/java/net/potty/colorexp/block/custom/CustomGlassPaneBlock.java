package net.potty.colorexp.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.PaneBlock;

public class CustomGlassPaneBlock extends PaneBlock {
    public CustomGlassPaneBlock() {
        super(AbstractBlock.Settings.create()
                .nonOpaque()
                .solidBlock((state, world, pos) -> false)
                .suffocates((state, world, pos) -> false)
                .blockVision((state, world, pos) -> false));
    }
}
