package com.mrh0.createaddition.index;

import com.simibubi.create.Create;
import com.simibubi.create.content.curiosities.weapons.PotatoCannonProjectileTypes;

public class CAPotatoCannonProjectiles {
	
	public static final PotatoCannonProjectileTypes 
		CHOCOLATE_CAKE = create("chocolate_cake")
			.damage(8)
			.reloadTicks(15)
			.knockback(0.1f)
			.velocity(1.1f)
			.renderTumbling()
			.sticky()
			.soundPitch(1.0f)
			.registerAndAssign(CABlocks.CHOCOLATE_CAKE.get()),
		HONEY_CAKE = create("honey_cake")
			.damage(8)
			.reloadTicks(15)
			.knockback(0.1f)
			.velocity(1.1f)
			.renderTumbling()
			.sticky()
			.soundPitch(1.0f)
			.onEntityHit(potion(Effects.SLOWNESS, 3,320))
			.registerAndAssign(CABlocks.HONEY_CAKE.get()),
		BLAZE_ROD = create("blaze_rod")
			.damage(1)
			.reloadTicks(15)
			.knockback(1.05f)
			.velocity(1.1f)
			.renderTumbling()
			.soundPitch(1.0f)
			.onEntityHit(ray -> ray.getEntity().setFire(20))
			.registerAndAssign(Items.BLAZE_ROD.get());
	
	public static void register() {
		
	}
	
	private static PotatoCannonProjectileTypes.Builder create(String name) {
		return new PotatoCannonProjectileTypes.Builder(Create.asResource(name));
	}
}
