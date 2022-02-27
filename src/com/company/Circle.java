package com.company;

public class Circle {

    public double area(int radius){

        Operation square2 = new Operation();
        int getSquare = square2.square(radius);
                        // r * r

        double pi = Math.PI;
        // r * r = r^2

        return pi * getSquare;
        // pi r^2

    }
}