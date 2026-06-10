import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter coffee type or type exit:");
            String coffee = sc.nextLine();
            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 
            int price = 0;

            switch (coffee.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double bill = price * quantity;
            double gst = bill * 0.18;
            double totalBill = bill + gst;

            System.out.println("Coffee Type : " + coffee);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Bill Amount : " + bill);
            System.out.println("GST (18%)   : " + gst);
            System.out.println("Total Bill  : " + totalBill);
        }

        System.out.println("Cafe Closed!");
        sc.close();
    }
}