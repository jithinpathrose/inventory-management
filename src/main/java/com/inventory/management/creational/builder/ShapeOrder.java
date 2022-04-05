package com.inventory.management.creational.builder;

public class ShapeOrder {


    public static class Builder {

        private String shape;
        private String color;

        public ShapeOrder build() {
            return new ShapeOrder(this);
        }

        public Builder() {

        }

        public Builder shape(String shape) {
            this.shape = shape;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

    }

    private final String shape;
    private final String color;

    public ShapeOrder(Builder builder) {
        this.shape = builder.shape;
        this.color = builder.color;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }
}
