import java.util.Scanner;

public class BMIReport {

    static String[] getBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    static String[][] createReport(double[][] data) {
        String[][] report = new String[10][4];

        for (int i = 0; i < 10; i++) {
            String[] result = getBMI(data[i][0], data[i][1]);

            report[i][0] = String.valueOf(data[i][1]);
            report[i][1] = String.valueOf(data[i][0]);
            report[i][2] = result[0];
            report[i][3] = result[1];
        }

        return report;
    }

    static void display(String[][] report) {
        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.println(report[i][0] + "\t" +
                    report[i][1] + "\t" +
                    report[i][2] + "\t" +
                    report[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] report = createReport(data);
        display(report);

        sc.close();
    }
}