public class UniqueCharacters {
    public static void main(String[] args) {
        // Input string
        String input = "Programming";

        // Use a boolean array to track character occurrences (assuming only lowercase and uppercase English letters)
        boolean[] charPresence = new boolean[256]; // ASCII size

        // Iterate through the string to check for duplicates
        boolean isUnique = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character has already appeared
            if (charPresence[ch]) {
                isUnique = false;
                break;
            }
            // Mark the character as encountered
            charPresence[ch] = true;
        }

        // Output the result
        if (isUnique) {
            System.out.println("The string contains only unique characters.");
        } else {
            System.out.println("The string contains duplicate characters.");
        }
    }
}
