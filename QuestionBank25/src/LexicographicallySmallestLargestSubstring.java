public class LexicographicallySmallestLargestSubstring {
    public static void main(String[] args) {
        // Input string
        String input = "welcometojava";

        // Variables to store the smallest and largest substrings
        String smallest = input.substring(0, 3);
        String largest = input.substring(0, 3);

        // Iterate through the string and check each substring of length 3
        for (int i = 1; i <= input.length() - 3; i++) {
            String substring = input.substring(i, i + 3);

            // Update the smallest and largest substrings
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        // Output the results
        System.out.println("Lexicographically smallest substring: " + smallest);
        System.out.println("Lexicographically largest substring: " + largest);
    }
}
