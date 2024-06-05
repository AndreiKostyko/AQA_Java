import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("--- Task 1 ---");
        ArrayList<String> fruit = (ArrayList<String>) new Word().getMapFruit();

        Set<String> set = new HashSet<>(fruit);

        for (String fruits : set) {
            int i = 0;
            for (String str : fruit) {
                if (fruits.equals(str)) {
                    i++;
                }
            }
            System.out.println(fruits + " - " + i);
        }

        //Tack 2
        System.out.println("--- Task 2 ---");
        Phonebook phonebook = new Phonebook();
        phonebook.add(12345, "Petrov");
        phonebook.add(23456, "Ivanov");
        phonebook.add(34567, "Ivanov");
        phonebook.add(45678, "Korolev");
        phonebook.add(56789, "Ivanov");

        phonebook.get("Ivanov");
    }
}