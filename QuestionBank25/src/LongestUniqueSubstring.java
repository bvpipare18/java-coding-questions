import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        // Input string
        String input = "abcabbb";

        // HashSet to store characters in the current window
        HashSet<Character> charSet = new HashSet<>();

        // Variables for the sliding window
        int start = 0; // Start index of the window
        int maxLength = 0; // Length of the longest substring

        // Iterate over the string with an expanding window
        for (int end = 0; end < input.length(); end++) {
            // If the character is already in the set, shrink the window from the left
            while (charSet.contains(input.charAt(end))) {
                charSet.remove(input.charAt(start));
                start++;
            }

            // Add the current character to the set
            charSet.add(input.charAt(end));

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        // Output the length of the longest substring with no repeating characters
        System.out.println("Length of the longest substring: " + maxLength);
    }
}
