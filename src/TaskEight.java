public class TaskEight {
    public static void main(String[] args) {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        double upSalaryMasha = salaryMasha + salaryMasha * 0.1;
        double upSalaryDenis = salaryDenis + salaryDenis * 0.1;
        double upSalaryKristina = salaryKristina + salaryKristina * 0.1;

        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;

        double upYearSalaryMasha = upSalaryMasha * 12;
        double upYearSalaryDenis = upSalaryDenis * 12;
        double upYearSalaryKristina = upSalaryKristina * 12;

        double diffSalaryMasha = upYearSalaryMasha - yearSalaryMasha;
        double diffSalaryDenis = upYearSalaryDenis - yearSalaryDenis;
        double diffSalaryKristina = upYearSalaryKristina - yearSalaryKristina;

        System.out.println("Маша теперь получает " + upSalaryMasha + " рублей. Годовой доход вырос на " + diffSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + upSalaryDenis + " рублей. Годовой доход вырос на " + diffSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + upSalaryKristina + " рублей. Годовой доход вырос на " + diffSalaryKristina + " рублей");

    }
}
