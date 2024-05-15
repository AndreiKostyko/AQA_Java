public class Main {
    public static void main(String[] args)
    //throws MyArraySizeException, MyArrayDataException
    {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "3"},
                {"1", "2", "3", "4"}
        };
        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "3"},
                {"1", "2", "3", "4"}
        };
        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "R", "3", "3"},
                {"1", "2", "3", "4"}
        };

        SumArray sumArray = new SumArray();

        //System.out.println("Сумма всех элементов массива = " + sumArray.summationArray(correctArray));
        //sumArray.summationArray(wrongSizeArray);
        //sumArray.summationArray(wrongDataArray);
        try {
            sumArray.summationArray(correctArray);
            System.out.println("Сумма всех элементов массива = " + sumArray.summationArray(correctArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            sumArray.summationArray(wrongSizeArray);
            System.out.println("Сумма всех элементов массива = " + sumArray.summationArray(correctArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            sumArray.summationArray(wrongDataArray);
            System.out.println("Сумма всех элементов массива = " + sumArray.summationArray(correctArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
