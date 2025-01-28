import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Input string
        String input = "management";

        // Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string to populate the frequency map
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Variables to track the most frequent character and its frequency
        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        // Iterate through the map to find the most frequent character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentFrequency = entry.getValue();

            // Update if the current character has higher frequency or if there's a tie with a smaller lexicographical character
            if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && currentChar < mostFrequentChar)) {
                mostFrequentChar = currentChar;
                maxFrequency = currentFrequency;
            }
        }

        // Print the most frequent character
        System.out.println("The most frequent character is: " + mostFrequentChar);
    }
}
