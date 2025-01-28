public class VowelConsonantCount {
    public static void main(String[] args) {
        // Input string
        String input = "Technology";

        // Convert the string to lowercase for uniform comparison
        String lowerCaseInput = input.toLowerCase();

        // Variables to count vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character in the string
        for (char ch : lowerCaseInput.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
