import java.util.Scanner;

public class AsciiSumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate the sum of ASCII values
        int asciiSum = 0;
        for (char ch : input.toCharArray()) {
            asciiSum += (int) ch;
        }

        // Check divisibility by 4 and 5
        if (asciiSum % 4 == 0 && asciiSum % 5 == 0) {
            System.out.println("The sum is: " + asciiSum);
        } else {
            System.out.println("NA");
        }

        scanner.close();
    }
}
