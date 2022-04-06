package com.inventory.management.behaviour.template;

public class TemplateDemo {
	
	public static void main(String[] args) {

		System.out.println("Square order:");
		ShapeOrderTemplate webOrder = new SquareOrder();
		webOrder.processOrder();
		

	}

}
