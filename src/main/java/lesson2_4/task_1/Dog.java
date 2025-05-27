package lesson2_4.task_1;

public class Dog extends Animal {
    public static int countDog;
    public Dog (String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int meters) {
        if (meters < 500) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может пробежать " + meters + " м.");
        }
    }

    @Override
    public void swim(int meters) {
        if (meters < 10) {
            System.out.println(name + " проплыл " + meters + " м.");
        } else {
            System.out.println(name + " не может проплыть " + meters + " м.");
        }
    }

    public static void ptrintCountDog(){
        System.out.println("Собак : " + countDog);
    }
}
