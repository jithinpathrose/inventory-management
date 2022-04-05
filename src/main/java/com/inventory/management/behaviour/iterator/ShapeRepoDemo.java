package com.inventory.management.behaviour.iterator;

import java.util.Iterator;

public class ShapeRepoDemo {

    public static void main(String[] args){
        ShapeRepo shapeRepo=new ShapeRepo();
        shapeRepo.putShape("SQUARE");
        shapeRepo.putShape("CIRCLE");
        shapeRepo.putShape("RECTANGLE");
        shapeRepo.putShape("HEXAGON");

        Iterator<String> iterator = shapeRepo.iterator();
		while(iterator.hasNext()) { System.out.println(iterator.next()); }
    }
}
