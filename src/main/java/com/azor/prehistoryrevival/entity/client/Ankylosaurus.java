package com.azor.prehistoryrevival.entity.client;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.azor.prehistoryrevival.entity.animations.ModAnimationDefinitions;
import com.azor.prehistoryrevival.entity.custom.AnkyloEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Ankylosaurus<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ankylosaurus"), "main");
	private final ModelPart Ankylosaurus;
	private final ModelPart FrontRight;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart tail_mid;
	private final ModelPart tail_tip;
	private final ModelPart Neck;
	private final ModelPart head;
	private final ModelPart FrontLeft;
	private final ModelPart HindRight;
	private final ModelPart HindLeft;

	public Ankylosaurus(ModelPart root) {
		this.Ankylosaurus = root.getChild("Ankylosaurus");
		this.FrontRight = root.getChild("Ankylosaurus").getChild("FrontRight");
		this.Body = root.getChild("Ankylosaurus").getChild("Body");
		this.Tail = root.getChild("Ankylosaurus").getChild("Body").getChild("Tail");
		this.tail_mid = root.getChild("Ankylosaurus").getChild("Body").getChild("Tail").getChild("tail_mid");
		this.tail_tip = root.getChild("Ankylosaurus").getChild("Body").getChild("Tail").getChild("tail_mid").getChild("tail_tip");
		this.Neck = root.getChild("Ankylosaurus").getChild("Body").getChild("Neck");
		this.head = root.getChild("Ankylosaurus").getChild("Body").getChild("Neck").getChild("head");
		this.FrontLeft = root.getChild("Ankylosaurus").getChild("FrontLeft");
		this.HindRight = root.getChild("Ankylosaurus").getChild("HindRight");
		this.HindLeft = root.getChild("Ankylosaurus").getChild("HindLeft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Ankylosaurus = partdefinition.addOrReplaceChild("Ankylosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition FrontRight = Ankylosaurus.addOrReplaceChild("FrontRight", CubeListBuilder.create().texOffs(122, 23).addBox(-3.5F, 8.0F, -4.6667F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(115, 46).addBox(-3.5F, -2.0F, -3.6667F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(46, 83).addBox(-3.5F, 14.0F, -5.6667F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.5F, -16.0F, -9.3333F));

		PartDefinition Body = Ankylosaurus.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -10.3333F, -16.3333F, 28.0F, 21.0F, 33.0F, new CubeDeformation(0.0F))
		.texOffs(24, 110).addBox(14.0F, -3.3333F, -14.3333F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(78, 106).addBox(14.0F, -2.3333F, 2.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(105, 23).addBox(14.0F, -3.3333F, 10.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(100, 79).addBox(11.0F, -3.3333F, 18.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(89, 0).addBox(14.0F, -2.3333F, -6.3333F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-15.0F, -3.3333F, -14.3333F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-15.0F, -2.3333F, -6.3333F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(10, 95).addBox(-15.0F, -2.3333F, 2.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(33, 95).addBox(-15.0F, -3.3333F, 10.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(43, 95).addBox(-12.0F, -3.3333F, 18.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 110).addBox(14.0F, -8.3333F, -14.3333F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(89, 0).addBox(14.0F, -8.3333F, -6.3333F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(78, 106).addBox(14.0F, -7.3333F, 2.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(105, 23).addBox(14.0F, -8.3333F, 10.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-15.0F, -8.3333F, -14.3333F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-15.0F, -8.3333F, -6.3333F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(10, 95).addBox(-15.0F, -7.3333F, 2.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(33, 95).addBox(-15.0F, -8.3333F, 10.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(43, 95).addBox(-12.0F, -8.3333F, 18.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(100, 79).addBox(11.0F, -8.3333F, 18.6667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 54).addBox(-11.0F, -9.3333F, 16.6667F, 22.0F, 19.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.6667F, 1.3333F));

		PartDefinition osteoderms_r1 = Body.addOrReplaceChild("osteoderms_r1", CubeListBuilder.create().texOffs(100, 79).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -9.8333F, 20.6667F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r2 = Body.addOrReplaceChild("osteoderms_r2", CubeListBuilder.create().texOffs(100, 79).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -9.8333F, 20.6667F, 0.0F, 0.0F, -1.5708F));

		PartDefinition osteoderms_r3 = Body.addOrReplaceChild("osteoderms_r3", CubeListBuilder.create().texOffs(105, 23).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(89, 0).mirror().addBox(-0.5F, -1.5F, -19.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5F, -10.8333F, 12.6667F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r4 = Body.addOrReplaceChild("osteoderms_r4", CubeListBuilder.create().texOffs(78, 106).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, -10.8333F, 4.6667F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r5 = Body.addOrReplaceChild("osteoderms_r5", CubeListBuilder.create().texOffs(24, 110).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -10.8333F, -12.3333F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r6 = Body.addOrReplaceChild("osteoderms_r6", CubeListBuilder.create().texOffs(105, 23).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(89, 0).addBox(-0.5F, -1.5F, -19.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -10.8333F, 12.6667F, 0.0F, 0.0F, -1.5708F));

		PartDefinition osteoderms_r7 = Body.addOrReplaceChild("osteoderms_r7", CubeListBuilder.create().texOffs(78, 106).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -10.8333F, 4.6667F, 0.0F, 0.0F, -1.5708F));

		PartDefinition osteoderms_r8 = Body.addOrReplaceChild("osteoderms_r8", CubeListBuilder.create().texOffs(24, 110).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -10.8333F, -12.3333F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(64, 54).addBox(-8.5F, -5.5F, 0.0F, 18.0F, 10.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(71, 61).addBox(9.5F, -4.5F, 2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(68, 54).addBox(9.5F, -4.5F, 8.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.5F, -4.5F, 2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-9.5F, -4.5F, 8.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1667F, 26.6667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms_r9 = Tail.addOrReplaceChild("osteoderms_r9", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -6.0F, 10.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r10 = Tail.addOrReplaceChild("osteoderms_r10", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -6.0F, 4.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r11 = Tail.addOrReplaceChild("osteoderms_r11", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -6.0F, 10.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition osteoderms_r12 = Tail.addOrReplaceChild("osteoderms_r12", CubeListBuilder.create().texOffs(71, 61).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -6.0F, 4.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition tail_mid = Tail.addOrReplaceChild("tail_mid", CubeListBuilder.create().texOffs(89, 0).addBox(-5.5F, -4.5F, 0.0F, 12.0F, 8.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(89, 9).addBox(6.5F, -3.5F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 83).addBox(6.5F, -3.5F, 8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(14, 20).addBox(-6.5F, -3.5F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 64).addBox(-6.5F, -3.5F, 8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 15.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms_r13 = tail_mid.addOrReplaceChild("osteoderms_r13", CubeListBuilder.create().texOffs(13, 83).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -5.0F, 11.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r14 = tail_mid.addOrReplaceChild("osteoderms_r14", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -5.0F, 4.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r15 = tail_mid.addOrReplaceChild("osteoderms_r15", CubeListBuilder.create().texOffs(13, 83).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -5.0F, 11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition osteoderms_r16 = tail_mid.addOrReplaceChild("osteoderms_r16", CubeListBuilder.create().texOffs(89, 9).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -5.0F, 4.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition tail_tip = tail_mid.addOrReplaceChild("tail_tip", CubeListBuilder.create().texOffs(0, 85).addBox(-2.5F, -2.5F, 0.0F, 6.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(44, 106).addBox(-5.5F, -4.5F, 21.0F, 12.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 15.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(53, 79).addBox(-9.0F, -8.3333F, -11.3333F, 18.0F, 16.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(88, 106).addBox(9.0F, -4.3333F, -6.3333F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 54).addBox(-10.0F, -4.3333F, -6.3333F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition osteoderms_r17 = Neck.addOrReplaceChild("osteoderms_r17", CubeListBuilder.create().texOffs(88, 106).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -8.8333F, -5.3333F, 0.0F, 0.0F, 1.5708F));

		PartDefinition osteoderms_r18 = Neck.addOrReplaceChild("osteoderms_r18", CubeListBuilder.create().texOffs(88, 106).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -8.8333F, -5.3333F, 0.0F, 0.0F, -1.5708F));

		PartDefinition head = Neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(100, 95).addBox(-5.5F, -4.5F, -9.5F, 12.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1667F, -12.8333F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout_r1 = head.addOrReplaceChild("snout_r1", CubeListBuilder.create().texOffs(89, 23).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -10.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition osteoderms_r19 = head.addOrReplaceChild("osteoderms_r19", CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -4.5F, -1.0F, 0.3927F, -0.3927F, 0.0F));

		PartDefinition osteoderms_r20 = head.addOrReplaceChild("osteoderms_r20", CubeListBuilder.create().texOffs(54, 54).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -4.5F, -1.0F, 0.3927F, 0.3927F, 0.0F));

		PartDefinition osteoderms_r21 = head.addOrReplaceChild("osteoderms_r21", CubeListBuilder.create().texOffs(0, 83).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 3.5F, -1.0F, -0.3927F, -0.3927F, 0.0F));

		PartDefinition osteoderms_r22 = head.addOrReplaceChild("osteoderms_r22", CubeListBuilder.create().texOffs(33, 83).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 3.5F, -1.0F, -0.3927F, 0.3927F, 0.0F));

		PartDefinition FrontLeft = Ankylosaurus.addOrReplaceChild("FrontLeft", CubeListBuilder.create().texOffs(25, 124).addBox(-4.5F, 8.0F, -4.6667F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(88, 115).addBox(-4.5F, -2.0F, -3.6667F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(33, 92).addBox(-4.5F, 14.0F, -5.6667F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.5F, -16.0F, -9.3333F));

		PartDefinition HindRight = Ankylosaurus.addOrReplaceChild("HindRight", CubeListBuilder.create().texOffs(111, 79).addBox(-1.0F, 11.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -1.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-1.0F, 17.0F, -4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, -19.0F, 23.0F));

		PartDefinition HindLeft = Ankylosaurus.addOrReplaceChild("HindLeft", CubeListBuilder.create().texOffs(120, 115).addBox(-7.0F, 11.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 110).addBox(-7.0F, -1.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 92).addBox(-7.0F, 17.0F, -4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, -19.0F, 23.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.walk, limbSwing, limbSwingAmount, 1.5f, 1f);
		this.animate(((AnkyloEntity)entity).idleAnimationState, ModAnimationDefinitions.idle, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Ankylosaurus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Ankylosaurus;
	}
}