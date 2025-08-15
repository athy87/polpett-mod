// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpolpett<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "polpett"), "main");
	private final ModelPart body;
	private final ModelPart wings;
	private final ModelPart wings3;
	private final ModelPart wings2;
	private final ModelPart wings1;
	private final ModelPart tail;
	private final ModelPart tail3;
	private final ModelPart tail2;
	private final ModelPart tail1;
	private final ModelPart head;
	private final ModelPart dangler;
	private final ModelPart gills;
	private final ModelPart gills3;
	private final ModelPart gills2;
	private final ModelPart gills1;
	private final ModelPart ears;
	private final ModelPart ears3;
	private final ModelPart ears2;
	private final ModelPart ears1;
	private final ModelPart mandibles;
	private final ModelPart mandibles3;
	private final ModelPart mandibles2;
	private final ModelPart mandibles1;
	private final ModelPart antlers;
	private final ModelPart antlers1;
	private final ModelPart antlers2;
	private final ModelPart antlers3;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public Modelpolpett(ModelPart root) {
		this.body = root.getChild("body");
		this.wings = this.body.getChild("wings");
		this.wings3 = this.wings.getChild("wings3");
		this.wings2 = this.wings.getChild("wings2");
		this.wings1 = this.wings.getChild("wings1");
		this.tail = this.body.getChild("tail");
		this.tail3 = this.tail.getChild("tail3");
		this.tail2 = this.tail.getChild("tail2");
		this.tail1 = this.tail.getChild("tail1");
		this.head = this.body.getChild("head");
		this.dangler = this.head.getChild("dangler");
		this.gills = this.head.getChild("gills");
		this.gills3 = this.gills.getChild("gills3");
		this.gills2 = this.gills.getChild("gills2");
		this.gills1 = this.gills.getChild("gills1");
		this.ears = this.head.getChild("ears");
		this.ears3 = this.ears.getChild("ears3");
		this.ears2 = this.ears.getChild("ears2");
		this.ears1 = this.ears.getChild("ears1");
		this.mandibles = this.head.getChild("mandibles");
		this.mandibles3 = this.mandibles.getChild("mandibles3");
		this.mandibles2 = this.mandibles.getChild("mandibles2");
		this.mandibles1 = this.mandibles.getChild("mandibles1");
		this.antlers = this.head.getChild("antlers");
		this.antlers1 = this.antlers.getChild("antlers1");
		this.antlers2 = this.antlers.getChild("antlers2");
		this.antlers3 = this.antlers.getChild("antlers3");
		this.leftleg = this.body.getChild("leftleg");
		this.rightleg = this.body.getChild("rightleg");
		this.leftarm = this.body.getChild("leftarm");
		this.rightarm = this.body.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(10, 16).addBox(
				-2.5F, 0.0F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition wings = body.addOrReplaceChild("wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wings3 = wings.addOrReplaceChild("wings3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttwing_r1 = wings3.addOrReplaceChild("lefttwing_r1",
				CubeListBuilder.create().texOffs(1, 47).addBox(0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.0F, 3.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition rightwing_r1 = wings3
				.addOrReplaceChild("rightwing_r1",
						CubeListBuilder.create().texOffs(1, 47).addBox(0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 2.0F, 3.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition wings2 = wings.addOrReplaceChild("wings2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttwing_r2 = wings2.addOrReplaceChild("lefttwing_r2",
				CubeListBuilder.create().texOffs(2, 53).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.0F, 3.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition rightwing_r2 = wings2
				.addOrReplaceChild("rightwing_r2",
						CubeListBuilder.create().texOffs(2, 53).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 2.0F, 3.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition wings1 = wings.addOrReplaceChild("wings1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttwing_r3 = wings1.addOrReplaceChild("lefttwing_r3",
				CubeListBuilder.create().texOffs(3, 58).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.0F, 3.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition rightwing_r3 = wings1
				.addOrReplaceChild("rightwing_r3",
						CubeListBuilder.create().texOffs(3, 58).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 2.0F, 3.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 4.0F, 3.0F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tailfin_r1 = tail3
				.addOrReplaceChild("tailfin_r1",
						CubeListBuilder.create().texOffs(6, 28).addBox(1.0F, -7.0F, -2.0F, 0.0F, 8.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.789F, 0.0F, 0.0F));

		PartDefinition tail_r1 = tail3
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(0, 33).addBox(0.5F, -5.5F, 0.0F, 1.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -1.789F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tailfin_r2 = tail2
				.addOrReplaceChild("tailfin_r2",
						CubeListBuilder.create().texOffs(6, 37).addBox(1.0F, -5.0F, -2.0F, 0.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.789F, 0.0F, 0.0F));

		PartDefinition tail_r2 = tail2
				.addOrReplaceChild("tail_r2",
						CubeListBuilder.create().texOffs(0, 41).addBox(0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -1.789F, 0.0F, 0.0F));

		PartDefinition tail1 = tail.addOrReplaceChild("tail1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tailfin_r3 = tail1
				.addOrReplaceChild("tailfin_r3",
						CubeListBuilder.create().texOffs(4, 44).addBox(1.0F, -4.0F, -2.0F, 0.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.789F, 0.0F, 0.0F));

		PartDefinition tail_r3 = tail1
				.addOrReplaceChild("tail_r3",
						CubeListBuilder.create().texOffs(0, 47).addBox(0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -1.789F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition dangler = head.addOrReplaceChild("dangler", CubeListBuilder.create(),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition danglebulb_r1 = dangler.addOrReplaceChild("danglebulb_r1",
				CubeListBuilder.create().texOffs(12, 27).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition dangler_r1 = dangler.addOrReplaceChild("dangler_r1",
				CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1414F, -1.0855F, -0.085F));

		PartDefinition gills = head.addOrReplaceChild("gills", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gills3 = gills.addOrReplaceChild("gills3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttgills_r1 = gills3.addOrReplaceChild("lefttgills_r1",
				CubeListBuilder.create().texOffs(32, 32).mirror()
						.addBox(-3.0F, -4.0F, 0.0F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, -2.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightgills_r1 = gills3.addOrReplaceChild("rightgills_r1",
				CubeListBuilder.create().texOffs(32, 32).addBox(0.0F, -4.0F, 0.0F, 3.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, -2.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition gills2 = gills.addOrReplaceChild("gills2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttgills_r2 = gills2.addOrReplaceChild("lefttgills_r2",
				CubeListBuilder.create().texOffs(32, 39).mirror()
						.addBox(-3.0F, -4.0F, 0.0F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -3.0F, -2.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightgills_r2 = gills2.addOrReplaceChild("rightgills_r2",
				CubeListBuilder.create().texOffs(32, 39).addBox(0.0F, -4.0F, 0.0F, 3.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -3.0F, -2.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition gills1 = gills.addOrReplaceChild("gills1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttgills_r3 = gills1.addOrReplaceChild("lefttgills_r3",
				CubeListBuilder.create().texOffs(32, 45).mirror()
						.addBox(-3.0F, -4.0F, 0.0F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -3.0F, -2.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightgills_r3 = gills1.addOrReplaceChild("rightgills_r3",
				CubeListBuilder.create().texOffs(32, 45).addBox(0.0F, -4.0F, 0.0F, 3.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -3.0F, -2.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ears3 = ears.addOrReplaceChild("ears3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftear_r1 = ears3.addOrReplaceChild("leftear_r1",
				CubeListBuilder.create().texOffs(39, 32).mirror()
						.addBox(-3.0F, -9.0F, 0.0F, 3.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -8.0F, 0.0F, 0.2956F, 0.0779F, -0.2502F));

		PartDefinition rightear_r1 = ears3.addOrReplaceChild("rightear_r1",
				CubeListBuilder.create().texOffs(39, 32).addBox(0.0F, -9.0F, 0.0F, 3.0F, 9.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -8.0F, 0.0F, 0.2956F, -0.0779F, 0.2502F));

		PartDefinition ears2 = ears.addOrReplaceChild("ears2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftear_r2 = ears2.addOrReplaceChild("leftear_r2",
				CubeListBuilder.create().texOffs(39, 41).mirror()
						.addBox(-3.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -8.0F, 0.0F, 0.2956F, 0.0779F, -0.2502F));

		PartDefinition rightear_r2 = ears2.addOrReplaceChild("rightear_r2",
				CubeListBuilder.create().texOffs(39, 41).addBox(0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -8.0F, 0.0F, 0.2956F, -0.0779F, 0.2502F));

		PartDefinition ears1 = ears.addOrReplaceChild("ears1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftear_r3 = ears1.addOrReplaceChild("leftear_r3",
				CubeListBuilder.create().texOffs(39, 47).mirror()
						.addBox(-3.0F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -8.0F, 0.0F, 0.2956F, 0.0779F, -0.2502F));

		PartDefinition rightear_r3 = ears1.addOrReplaceChild("rightear_r3",
				CubeListBuilder.create().texOffs(39, 47).addBox(0.0F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -8.0F, 0.0F, 0.2956F, -0.0779F, 0.2502F));

		PartDefinition mandibles = head.addOrReplaceChild("mandibles", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mandibles3 = mandibles.addOrReplaceChild("mandibles3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttmandible_r1 = mandibles3.addOrReplaceChild("lefttmandible_r1",
				CubeListBuilder.create().texOffs(46, 32).mirror()
						.addBox(0.5F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition rightmandible_r1 = mandibles3.addOrReplaceChild("rightmandible_r1",
				CubeListBuilder.create().texOffs(46, 32).addBox(-2.5F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition mandibles2 = mandibles.addOrReplaceChild("mandibles2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttmandible_r2 = mandibles2.addOrReplaceChild("lefttmandible_r2",
				CubeListBuilder.create().texOffs(46, 36).mirror()
						.addBox(0.5F, 0.0F, -0.51F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightmandible_r2 = mandibles2.addOrReplaceChild("rightmandible_r2",
				CubeListBuilder.create().texOffs(46, 36).addBox(-2.5F, 0.0F, -0.51F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, -4.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition mandibles1 = mandibles.addOrReplaceChild("mandibles1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefttmandible_r3 = mandibles1.addOrReplaceChild("lefttmandible_r3",
				CubeListBuilder.create().texOffs(46, 39).mirror()
						.addBox(0.5F, 0.0F, -0.51F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightmandible_r3 = mandibles1.addOrReplaceChild("rightmandible_r3",
				CubeListBuilder.create().texOffs(46, 39).addBox(-2.5F, 0.0F, -0.51F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, -4.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition antlers = head.addOrReplaceChild("antlers", CubeListBuilder.create(),
				PartPose.offset(0.0F, -8.0F, -2.0F));

		PartDefinition antlers1 = antlers.addOrReplaceChild("antlers1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition righttAntler_r1 = antlers1.addOrReplaceChild("righttAntler_r1",
				CubeListBuilder.create().texOffs(55, 43).mirror()
						.addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, 1.0F, -1.0F, 0.1831F, -0.2482F, 0.1276F));

		PartDefinition leftAntler_r1 = antlers1.addOrReplaceChild("leftAntler_r1",
				CubeListBuilder.create().texOffs(55, 43).addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 1.0F, -1.0F, 0.1831F, 0.2482F, -0.1276F));

		PartDefinition antlers2 = antlers.addOrReplaceChild("antlers2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition righttAntler_r2 = antlers2.addOrReplaceChild("righttAntler_r2",
				CubeListBuilder.create().texOffs(55, 36).mirror()
						.addBox(0.0F, -6.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, 1.0F, -1.0F, 0.314F, -0.2482F, 0.1276F));

		PartDefinition leftAntler_r2 = antlers2.addOrReplaceChild("leftAntler_r2",
				CubeListBuilder.create().texOffs(55, 36).addBox(0.0F, -6.0F, -2.0F, 0.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 1.0F, -1.0F, 0.314F, 0.2482F, -0.1276F));

		PartDefinition antlers3 = antlers.addOrReplaceChild("antlers3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition righttAntler_r3 = antlers3.addOrReplaceChild("righttAntler_r3",
				CubeListBuilder.create().texOffs(55, 28).mirror()
						.addBox(0.0F, -7.0F, -3.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, 1.0F, -1.0F, 0.4449F, -0.2482F, 0.1276F));

		PartDefinition leftAntler_r3 = antlers3.addOrReplaceChild("leftAntler_r3",
				CubeListBuilder.create().texOffs(55, 28).addBox(0.0F, -7.0F, -3.0F, 0.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 1.0F, -1.0F, 0.4449F, 0.2482F, -0.1276F));

		PartDefinition leftleg = body.addOrReplaceChild("leftleg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 6.0F, 0.0F));

		PartDefinition leftleg_r1 = leftleg.addOrReplaceChild("leftleg_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -3.0F, -2.0048F, 3.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0436F, 0.0F));

		PartDefinition rightleg = body.addOrReplaceChild("rightleg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 6.0F, 0.0F));

		PartDefinition righttleg_r1 = rightleg.addOrReplaceChild("righttleg_r1",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-1.2181F, -3.0F, -2.0048F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -0.0436F, 0.0F));

		PartDefinition leftarm = body.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 1.0F, 0.0F));

		PartDefinition leftarm_r1 = leftarm
				.addOrReplaceChild("leftarm_r1",
						CubeListBuilder.create().texOffs(30, 16).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightarm = body.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(2.0F, 1.0F, 0.0F));

		PartDefinition rightarm_r1 = rightarm.addOrReplaceChild("rightarm_r1",
				CubeListBuilder.create().texOffs(30, 16).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}