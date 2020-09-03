package net.renarld.beyondvanilla.item;

import net.minecraft.item.Item;
import net.renarld.beyondvanilla.mixin.BerryGrinderMixin;

public class BerryGrinder extends Item {

	public BerryGrinder(Settings settings) {
		super(settings);
		((BerryGrinderMixin)this).setRecipeRemainder(this);
	}
}
