public class UppercaseReverse {
    public static void main(String[] args) {
        // Input string
        String input = "learning";

        // Convert the string to uppercase
        String upperCaseString = input.toUpperCase();

        // Reverse the uppercase string manually
        String reversedString = "";
        for (int i = upperCaseString.length() - 1; i >= 0; i--) {
            reversedString += upperCaseString.charAt(i);
        }

        // Print the reversed uppercase string
        System.out.println("Reversed uppercase string: " + reversedString);
    }
}
