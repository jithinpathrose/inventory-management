package com.inventory.management.structural.bridge;

public abstract class Shape {
	protected Colour colour;

	public Shape(Colour colour) {
		this.colour = colour;
	}

	public abstract void applyColour();
}
