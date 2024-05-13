package Lesson7.figure;

public class Rectangle extends Share implements RectangleInterface {
    int width;
    int height;

    public Rectangle(String fillColor, String borderColor, int width, int height) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    public void printRectanglePerimeter() {
        System.out.println("Периметр прямоугольника с сторонами " + width + ", " + height + " = " + RectangleInterface.super.perimeterCalculation(width, height));
    }

    public void printRectangleArea() {
        System.out.println("Площадь прямоугольника с сторонами " + width + ", " + height + " = " + RectangleInterface.super.areaCalculation(width, height));
    }

    public void printFillColor() {
        System.out.println("Цвет заливки прямоугольника " + super.fillColor);
    }

    public void printBorderColor() {
        System.out.println("Цвет границы прямоугольника " + super.borderColor);
    }

    public void printFullInfo() {
        printRectanglePerimeter();
        printRectangleArea();
        printFillColor();
        printBorderColor();
    }
}