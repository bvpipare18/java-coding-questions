public class StringCheck {
    public static void main(String[] args) {
        // Input string
        String input = "Abcdef";

        // Call the method to check the conditions
        boolean result = startsWithVowelEndsWithConsonant(input);

        // Output the result
        if (result) {
            System.out.println("The string starts with a vowel and ends with a consonant.");
        } else {
            System.out.println("The string does not start with a vowel and end with a consonant.");
        }
    }

    // Method to check if the string starts with a vowel and ends with a consonant
    public static boolean startsWithVowelEndsWithConsonant(String str) {
        // Check if the string is not empty
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Get the first and last characters of the string
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        // Check if the first character is a vowel (case-insensitive)
        if ("AEIOUaeiou".indexOf(firstChar) == -1) {
            return false;  // First character is not a vowel
        }

        // Check if the last character is a consonant (alphabetic but not a vowel)
        if (!Character.isAlphabetic(lastChar) || "AEIOUaeiou".indexOf(lastChar) != -1) {
            return false;  // Last character is not a consonant
        }

        // If both conditions are true, return true
        return true;
    }
}
