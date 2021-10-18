package org.perscholas;

public class Car extends Main {
     private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;

    }

    public double getSalePrice() {
        return regularPrice;
    }
}

