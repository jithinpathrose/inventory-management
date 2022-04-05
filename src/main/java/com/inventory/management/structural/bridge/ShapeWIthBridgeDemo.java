package com.inventory.management.structural.bridge;

public class ShapeWIthBridgeDemo {

	public static void main(String[] args) {

		Colour blueColour = new BlueColour();

		Shape circle = new Circle(blueColour);

		circle.applyColour();

	}
}
