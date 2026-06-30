import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SmartClassroomAttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> attendance = new HashMap<>();
        int choice;
        do {
            System.out.println("\nSmart Classroom Attendance Tracker");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Subject Name: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();
                    attendance.putIfAbsent(subject, new ArrayList<>());
                    ArrayList<String> students = attendance.get(subject);
                    if (students.contains(student)) {
                        System.out.println("Attendance already marked for " + student + " in " + subject + ".");
                    } else {
                        students.add(student);
                        System.out.println("Attendance marked successfully.");
                    }
                    break;
                case 2:
                    if (attendance.isEmpty()) {
                        System.out.println("No attendance records available.");
                    } else {
                        System.out.println("\nAttendance Records:");
                        for (String sub : attendance.keySet()) {
                            System.out.println("\nSubject: " + sub);
                            ArrayList<String> list = attendance.get(sub);
                            for (int i = 0; i < list.size(); i++) {
                                System.out.println((i + 1) + ". " + list.get(i));
                            }
                            System.out.println("Total Students Present: " + list.size());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
        sc.close();
    }
}