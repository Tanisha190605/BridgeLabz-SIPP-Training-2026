import java.util.Scanner;

public class StringLength {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println("User Length: " + findLength(s));
        System.out.println("Built-in Length: " + s.length());

        sc.close();
    }
}