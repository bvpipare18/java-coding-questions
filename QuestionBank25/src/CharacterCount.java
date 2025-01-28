import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        // Input string
        String input = "statistics";

        // HashMap to store the count of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // If the character is already in the map, increment its count
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print the character count
        for (char ch : charCount.keySet()) {
            System.out.println(ch + ": " + charCount.get(ch));
        }
    }
}
