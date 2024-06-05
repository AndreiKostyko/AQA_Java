import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    Map<Integer, String> phonebook = new HashMap<>();

    public void add(Integer phone, String name) {
        phonebook.put(phone, name);
    }

    public void get(String name) {
        Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
        for (Map.Entry<Integer, String> temp : set) {
            if (temp.getValue().equals(name)) {
                System.out.println(temp.getValue() + " - " + temp.getKey());
            }
        }
    }
}