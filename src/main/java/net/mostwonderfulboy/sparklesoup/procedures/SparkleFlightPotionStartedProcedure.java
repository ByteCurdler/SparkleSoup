package net.mostwonderfulboy.sparklesoup.procedures;

import net.mostwonderfulboy.sparklesoup.SparklesoupModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@SparklesoupModElements.ModElement.Tag
public class SparkleFlightPotionStartedProcedure extends SparklesoupModElements.ModElement {
	public SparkleFlightPotionStartedProcedure(SparklesoupModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SparkleFlightPotionStarted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.allowFlying = (true);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
