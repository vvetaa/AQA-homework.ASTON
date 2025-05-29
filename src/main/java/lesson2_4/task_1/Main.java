package lesson2_4.task_1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Барбос");

        Animal.getCountAnimal();
        Cat.getCountCat();
        Dog.getCountDog();

        cat1.run(10);
        dog1.swim(3);
        dog2.run(120);
        System.out.println();

        Bowl bowl1 = new Bowl();
        bowl1.addFood(20);
        cat1.eat(bowl1, 10);
        System.out.println("В миске осталось " + bowl1.getFoodAmount() + " еды.");
        System.out.println();

        Bowl bowl2 = new Bowl();
        bowl2.addFood(40);
        Cat[] catsArray = {
                new Cat("Мурзик"),
                new Cat("Вася"),
                new Cat("Рыжик")
        };

        for (Cat cat : catsArray) {
            cat.eat(bowl2, 15);
            System.out.println(cat.name + " сейчас сытый? " + (cat.isFed ? "Да." : "Нет."));
        }

        System.out.println("В миске осталось " + bowl2.getFoodAmount() + " еды.");
    }
}
