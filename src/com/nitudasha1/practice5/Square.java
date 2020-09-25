package com.nitudasha1.practice5;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}