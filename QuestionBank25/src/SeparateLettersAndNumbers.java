public class SeparateLettersAndNumbers {
    public static void main(String[] args) {
        // Input string
        String input = "level12345";

        // Separate letters and numbers
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        // Iterate through each character of the string
        for (char ch : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                letters.append(ch);
            }
            // Check if the character is a number
            else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        // Output the separated letters and numbers
        System.out.println("Letters: " + letters.toString());
        System.out.println("Numbers: " + numbers.toString());
    }
}
