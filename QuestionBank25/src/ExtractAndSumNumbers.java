public class ExtractAndSumNumbers {
    public static void main(String[] args) {
        // Input string
        String input = "hello123world456";

        // Variables to store the extracted numbers
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        // Iterate through the string to extract numbers
        boolean isFirstNumber = true;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If it's the first number, add to num1
                if (isFirstNumber) {
                    num1.append(ch);
                } else {
                    num2.append(ch);
                }
            } else if (num1.length() > 0) {
                // When we encounter a non-digit after the first number, start collecting the second number
                isFirstNumber = false;
            }
        }

        // Convert the extracted number strings to integers
        int number1 = Integer.parseInt(num1.toString());
        int number2 = Integer.parseInt(num2.toString());

        // Calculate the sum
        int sum = number1 + number2;

        // Output the sum
        System.out.println("Sum of extracted numbers: " + sum);
    }
}
