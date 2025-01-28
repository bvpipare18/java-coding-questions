public class ExtractDigitsAndSum {
    public static void main(String[] args) {
        // Input string
        String input = "abc123xyz456";

        // Variable to store the sum of digits
        int sum = 0;

        // Iterate through each character of the string
        for (char ch : input.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Add the digit to the sum
                sum += Character.getNumericValue(ch);
            }
        }

        // Print the sum of digits
        System.out.println("Sum of digits: " + sum);
    }
}
