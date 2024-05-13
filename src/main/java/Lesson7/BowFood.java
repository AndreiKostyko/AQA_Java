package Lesson7;

//Миска с едой для котов
public class BowFood {
    public int food;

    public BowFood(int food) {
        this.food = food;
    }

    public void reduceFood(int n) {
        food -= n;
    }

    public void addFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("В миске " + food + " гр. еды");
    }
}
