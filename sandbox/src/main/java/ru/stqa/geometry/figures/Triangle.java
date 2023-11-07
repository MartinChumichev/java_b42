package ru.stqa.geometry.figures;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        return (double) Math.round(Math.sqrt(halfPerimeter
               * (halfPerimeter - this.side1)
               * (halfPerimeter - this.side2)
               * (halfPerimeter - this.side3)) * 10) / 10;
    }

}