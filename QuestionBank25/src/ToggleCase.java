public class ToggleCase {
    public static void main(String[] args) {
        // Input string
        String input = "AbCdeF";

        // Call the function to toggle the case
        String result = toggleCase(input);

        // Output the result
        System.out.println(result);
    }

    // Function to toggle the case of each character in the string
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase and append to result
                result.append(Character.toLowerCase(ch));
            } else {
                // Convert to uppercase and append to result
                result.append(Character.toUpperCase(ch));
            }
        }

        return result.toString();
    }
}
