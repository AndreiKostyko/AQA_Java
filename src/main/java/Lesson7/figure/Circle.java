package Lesson7.figure;

public class Circle extends Share implements CircleInterface {
    int radius;

    public Circle(String fillColor, String borderColor, int radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public void printCirclePerimeter() {
        System.out.println("Периметр круга с радиусом " + radius + " = " + CircleInterface.super.perimeterCalculation(radius));
    }

    public void printCircleArea() {
        System.out.println("Площадь круга с радиусом " + radius + " = " + CircleInterface.super.areaCalculation(radius));
    }

    public void printFillColor() {
        System.out.println("Цвет заливки круга " + super.fillColor);
    }

    public void printBorderColor() {
        System.out.println("Цвет границы круга " + super.borderColor);
    }

    public void printFullInfo() {
        printCirclePerimeter();
        printCircleArea();
        printFillColor();
        printBorderColor();
    }
}
