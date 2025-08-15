/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.client.model.Modelpolpett;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PolpettModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpolpett.LAYER_LOCATION, Modelpolpett::createBodyLayer);
	}
}