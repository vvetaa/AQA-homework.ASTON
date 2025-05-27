package lesson2_4.task_1;

public class Cat extends Animal {
    public static int countCat;
    public String isFed;
    public Cat (String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int meters) {
        if (meters < 200) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может пробежать " + meters + " м.");
        }
    }

    @Override
    public void swim(int meters) {
        System.out.println(name + " не умеет плавать.");
    }

    public static void ptrintCountCat(){
        System.out.println("Котов: " + countCat);
    }
}
