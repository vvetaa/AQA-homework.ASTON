package lesson2_4.task_1;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Барсик");
        Animal dog1 = new Dog("Шарик");
        Animal dog2 = new Dog("Барбос");
        Animal.printCountAnimal();
        Cat.ptrintCountCat();
        Dog.ptrintCountDog();
        cat1.run(10);
        dog1.swim(3);
        dog2.run(120);
    }
}
