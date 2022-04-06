package com.inventory.management.structural.adapter;

public class ShapeAdapterLdap implements Shape {

	private ShapeLdap instance;
	
	public ShapeAdapterLdap(ShapeLdap employeeLdap) {
		this.instance = employeeLdap;
	}
	
	@Override
	public String getId() {
		return instance.getIdentifier();
	}

	@Override
	public String getColor() {
		return instance.getStyleRGB();
	}

	@Override
	public String getLength() {
		return instance.getxDimension();
	}

	@Override
	public String getWidth() {
		return instance.getyDimension();
	}

	@Override
	public String toString() {
		return "ShapeAdapterLdap{" +
			"instance=" + instance +
			'}';
	}
}
