import java.util.ArrayList;
import java.util.Scanner;
public class SmartParkingSlotManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> parking = new ArrayList<>();
        int choice;
        do {
            System.out.println("\nSmart Parking Slot Manager");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String entry = sc.nextLine();

                    if (parking.contains(entry)) {
                        System.out.println("Vehicle is already parked.");
                    } else {
                        parking.add(entry);
                        System.out.println("Vehicle entered successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String exit = sc.nextLine();

                    if (parking.remove(exit)) {
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Vehicle not found in parking.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Vehicle Registration Number to Search: ");
                    String search = sc.nextLine();

                    if (parking.contains(search)) {
                        System.out.println("Vehicle is currently parked.");
                    } else {
                        System.out.println("Vehicle is not parked.");
                    }
                    break;
                case 4:
                    System.out.println("\nParked Vehicles:");

                    if (parking.isEmpty()) {
                        System.out.println("No vehicles are currently parked.");
                    } else {
                        for (int i = 0; i < parking.size(); i++) {
                            System.out.println((i + 1) + ". " + parking.get(i));
                        }
                    }
                    System.out.println("Total Occupied Parking Slots: " + parking.size());
                    break;
                case 5:
                    System.out.println("Exiting Smart Parking Slot Manager...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}