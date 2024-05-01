import lesson6.Employee;
import lesson6.Park;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 10000, 30);
        emp[1] = new Employee("Petrov Petr", "Designer", "petrov@mailbox.com", "892312313", 20000, 25);
        emp[2] = new Employee("Sidorov Sidor", "Specialist", "sidorov@mailbox.com", "892312314", 30000, 65);
        emp[3] = new Employee("Korolev Sergei", "GenConstructor", "korolev@mailbox.com", "892312315", 40000, 48);
        emp[4] = new Employee("Gagarin Yriy", "Pilot", "gagarin@mailbox.com", "892312316", 50000, 21);

//     Employee employee = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 10000, 30);
//     employee.printInfo();

        //Park.Attraction attraction = new Park.Attraction("Super8", "9:00 - 20:00", 5);
        //attraction.printInfo();
    }
}
