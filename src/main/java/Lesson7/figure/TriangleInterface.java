package Lesson7.figure;

public interface TriangleInterface {
    default double perimeterCalculation(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    default double areaCalculation(int side1, int side2, int side3) {
        double halfPer = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
    }
}
