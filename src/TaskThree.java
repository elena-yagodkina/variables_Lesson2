import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        int totalSheets = 480;

       int countSheetsStudent = totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);

        System.out.println("На каждого ученика рассчитано " + countSheetsStudent + " листов бумаги");
    }
}
