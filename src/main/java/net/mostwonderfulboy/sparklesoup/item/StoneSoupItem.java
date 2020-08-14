
package net.mostwonderfulboy.sparklesoup.item;

import net.mostwonderfulboy.sparklesoup.itemgroup.SparkleSoupItemGroup;
import net.mostwonderfulboy.sparklesoup.SparklesoupModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@SparklesoupModElements.ModElement.Tag
public class StoneSoupItem extends SparklesoupModElements.ModElement {
	@ObjectHolder("sparklesoup:stone_soup")
	public static final Item block = null;
	public StoneSoupItem(SparklesoupModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SparkleSoupItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(5).saturation(0.3f).build()));
			setRegistryName("stone_soup");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 1000;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
