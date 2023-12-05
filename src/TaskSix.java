import java.util.Arrays;

public class TaskSix {
    public static void main(String[] args) {
        byte bananas = 5;
        short weightBanana = 80;
        short milk = 200;
        byte weightMilk = 105;
        byte iceCream = 2;
        short weightIceCream = 100;
        byte eggs = 4;
        short weightEgg = 70;

        int totalWeight = bananas * weightBanana + 2 * weightMilk + iceCream * weightIceCream + eggs * weightEgg;
        int totalWeightKg = totalWeight / 1000;

        System.out.println("Вес завтрака в граммах составляет " + totalWeight + '\n' + "Вес завтрака в килограммах составляет " + totalWeightKg);
    }
}
