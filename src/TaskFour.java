public class TaskFour {
    public static void main(String[] args) {
        byte machineProductivityTwoMin = 16;
        byte timeOne = 20;
        int timeTwo = timeOne * 72;
        int timeThree = timeTwo * 3;
        int timeFour = timeThree * 10;

        int machineProductivityTimeOne = machineProductivityTwoMin / 2 * timeOne;
        int machineProductivityTimeTwo = machineProductivityTwoMin / 2 * timeTwo;
        int machineProductivityTimeThree = machineProductivityTwoMin / 2 * timeThree;
        int machineProductivityTimeFour = machineProductivityTwoMin / 2 * timeFour;

        System.out.println("За " + timeOne + " минут машина произвела " + machineProductivityTimeOne + " бутылок");
        System.out.println("За " + timeTwo + " минут машина произвела " + machineProductivityTimeTwo + " бутылок");
        System.out.println("За " + timeThree + " минут машина произвела " + machineProductivityTimeThree + " бутылок");
        System.out.println("За " + timeFour + " минут машина произвела " + machineProductivityTimeFour + " бутылок");
    }
}
