package lesson2_6.task_2;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Иванов", "+798521431174");
        directory.add("Иванов", "+798521432274");
        directory.add("Петров", "+798521432255");

        System.out.println("Номера по фамилии Иванов: " + directory.get("Иванов"));
        System.out.println("Номера по фамилии Петров: " + directory.get("Петров"));
    }
}
