import java.util.*;

public class ReverseInteger {

    public static int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            int rem = x % 10;

            if (ans > Integer.MAX_VALUE / 10 ||
                (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (ans < Integer.MIN_VALUE / 10 ||
                (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            ans = ans * 10 + rem;
            x = x / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        int result = reverse(x);

        System.out.println("Reversed Integer: " + result);

        sc.close();
    }
}