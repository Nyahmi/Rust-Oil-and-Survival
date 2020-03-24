package net.mcreator.rust_oil_and_survival;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@Elementsrust_oil_and_survival.ModElement.Tag
public class MCreatorProps extends Elementsrust_oil_and_survival.ModElement {
	public MCreatorProps(Elementsrust_oil_and_survival instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabprops") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.IRON_DOOR, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
