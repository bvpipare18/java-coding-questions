public class RemoveVowels {
    public static void main(String[] args) {
        // Input string
        String input = "Mysore";

        // String to store the result
        String result = "";

        // Iterate through each character of the string
        for (char ch : input.toCharArray()) {
            // Check if the character is not a vowel (case insensitive)
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                result += ch; // Append non-vowel characters to result
            }
        }

        // Print the resultant string
        System.out.println("String after removing vowels: " + result);
    }
}
