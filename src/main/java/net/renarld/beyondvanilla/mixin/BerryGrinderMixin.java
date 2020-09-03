package net.renarld.beyondvanilla.mixin;

import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface BerryGrinderMixin {
    @Accessor("recipeRemainder")
    void setRecipeRemainder(Item item);
}