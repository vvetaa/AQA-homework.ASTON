package lesson2_3.task_1;

public class Product {
    private final String name;
    private final String dateOfProduction;
    private final String manufacturer;
    private final String countryOfOrigin;
    private final int price;
    private final boolean isBooked;

    public Product(String name, String dateOfProduction, String manufacturer, String countryOfOrigin, int price, boolean orderStatus) {
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = orderStatus;
    }

    public void print() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + dateOfProduction);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование покупателем: " + (isBooked ? "Забронировано" : "Не забронировано"));
        System.out.println();
    }
}