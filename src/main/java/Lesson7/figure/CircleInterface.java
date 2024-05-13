package Lesson7.figure;

public interface CircleInterface {

    default double perimeterCalculation(int radius) {
        return 2 * Math.PI * radius;
    }

    default double areaCalculation(int radius) {
        return Math.PI * radius * radius;
    }
}
