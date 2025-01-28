import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Input string
        String input = "developer";

        // Create a LinkedHashMap to store character frequencies
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Iterate through the string and populate the frequency map
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (char ch : input.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                System.out.println("The first non-repeating character is: " + ch);
                return;
            }
        }

        // If no non-repeating character is found
        System.out.println("No non-repeating character found.");
    }
}
