package Lesson7.figure;

public class Triangle extends Share implements TriangleInterface {
    int side1, side2, side3;

    public Triangle(String fillColor, String borderColor, int side1, int side2, int side3) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void printTrianglePerimeter() {
        System.out.println("Периметр триугольника с сторонами " + side1 + ", " + side2 + ", " + +side3 + " = " + TriangleInterface.super.perimeterCalculation(side1, side2, side3));
    }

    public void printTriangleArea() {
        System.out.println("Площадь триугольника с сторонами " + side1 + ", " + side2 + ", " + +side3 + " = " + TriangleInterface.super.areaCalculation(side1, side2, side3));
    }

    public void printFillColor() {
        System.out.println("Цвет заливки триугольника " + super.fillColor);
    }

    public void printBorderColor() {
        System.out.println("Цвет границы триугольника " + super.borderColor);
    }

    public void printFullInfo() {
        printTrianglePerimeter();
        printTriangleArea();
        printFillColor();
        printBorderColor();
    }
}
