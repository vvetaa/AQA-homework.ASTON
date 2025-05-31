package lesson2_5;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"4", "5", "7", "5"},
                {"o", "11", "4", "5"}, //тут буква 'о'
                {"4", "12", "34", "1"},
                {"0", "4", "7", "4"}
        };

        try {
            System.out.println("Сумма всех элементов массива равна " + Methods.sumDoubleArray(arr));
        } catch (MyArraySizeException e) {
            StackTraceElement component = e.getStackTrace()[0];
            System.err.println("Строка: " + component.getLineNumber());
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            StackTraceElement component = e.getStackTrace()[0];
            System.err.println("Строка: " + component.getLineNumber());
            System.err.println("Ошибка данных в массиве: " + e.getMessage());
        }

        //ArrayIndexOutOfBoundsException.
        try {
            int i = 0;
            int j = 4; // j = 3
            System.out.println("В ячейке [" + i + "][" + j + "] находится: " + arr[i][j]);
        } catch (ArrayIndexOutOfBoundsException e) {
            StackTraceElement component = e.getStackTrace()[0];
            System.err.println("Строка: " + component.getLineNumber());
            System.err.println("Выход за границы массива: " + e.getMessage());
        }
    }
}
