package lesson2_5;

public class Methods {
    public static int sumDoubleArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        //Проверка размера массива
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен содержать 4 строки. Сейчас их: " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " должна содержать 4 элемента. Сейчас их: " + arr[i].length);
            }
        }

        //Преобразование в int и суммирование
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arr[i][j]);
                }
            }
        }
        return sum;
    }
}
