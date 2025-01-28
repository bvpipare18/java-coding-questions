public class ReverseString {
    public static void main(String[] args) {
        // Input string
        String input = "Bangalore";

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Reverse the character array
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            // Swap characters
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }

        // Convert the reversed character array back to a string
        String reversed = "";
        for (char c : charArray) {
            reversed += c;
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
