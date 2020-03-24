package net.mcreator.rust_oil_and_survival;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@Elementsrust_oil_and_survival.ModElement.Tag
public class MCreatorUnblocks extends Elementsrust_oil_and_survival.ModElement {
	public MCreatorUnblocks(Elementsrust_oil_and_survival instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabunblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.BEDROCK, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
