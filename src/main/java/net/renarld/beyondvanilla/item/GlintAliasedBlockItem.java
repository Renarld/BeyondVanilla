package net.renarld.beyondvanilla.item;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;

public class GlintAliasedBlockItem extends AliasedBlockItem {

    public GlintAliasedBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
