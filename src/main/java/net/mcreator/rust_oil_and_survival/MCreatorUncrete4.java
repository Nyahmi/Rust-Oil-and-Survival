package net.mcreator.rust_oil_and_survival;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.Random;

@Elementsrust_oil_and_survival.ModElement.Tag
public class MCreatorUncrete4 extends Elementsrust_oil_and_survival.ModElement {
	@GameRegistry.ObjectHolder("rust_oil_and_survival:uncrete4")
	public static final Block block = null;

	public MCreatorUncrete4(Elementsrust_oil_and_survival instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("rust_oil_and_survival:uncrete4",
				"inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setRegistryName("uncrete4");
			setUnlocalizedName("uncrete4");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorUnblocks.tab);
			setBlockUnbreakable();
		}

		@Override
		public int tickRate(World world) {
			return 100;
		}

		@Override
		public int quantityDropped(Random random) {
			return 0;
		}
	}
}
