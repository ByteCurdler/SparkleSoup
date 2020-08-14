
package net.mostwonderfulboy.sparklesoup.itemgroup;

import net.mostwonderfulboy.sparklesoup.block.SportleBlock;
import net.mostwonderfulboy.sparklesoup.SparklesoupModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SparklesoupModElements.ModElement.Tag
public class SparkleSoupItemGroup extends SparklesoupModElements.ModElement {
	public SparkleSoupItemGroup(SparklesoupModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsparkle_soup") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SportleBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
