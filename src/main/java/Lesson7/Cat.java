package Lesson7;

public class Cat extends Animal {
    private final int MAX_RUN_DIST = 200;
    private final int MAX_SWIM_DIST = 0;
    private String catName;
    private boolean satiety; //сытость. Голоден - false, стыт - true
    private int food;//Количество еды, которое съест кот

    public Cat(String catName, int food) {
        this.catName = catName;
        this.food = food;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println(catName + " пробежал " + distance + " м.");
        } else
            System.out.println(catName + " не может пробежать " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(catName + " не умеет плавать.");
    }

    public void eat(BowFood bowFood) {
        bowFood.reduceFood(food);
    }

    public boolean getSatiety() {

        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getFood() {
        return food;
    }

    public String getCatName() {
        return catName;
    }
}
