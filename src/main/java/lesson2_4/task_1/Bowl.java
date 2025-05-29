package lesson2_4.task_1;

public class Bowl {
    private int foodAmount;

    public void addFood(int volume){
        System.out.println("Наполним миску:");
        if (volume < 0) {
            System.out.println("В миске не может быть отрицательное количество еды!");
        } else {
            foodAmount += volume;
            System.out.println("В миске находится " + foodAmount + " еды.");
        }
    }

    public void reduceFood(int volume){
        foodAmount -= volume;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
