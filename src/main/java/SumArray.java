public class SumArray {
    public int summationArray(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (strArray.length != 4)
            throw new MyArraySizeException("Неверный размер массива");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length != 4) throw new MyArraySizeException("Неверный размер массива");
            for (int j = 0; j < strArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в строке=" + ++i + " столбце=" + ++j);
                }
            }
        }

        return sum;
    }
}