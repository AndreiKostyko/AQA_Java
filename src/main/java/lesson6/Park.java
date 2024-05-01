package lesson6;

//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
//об аттракционах, времени их работы и стоимости.
public class Park {
    public static class Attraction {
        private String name;
        private String timeOfWork;
        private int cost;

        public Attraction(String name, String timeOfWork, int cost) {
            this.name = name;
            this.timeOfWork = timeOfWork;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getTimeOfWork() {
            return timeOfWork;
        }

        public double getCost() {
            return cost;
        }

        /*public void printInfo() {
            System.out.println("Attraction: " +
                    "name - " + name + '\n'
                    + "timeOfWork - " + timeOfWork + '\n'
                    + "cost - " + cost);
        }*/
    }
}
