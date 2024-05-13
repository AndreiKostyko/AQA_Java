package Lesson7.figure;

public interface RectangleInterface {
    default double perimeterCalculation(int width, int height) {
        return 2 * (width + height);
    }

    default double areaCalculation(int width, int height) {
        return width * height;
    }
}
