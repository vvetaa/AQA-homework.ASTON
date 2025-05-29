package lesson2_4.task_1;

public class Cat extends Animal {
    public static int countCat;
    public boolean isFed = false;

    public Cat (String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int meters) {
        int limit = 200;
        if (meters < limit) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может пробежать больше чем " + limit + " м.");
        }
    }

    @Override
    public void swim(int meters) {
        System.out.println(name + " не умеет плавать.");
    }

    public static void getCountCat(){
        System.out.println("Котов: " + countCat);
    }

    public void eat(Bowl bowl, int food) {
        if (bowl.getFoodAmount() < food) {
            System.out.println(name + " хочет больше еды в миске.");
        } else {
            bowl.reduceFood(food);
            isFed = true;
            System.out.println(name + " покушал и больше не голоден.");
        }
    }
}
