import java.util.*;
public class raviAnnualBonus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int rank = sc.nextInt();
        int salary = sc.nextInt();
        float membershipFee = sc.nextFloat();

        int annualBonus =(12*salary)/100;
        System.out.print("Hello "+name+", Your annual Bonus is " +annualBonus+".");

    }
}