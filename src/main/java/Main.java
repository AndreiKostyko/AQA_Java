import Lesson7.*;
import Lesson7.figure.*;

public class Main {
    public static void main(String[] args) {
        Dog[] allDog = new Dog[2];
        allDog[0] = new Dog("Бобик");
        allDog[1] = new Dog("Жучка");

        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Барсик", 30);
        allCats[1] = new Cat("Снежок", 20);
        allCats[2] = new Cat("Мурка", 10);

        allDog[0].run(300);
        allDog[0].swim(5);
        allDog[1].run(600);

        allCats[0].run(100);
        allCats[0].swim(10);
        allCats[1].run(300);


        BowFood bowFood = new BowFood(50);

        for (Cat cats : allCats) {
            if (cats.getFood() <= bowFood.food) {
                cats.eat(bowFood);
                cats.setSatiety(true);
                System.out.println("Кот " + cats.getCatName() + " поел досыта");
            } else
                System.out.println("Коту " + cats.getCatName() + " не хватило еды");
        }

        System.out.println("Всего животных: собак - " + allDog.length + "; котов - " + allCats.length);

        Circle circle = new Circle("Белый", "Черный", 10);
        circle.printFullInfo();

        Rectangle rectangle = new Rectangle("Желтый", "Зеленый", 5, 8);
        rectangle.printFullInfo();

        Triangle triangle = new Triangle("Синий", "Оранжевый", 5, 5, 5);
        triangle.printFullInfo();
    }
}
