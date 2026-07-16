import java.util.Scanner;

public class UniqueCharacters {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    static char[] uniqueCharacters(String text) {
        int len = findLength(text);

        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (temp[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = ch;
            }
        }

        char[] result = new char[k];

        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] result = uniqueCharacters(text);

        for (char ch : result) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}