import java.util.Scanner;

public class kingdomTaxSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 0;

        if (income < 10000) {
            tax = income * 0.05;
            System.out.println("Tax Bracket: 5%");
        }
        else if (income <= 50000) {
            tax = income * 0.15;
            System.out.println("Tax Bracket: 15%");
        }
        else {
            tax = income * 0.30;
            System.out.println("Tax Bracket: 30%");
        }

        System.out.println("Tax Amount = " + tax);

        sc.close();
    }
}