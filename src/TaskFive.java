import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        short totalBanks = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int totalClasses = totalBanks / (whiteColor + brownColor);
        int totalWhite = totalClasses * whiteColor;
        int totalBrown = totalClasses * brownColor;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite
                + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
}
