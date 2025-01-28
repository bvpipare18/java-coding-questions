public class RemoveDuplicates {
    public static void main(String[] args) {
        // Input string
        String input = "Mississippi";

        // Variable to store the resultant string without duplicates
        StringBuilder result = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            // Check if the character is not already in the result
            if (result.indexOf(String.valueOf(input.charAt(i))) == -1) {
                // If not, append the character to the result
                result.append(input.charAt(i));
            }
        }

        // Print the resultant string with unique characters
        System.out.println("String without duplicates: " + result.toString());
    }
}
