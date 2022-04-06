package com.inventory.management.structural.adapter;


public class ShapeLdap {

	private String identifier;
	private String xDimension;
	private String styleRGB;
	private String yDimension;

	public ShapeLdap(String cn, String x, String color, String y) {
		super();
		this.identifier = cn;
		this.xDimension = x;
		this.styleRGB = color;
		this.yDimension = y;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getxDimension() {
		return xDimension;
	}

	public String getStyleRGB() {
		return styleRGB;
	}

	public String getyDimension() {
		return yDimension;
	}

	@Override
	public String toString() {
		return "ShapeLdap{" +
			"identifier='" + identifier + '\'' +
			", xDimension='" + xDimension + '\'' +
			", styleRGB='" + styleRGB + '\'' +
			", yDimension='" + yDimension + '\'' +
			'}';
	}
}
