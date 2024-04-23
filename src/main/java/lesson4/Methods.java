package lesson4;

public class Methods {

    //1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public void printThreeWords() {
        String[] threeWords = new String[]{"Orange", "Banana", "Apple"};
        for (String str : threeWords) {
            System.out.println(str);
        }
    }

    //2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
// то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”
    public void checkSumSign() {
        int a = 7;
        int b = 15;
        if (a + b > 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }
    }

    //3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
// Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
// если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
// если больше 100 (100 исключительно) - “Зеленый”;
    public void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.print("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.print("Желтый");
        } else if (value > 100) {
            System.out.print("Зеленый");
        }
    }

    //4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public void compareNumbers() {
        int a = 90;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
    public boolean amountRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }
    }

    //6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
    public void isPositiveOrNegativeNumber(int n) {
        if (n >= 0) {
            System.out.println("Число " + n + " является положительным");
        } else {
            System.out.println("Число " + n + " является отрицательным");
        }
    }

    //7. Напишите метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public boolean isNumberGreaterOrLess_0(int n) {
        if (n >= 0) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }
    }

    //8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public void printLineXTimes(String str, int i) {
        int n = i;
        String s = str;
        while (i != 0) {
            System.out.println(s);
            i--;
        }
    }

    //9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public void replace0to1() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arrNew[i] = 1;
            } else {
                arrNew[i] = 0;
            }
        }
        /*for (int i : arrNew) {
            System.out.print(i + " ");
        }*/
    }

    //11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
    public void createArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            //System.out.print(arr[i] + " ");
        }
    }

    //12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public void multiply2SomeElements() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arrNew[i] = arr[i] * 2;
            } else
                arrNew[i] = arr[i];

        }
       /*for (int i : arrNew) {
            System.out.print(i + " ");
        }*/
    }

    //13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
    public void createArrayDiagonal1() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //14. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    public void createArraySizeLen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i : arr) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}

