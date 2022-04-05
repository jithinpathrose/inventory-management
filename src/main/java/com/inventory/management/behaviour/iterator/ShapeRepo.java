package com.inventory.management.behaviour.iterator;

import com.inventory.management.structural.bridge.Shape;

import java.util.Iterator;

public class ShapeRepo implements Iterable<String>{

    private String[] shapes;
    private int index;

    public ShapeRepo(){
        shapes = new String[10];
        index = 0;
    }

    public void putShape(String shape) {
        if (index == shapes.length) {
            String[] shapeArray = new String[shapes.length];
            System.arraycopy(shapes, 0, shapeArray, 0, shapes.length);
            shapes = shapeArray;
            shapeArray = null;
        }
        shapes[index] = shape;
        index++;
    }

    public Iterator<String> iterator() {
        Iterator<String> iter = new Iterator<String>() {

            private int currentIndex = 0;

            public boolean hasNext() {
                return currentIndex < shapes.length && shapes[currentIndex] != null;
            }

            public String next() {
                return shapes[currentIndex++];
            }
        };
        return iter;
    }
}
