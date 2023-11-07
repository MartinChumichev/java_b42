package ru.stqa.geometry.figures;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public static void printSquareArea(Square square) {
        System.out.printf("Площадь квадрата со стороной %f равна %f", square.side, square.area());
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return this.side * 4;
    }

}