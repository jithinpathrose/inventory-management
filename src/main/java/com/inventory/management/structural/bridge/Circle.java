package com.inventory.management.structural.bridge;

public class Circle extends Shape {

	public Circle(Colour colour) {
		super(colour);
	}

	@Override
	public void applyColour() {
		colour.applyColour();
	}

}
