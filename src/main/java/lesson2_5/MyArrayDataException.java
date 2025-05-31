package lesson2_5;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int i, int j, String text) {
        super("В ячейке [" + i + "][" + j + "] не удалось преобразовать значение: '" + text + "'");
    }
}
