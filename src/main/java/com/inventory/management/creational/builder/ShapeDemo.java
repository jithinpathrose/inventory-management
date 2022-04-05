package com.inventory.management.creational.builder;

public class ShapeDemo {

    public static void main(String[] args){

    ShapeOrder.Builder shapeBuilder= new ShapeOrder.Builder();
    shapeBuilder.shape("SQUARE").color("RED");
    ShapeOrder order = shapeBuilder.build();

    System.out.println(order.getColor());
    System.out.println(order.getShape());
    }
}
