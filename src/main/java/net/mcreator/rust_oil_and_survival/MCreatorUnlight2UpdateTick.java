package net.mcreator.rust_oil_and_survival;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

@Elementsrust_oil_and_survival.ModElement.Tag
public class MCreatorUnlight2UpdateTick extends Elementsrust_oil_and_survival.ModElement {
	public MCreatorUnlight2UpdateTick(Elementsrust_oil_and_survival instance) {
		super(instance, 20);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorUnlight2UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorUnlight2UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorUnlight2UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorUnlight2UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() <= 0.5)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorUnlight3.block.getDefaultState(), 3);
		}
	}
}
