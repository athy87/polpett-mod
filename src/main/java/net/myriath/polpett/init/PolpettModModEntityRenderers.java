/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.client.renderer.PolpettRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PolpettModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PolpettModModEntities.POLPETT.get(), PolpettRenderer::new);
	}
}