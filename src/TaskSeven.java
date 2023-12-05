import java.util.Arrays;

public class TaskSeven {
    public static void main(String[] args) {
        short weightOne = 250;
        short weightTwo = 500;
        int needWeight = 7000;

        int optionOne = needWeight / weightOne;
        int optionTwo = needWeight / weightTwo;
        int average = (optionOne + optionTwo) / 2;

        System.out.println("Если спортсмен будет терять каждый день по " + weightOne + " граммов, то он похудеет за " + optionOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + weightTwo + " граммов, то он похудеет за " + optionTwo + " дней");
        System.out.println("В среднем для похудения потребуется " + average + " дней");
    }
}
