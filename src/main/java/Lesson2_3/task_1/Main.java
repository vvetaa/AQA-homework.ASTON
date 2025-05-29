package Lesson2_3.task_1;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Huawei Mate 50", "10.11.2024", "Huawei", "China", 4999, true);
        productsArray[2] = new Product("Xiaomi Mi 10", "30.01.2025", "Xiaomi", "China", 3999, true);
        productsArray[3] = new Product("Sony Xperia", "22.08.2023", "Sony", "Japan", 4599, false);
        productsArray[4] = new Product("iPhone 15", "15.09.2024", "Apple Inc.", "USA", 6999, false);

        for (Product product : productsArray) {
            product.print();
        }
    }
}
