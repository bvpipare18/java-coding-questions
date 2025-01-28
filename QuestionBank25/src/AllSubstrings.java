public class AllSubstrings {
    public static void main(String[] args) {
        // Input string
        String input = "abc";

        // Generate and print all substrings
        System.out.println("Substrings of the string '" + input + "':");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                // Extract substring from index i to j
                String substring = input.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
