public class AlphanumericCheck {
    public static void main(String[] args) {
        // Input string
        String input = "abcd1234";

        // Check if the string is alphanumeric
        if (input.matches("[a-zA-Z0-9]+")) {
            System.out.println("The string is alphanumeric.");
        } else {
            System.out.println("The string is not alphanumeric.");
        }
    }
}
