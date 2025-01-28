public class ShiftCharacters {
    public static void main(String[] args) {
        // Input string
        String input = "HelloWorld";

        // StringBuilder to store the result
        StringBuilder shiftedString = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Shift the character by 2 positions in the ASCII table
            char shiftedChar = (char) (currentChar + 2);

            // Append the shifted character to the StringBuilder
            shiftedString.append(shiftedChar);
        }

        // Print the resulting string after shifting characters
        System.out.println("Original String: " + input);
        System.out.println("Shifted String: " + shiftedString.toString());
    }
}
