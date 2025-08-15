package net.myriath.polpett.client.renderer;

import net.myriath.polpett.procedures.TypeSolProcedure;
import net.myriath.polpett.procedures.TypeKyProcedure;
import net.myriath.polpett.procedures.TypeJaneProcedure;
import net.myriath.polpett.procedures.SolWing3Procedure;
import net.myriath.polpett.procedures.SolWing2Procedure;
import net.myriath.polpett.procedures.SolWing1Procedure;
import net.myriath.polpett.procedures.SolTail3Procedure;
import net.myriath.polpett.procedures.SolTail2Procedure;
import net.myriath.polpett.procedures.SolTail1Procedure;
import net.myriath.polpett.procedures.SolMand3Procedure;
import net.myriath.polpett.procedures.SolMand2Procedure;
import net.myriath.polpett.procedures.SolMand1Procedure;
import net.myriath.polpett.procedures.SolGill3Procedure;
import net.myriath.polpett.procedures.SolGill2Procedure;
import net.myriath.polpett.procedures.SolGill1Procedure;
import net.myriath.polpett.procedures.SolEar3Procedure;
import net.myriath.polpett.procedures.SolEar2Procedure;
import net.myriath.polpett.procedures.SolEar1Procedure;
import net.myriath.polpett.procedures.SolAntler3Procedure;
import net.myriath.polpett.procedures.SolAntler2Procedure;
import net.myriath.polpett.procedures.SolAntler1Procedure;
import net.myriath.polpett.procedures.PolpettWearingZombieHeadProcedure;
import net.myriath.polpett.procedures.PolpettWearingWitherSkullProcedure;
import net.myriath.polpett.procedures.PolpettWearingSkullProcedure;
import net.myriath.polpett.procedures.PolpettWearingRedWoolHatProcedure;
import net.myriath.polpett.procedures.PolpettWearingPumpkinProcedure;
import net.myriath.polpett.procedures.PolpettWearingPlayerHeadProcedure;
import net.myriath.polpett.procedures.PolpettWearingPinkWoolHatProcedure;
import net.myriath.polpett.procedures.PolpettWearingMelonProcedure;
import net.myriath.polpett.procedures.PolpettWearingGreyWoolHatProcedure;
import net.myriath.polpett.procedures.PolpettWearingGreenWoolHatProcedure;
import net.myriath.polpett.procedures.PolpettWearingCreeperHeadProcedure;
import net.myriath.polpett.procedures.PolpettWearingBlueWoolHatProcedure;
import net.myriath.polpett.procedures.KyWing3Procedure;
import net.myriath.polpett.procedures.KyWing2Procedure;
import net.myriath.polpett.procedures.KyWing1Procedure;
import net.myriath.polpett.procedures.KyTail3Procedure;
import net.myriath.polpett.procedures.KyTail2Procedure;
import net.myriath.polpett.procedures.KyTail1Procedure;
import net.myriath.polpett.procedures.KyMand3Procedure;
import net.myriath.polpett.procedures.KyMand2Procedure;
import net.myriath.polpett.procedures.KyMand1Procedure;
import net.myriath.polpett.procedures.KyGill3Procedure;
import net.myriath.polpett.procedures.KyGill2Procedure;
import net.myriath.polpett.procedures.KyGill1Procedure;
import net.myriath.polpett.procedures.KyEar3Procedure;
import net.myriath.polpett.procedures.KyEar2Procedure;
import net.myriath.polpett.procedures.KyEar1Procedure;
import net.myriath.polpett.procedures.KyAntler3Procedure;
import net.myriath.polpett.procedures.KyAntler2Procedure;
import net.myriath.polpett.procedures.KyAntler1Procedure;
import net.myriath.polpett.procedures.JaneWing3Procedure;
import net.myriath.polpett.procedures.JaneWing2Procedure;
import net.myriath.polpett.procedures.JaneWing1Procedure;
import net.myriath.polpett.procedures.JaneTail3Procedure;
import net.myriath.polpett.procedures.JaneTail2Procedure;
import net.myriath.polpett.procedures.JaneTail1Procedure;
import net.myriath.polpett.procedures.JaneMand3Procedure;
import net.myriath.polpett.procedures.JaneMand2Procedure;
import net.myriath.polpett.procedures.JaneMand1Procedure;
import net.myriath.polpett.procedures.JaneGill3Procedure;
import net.myriath.polpett.procedures.JaneGill2Procedure;
import net.myriath.polpett.procedures.JaneGill1Procedure;
import net.myriath.polpett.procedures.JaneEar3Procedure;
import net.myriath.polpett.procedures.JaneEar2Procedure;
import net.myriath.polpett.procedures.JaneEar1Procedure;
import net.myriath.polpett.procedures.JaneAntler3Procedure;
import net.myriath.polpett.procedures.JaneAntler2Procedure;
import net.myriath.polpett.procedures.JaneAntler1Procedure;
import net.myriath.polpett.entity.PolpettEntity;
import net.myriath.polpett.client.model.animations.polpettAnimation;
import net.myriath.polpett.client.model.Modelpolpett;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PolpettRenderer extends MobRenderer<PolpettEntity, Modelpolpett<PolpettEntity>> {
	public PolpettRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelpolpett.LAYER_LOCATION)), 0.3f);
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_wither_skull_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingWitherSkullProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_pumpkin_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingPumpkinProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_melon_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingMelonProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_skull_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingSkullProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_player_head_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingPlayerHeadProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_zombie_head_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingZombieHeadProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_creeper_head_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingCreeperHeadProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_blue_wool_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingBlueWoolHatProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_green_wool_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingGreenWoolHatProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_red_wool_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingRedWoolHatProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_pink_wool_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingPinkWoolHatProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/polpett_grey_wool_hat.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PolpettWearingGreyWoolHatProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TypeKyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_bulb.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TypeKyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_antler1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyAntler1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_antler2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyAntler2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_antler3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyAntler3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_ear1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyEar1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_ear2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyEar2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_ear3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyEar3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_gill1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyGill1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_gill2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyGill2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_gill3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyGill3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_mand1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyMand1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_mand2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyMand2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_mand3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyMand3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_tail1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyTail1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_tail2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyTail2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_tail3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyTail3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_wing1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyWing1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_wing2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyWing2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/ky_wing3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KyWing3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TypeSolProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_bulb.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TypeSolProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_antler1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolAntler1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_antler2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolAntler2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_antler3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolAntler3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_ear1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolEar1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_ear2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolEar2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_ear3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolEar3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_gill1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolGill1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_gill2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolGill2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_gill3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolGill3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_mand1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolMand1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_mand2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolMand2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_mand3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolMand3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_tail1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolTail1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_tail2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolTail2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_tail3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolTail3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_wing1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolWing1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_wing2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolWing2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/sol_wing3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SolWing3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TypeJaneProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_bulb.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TypeJaneProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_antler1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneAntler1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_antler2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneAntler2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_antler3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneAntler3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_ear1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneEar1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_ear2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneEar2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_ear3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneEar3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_gill1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneGill1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_gill2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneGill2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_gill3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneGill3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_mand1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneMand1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_mand2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneMand2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_mand3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneMand3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_tail1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneTail1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_tail2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneTail2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_tail3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneTail3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_wing1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneWing1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_wing2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneWing2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<PolpettEntity, Modelpolpett<PolpettEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("polpett_mod:textures/entities/jane_wing3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PolpettEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JaneWing3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(PolpettEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(PolpettEntity entity) {
		return ResourceLocation.parse("polpett_mod:textures/entities/polpett_blank.png");
	}

	private static final class AnimatedModel extends Modelpolpett<PolpettEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PolpettEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PolpettEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(polpettAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PolpettEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}