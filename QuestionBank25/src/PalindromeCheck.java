public class PalindromeCheck {
    public static void main(String[] args) {
        // Input string
        String input = "Java";

        // Convert the string to lowercase for case-insensitive comparison
        String lowerCaseInput = input.toLowerCase();

        // Variable to store the reversed string
        String reversed = "";

        // Reverse the string manually
        for (int i = lowerCaseInput.length() - 1; i >= 0; i--) {
            reversed += lowerCaseInput.charAt(i);
        }

        // Check if the original and reversed strings are equal
        if (lowerCaseInput.equals(reversed)) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome.");
        }
    }
}
