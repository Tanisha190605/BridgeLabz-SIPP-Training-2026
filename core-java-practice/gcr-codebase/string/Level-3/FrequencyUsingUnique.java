import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {

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

    static String[][] frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.println("Char\tFreq");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }

        sc.close();
    }
}