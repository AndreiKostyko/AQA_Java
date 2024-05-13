package Lesson7;

public class Dog extends Animal {
    private final int MAX_RUN_DIST = 500;
    private final int MAX_SWIM_DIST = 10;
    private String dogName;
    private int distance;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println(dogName + " пробежал " + distance + " м.");
        } else
            System.out.println(dogName + " не может пробежать " + distance + " м.");

    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DIST) {
            System.out.println(dogName + " проплыл " + distance + " м.");
        } else
            System.out.println(dogName + " не может проплыть " + distance + " м.");

    }
}
