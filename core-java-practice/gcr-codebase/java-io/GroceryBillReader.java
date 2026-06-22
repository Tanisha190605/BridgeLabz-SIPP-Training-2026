import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {

        int count = 0;

        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Bill Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            br.close();

            System.out.println("\nTotal Number of Lines = " + count);

        } catch (FileNotFoundException e) {
            System.out.println("bill.txt file not found!");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}