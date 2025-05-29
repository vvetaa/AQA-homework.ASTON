package lesson2_4.task_1;

public class Bowl {


    private int foodAmount;

    public int addFood(int volume){
        System.out.println("Наполним миску:");
        if (volume < 0) {
            System.out.println("В миске не может быть отрицательное количество еды!");
        } else {
            foodAmount += volume;
            System.out.println("В миске находится " + foodAmount + " еды.");
        }
        return foodAmount;
    }

    public int reduceFood(int volume){
        foodAmount -= volume;
        return foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
