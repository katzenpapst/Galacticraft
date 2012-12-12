package micdoodle8.mods.galacticraft.core.client.model;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

/**
 * Copyright 2012, micdoodle8
 * 
 *  All rights reserved.
 *
 */
public class GCCoreModelSpider extends ModelBase
{
	ModelRenderer body;
	ModelRenderer rearEnd;
	ModelRenderer leg8;
	ModelRenderer leg6;
	ModelRenderer leg4;
	ModelRenderer leg2;
	ModelRenderer leg7;
	ModelRenderer leg5;
	ModelRenderer leg3;
	ModelRenderer leg1;
	ModelRenderer head;
    
	ModelRenderer oxygenMask;
	ModelRenderer tank1;
	ModelRenderer tank2;
	ModelRenderer tube1;
	ModelRenderer tube2;
	ModelRenderer tube3;
	ModelRenderer tube4;
	ModelRenderer tube5;
	ModelRenderer tube6;
	ModelRenderer tube7;
	ModelRenderer tube8;
	ModelRenderer tube9;
	ModelRenderer tube10;
	ModelRenderer tube11;
	ModelRenderer tube12;
	ModelRenderer tube13;
	ModelRenderer tube15;
	ModelRenderer tube14;
	ModelRenderer tube16;
	ModelRenderer tube17;
	ModelRenderer tube18;

	public GCCoreModelSpider()
	{
		this(0.0F);
	}

	public GCCoreModelSpider(float par1)
	{
		textureWidth = 128;
		textureHeight = 64;
		
		body = new ModelRenderer(this, 0, 0);
		body.addBox(-3F, -3F, -3F, 6, 6, 6, par1);
		body.setRotationPoint(0F, 15F, 0F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rearEnd = new ModelRenderer(this, 0, 12);
		rearEnd.addBox(-5F, -4F, -6F, 10, 8, 12, par1);
		rearEnd.setRotationPoint(0F, 15F, 9F);
		rearEnd.setTextureSize(128, 64);
		rearEnd.mirror = true;
		setRotation(rearEnd, 0F, 0F, 0F);
		leg8 = new ModelRenderer(this, 18, 0);
		leg8.addBox(-1F, -1F, -1F, 16, 2, 2, par1);
		leg8.setRotationPoint(4F, 15F, -1F);
		leg8.setTextureSize(128, 64);
		leg8.mirror = true;
		setRotation(leg8, 0F, 0.5759587F, 0.1919862F);
		leg6 = new ModelRenderer(this, 18, 0);
		leg6.addBox(-1F, -1F, -1F, 16, 2, 2, par1);
		leg6.setRotationPoint(4F, 15F, 0F);
		leg6.setTextureSize(128, 64);
		leg6.mirror = true;
		setRotation(leg6, 0F, 0.2792527F, 0.1919862F);
		leg4 = new ModelRenderer(this, 18, 0);
		leg4.addBox(-1F, -1F, -1F, 16, 2, 2, par1);
		leg4.setRotationPoint(4F, 15F, 1F);
		leg4.setTextureSize(128, 64);
		leg4.mirror = true;
		setRotation(leg4, 0F, -0.2792527F, 0.1919862F);
		leg2 = new ModelRenderer(this, 18, 0);
		leg2.addBox(-1F, -1F, -1F, 16, 2, 2, par1);
		leg2.setRotationPoint(4F, 15F, 2F);
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		setRotation(leg2, 0F, -0.5759587F, 0.1919862F);
		leg7 = new ModelRenderer(this, 18, 0);
		leg7.addBox(-15F, -1F, -1F, 16, 2, 2, par1);
		leg7.setRotationPoint(-4F, 15F, -1F);
		leg7.setTextureSize(128, 64);
		leg7.mirror = true;
		setRotation(leg7, 0F, -0.5759587F, -0.1919862F);
		leg5 = new ModelRenderer(this, 18, 0);
		leg5.addBox(-15F, -1F, -1F, 16, 2, 2, par1);
		leg5.setRotationPoint(-4F, 15F, 0F);
		leg5.setTextureSize(128, 64);
		leg5.mirror = true;
		setRotation(leg5, 0F, -0.2792527F, -0.1919862F);
		leg3 = new ModelRenderer(this, 18, 0);
		leg3.addBox(-15F, -1F, -1F, 16, 2, 2, par1);
		leg3.setRotationPoint(-4F, 15F, 1F);
		leg3.setTextureSize(128, 64);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0.2792527F, -0.1919862F);
		leg1 = new ModelRenderer(this, 18, 0);
		leg1.addBox(-15F, -1F, -1F, 16, 2, 2, par1);
		leg1.setRotationPoint(-4F, 15F, 2F);
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0.5759587F, -0.1919862F);
		head = new ModelRenderer(this, 32, 4);
		head.addBox(-4F, -4F, -8F, 8, 8, 8, par1);
		head.setRotationPoint(0F, 15F, -3F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		
		oxygenMask = new ModelRenderer(this, 0, 32);
		oxygenMask.addBox(-5F, -5F, -9F, 10, 10, 10, par1);
		oxygenMask.setRotationPoint(0F, 15F, -3F);
		oxygenMask.setTextureSize(128, 64);
		oxygenMask.mirror = true;
		setRotation(oxygenMask, 0F, 0F, 0F);
		tank1 = new ModelRenderer(this, 40, 34);
		tank1.addBox(1F, -3F, 0F, 3, 3, 7, par1);
		tank1.setRotationPoint(0F, 11F, 4F);
		tank1.setTextureSize(128, 64);
		tank1.mirror = true;
		setRotation(tank1, 0F, 0F, 0F);
		tank2 = new ModelRenderer(this, 40, 34);
		tank2.addBox(-4F, -3F, 0F, 3, 3, 7, par1);
		tank2.setRotationPoint(0F, 11F, 4F);
		tank2.setTextureSize(128, 64);
		tank2.mirror = true;
		setRotation(tank2, 0F, 0F, 0F);
		tube1 = new ModelRenderer(this, 40, 32);
		tube1.addBox(2F, 0F, -6.5F, 1, 1, 1, par1);
		tube1.setRotationPoint(0F, 11F, 4F);
		tube1.setTextureSize(128, 64);
		tube1.mirror = true;
		setRotation(tube1, 0F, 0F, 0F);
		tube2 = new ModelRenderer(this, 40, 32);
		tube2.addBox(2F, -1F, -5.5F, 1, 1, 1, par1);
		tube2.setRotationPoint(0F, 11F, 4F);
		tube2.setTextureSize(128, 64);
		tube2.mirror = true;
		setRotation(tube2, 0F, 0F, 0F);
		tube3 = new ModelRenderer(this, 40, 32);
		tube3.addBox(2F, -1F, -4.5F, 1, 1, 1, par1);
		tube3.setRotationPoint(0F, 11F, 4F);
		tube3.setTextureSize(128, 64);
		tube3.mirror = true;
		setRotation(tube3, 0F, 0F, 0F);
		tube4 = new ModelRenderer(this, 40, 32);
		tube4.addBox(2F, -2F, -3.5F, 1, 1, 1, par1);
		tube4.setRotationPoint(0F, 11F, 4F);
		tube4.setTextureSize(128, 64);
		tube4.mirror = true;
		setRotation(tube4, 0F, 0F, 0F);
		tube5 = new ModelRenderer(this, 40, 32);
		tube5.addBox(2F, -3F, -2.5F, 1, 1, 1, par1);
		tube5.setRotationPoint(0F, 11F, 4F);
		tube5.setTextureSize(128, 64);
		tube5.mirror = true;
		setRotation(tube5, 0F, 0F, 0F);
		tube6 = new ModelRenderer(this, 40, 32);
		tube6.addBox(2F, -4F, -2.5F, 1, 1, 1, par1);
		tube6.setRotationPoint(0F, 11F, 4F);
		tube6.setTextureSize(128, 64);
		tube6.mirror = true;
		setRotation(tube6, 0F, 0F, 0F);
		tube7 = new ModelRenderer(this, 40, 32);
		tube7.addBox(2F, -5F, -1.5F, 1, 1, 1, par1);
		tube7.setRotationPoint(0F, 11F, 4F);
		tube7.setTextureSize(128, 64);
		tube7.mirror = true;
		setRotation(tube7, 0F, 0F, 0F);
		tube8 = new ModelRenderer(this, 40, 32);
		tube8.addBox(2F, -5F, -0.5F, 1, 1, 1, par1);
		tube8.setRotationPoint(0F, 11F, 4F);
		tube8.setTextureSize(128, 64);
		tube8.mirror = true;
		setRotation(tube8, 0F, 0F, 0F);
		tube9 = new ModelRenderer(this, 40, 32);
		tube9.addBox(2F, -4F, 0.5F, 1, 1, 1, par1);
		tube9.setRotationPoint(0F, 11F, 4F);
		tube9.setTextureSize(128, 64);
		tube9.mirror = true;
		setRotation(tube9, 0F, 0F, 0F);
		tube10 = new ModelRenderer(this, 40, 32);
		tube10.addBox(-3F, 0F, -6.5F, 1, 1, 1, par1);
		tube10.setRotationPoint(0F, 11F, 4F);
		tube10.setTextureSize(128, 64);
		tube10.mirror = true;
		setRotation(tube10, 0F, 0F, 0F);
		tube11 = new ModelRenderer(this, 40, 32);
		tube11.addBox(-3F, -1F, -5.5F, 1, 1, 1, par1);
		tube11.setRotationPoint(0F, 11F, 4F);
		tube11.setTextureSize(128, 64);
		tube11.mirror = true;
		setRotation(tube11, 0F, 0F, 0F);
		tube12 = new ModelRenderer(this, 40, 32);
		tube12.addBox(-3F, -1F, -4.5F, 1, 1, 1, par1);
		tube12.setRotationPoint(0F, 11F, 4F);
		tube12.setTextureSize(128, 64);
		tube12.mirror = true;
		setRotation(tube12, 0F, 0F, 0F);
		tube13 = new ModelRenderer(this, 40, 32);
		tube13.addBox(-3F, -2F, -3.5F, 1, 1, 1, par1);
		tube13.setRotationPoint(0F, 11F, 4F);
		tube13.setTextureSize(128, 64);
		tube13.mirror = true;
		setRotation(tube13, 0F, 0F, 0F);
		tube15 = new ModelRenderer(this, 40, 32);
		tube15.addBox(-3F, -4F, -2.5F, 1, 1, 1, par1);
		tube15.setRotationPoint(0F, 11F, 4F);
		tube15.setTextureSize(128, 64);
		tube15.mirror = true;
		setRotation(tube15, 0F, 0F, 0F);
		tube14 = new ModelRenderer(this, 40, 32);
		tube14.addBox(-3F, -3F, -2.5F, 1, 1, 1, par1);
		tube14.setRotationPoint(0F, 11F, 4F);
		tube14.setTextureSize(128, 64);
		tube14.mirror = true;
		setRotation(tube14, 0F, 0F, 0F);
		tube16 = new ModelRenderer(this, 40, 32);
		tube16.addBox(-3F, -5F, -1.5F, 1, 1, 1, par1);
		tube16.setRotationPoint(0F, 11F, 4F);
		tube16.setTextureSize(128, 64);
		tube16.mirror = true;
		setRotation(tube16, 0F, 0F, 0F);
		tube17 = new ModelRenderer(this, 40, 32);
		tube17.addBox(-3F, -5F, -0.5F, 1, 1, 1, par1);
		tube17.setRotationPoint(0F, 11F, 4F);
		tube17.setTextureSize(128, 64);
		tube17.mirror = true;
		setRotation(tube17, 0F, 0F, 0F);
		tube18 = new ModelRenderer(this, 40, 32);
		tube18.addBox(-3F, -4F, 0.5F, 1, 1, 1, par1);
		tube18.setRotationPoint(0F, 11F, 4F);
		tube18.setTextureSize(128, 64);
		tube18.mirror = true;
		setRotation(tube18, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		body.render(f5);
		rearEnd.render(f5);
		leg8.render(f5);
		leg6.render(f5);
		leg4.render(f5);
		leg2.render(f5);
		leg7.render(f5);
		leg5.render(f5);
		leg3.render(f5);
		leg1.render(f5);
		head.render(f5);
		oxygenMask.render(f5);
		tank1.render(f5);
		tank2.render(f5);
		tube1.render(f5);
		tube2.render(f5);
		tube3.render(f5);
		tube4.render(f5);
		tube5.render(f5);
		tube6.render(f5);
		tube7.render(f5);
		tube8.render(f5);
		tube9.render(f5);
		tube10.render(f5);
		tube11.render(f5);
		tube12.render(f5);
		tube13.render(f5);
		tube15.render(f5);
		tube14.render(f5);
		tube16.render(f5);
		tube17.render(f5);
		tube18.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
        this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.oxygenMask.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.oxygenMask.rotateAngleX = f4 / (180F / (float)Math.PI);
        float var7 = ((float)Math.PI / 4F);
        this.leg1.rotateAngleZ = -var7;
        this.leg2.rotateAngleZ = var7;
        this.leg3.rotateAngleZ = -var7 * 0.74F;
        this.leg4.rotateAngleZ = var7 * 0.74F;
        this.leg5.rotateAngleZ = -var7 * 0.74F;
        this.leg6.rotateAngleZ = var7 * 0.74F;
        this.leg7.rotateAngleZ = -var7;
        this.leg8.rotateAngleZ = var7;
        float var8 = -0.0F;
        float var9 = 0.3926991F;
        this.leg1.rotateAngleY = var9 * 2.0F + var8;
        this.leg2.rotateAngleY = -var9 * 2.0F - var8;
        this.leg3.rotateAngleY = var9 * 1.0F + var8;
        this.leg4.rotateAngleY = -var9 * 1.0F - var8;
        this.leg5.rotateAngleY = -var9 * 1.0F + var8;
        this.leg6.rotateAngleY = var9 * 1.0F - var8;
        this.leg7.rotateAngleY = -var9 * 2.0F + var8;
        this.leg8.rotateAngleY = var9 * 2.0F - var8;
        float var10 = -(MathHelper.cos(f * 0.6662F * 2.0F + 0.0F) * 0.4F) * f1;
        float var11 = -(MathHelper.cos(f * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * f1;
        float var12 = -(MathHelper.cos(f * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * f1;
        float var13 = -(MathHelper.cos(f * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * f1;
        float var14 = Math.abs(MathHelper.sin(f * 0.6662F + 0.0F) * 0.4F) * f1;
        float var15 = Math.abs(MathHelper.sin(f * 0.6662F + (float)Math.PI) * 0.4F) * f1;
        float var16 = Math.abs(MathHelper.sin(f * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * f1;
        float var17 = Math.abs(MathHelper.sin(f * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * f1;
        this.leg1.rotateAngleY += var10;
        this.leg2.rotateAngleY += -var10;
        this.leg3.rotateAngleY += var11;
        this.leg4.rotateAngleY += -var11;
        this.leg5.rotateAngleY += var12;
        this.leg6.rotateAngleY += -var12;
        this.leg7.rotateAngleY += var13;
        this.leg8.rotateAngleY += -var13;
        this.leg1.rotateAngleZ += var14;
        this.leg2.rotateAngleZ += -var14;
        this.leg3.rotateAngleZ += var15;
        this.leg4.rotateAngleZ += -var15;
        this.leg5.rotateAngleZ += var16;
        this.leg6.rotateAngleZ += -var16;
        this.leg7.rotateAngleZ += var17;
        this.leg8.rotateAngleZ += -var17;
	}
}
