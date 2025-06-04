package lesson2_4.task_1;

public class Dog extends Animal {
    public static int countDog;
    public Dog (String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int meters) {
        int limit = 500;
        if (meters <= limit) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может пробежать больше чем " + limit + " м.");
        }
    }

    @Override
    public void swim(int meters) {
        int limit = 10;
        if (meters <= limit) {
            System.out.println(name + " проплыл " + meters + " м.");
        } else {
            System.out.println(name + " не может проплыть больше чем " + limit + " м.");
        }
    }
}
