public class ReverseWords {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "Hello World from Java";

        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");

        // StringBuilder to store the result
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate over the words array in reverse order and append each word to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" "); // Add a space between words
            }
        }

        // Output the reversed sentence
        System.out.println(reversedSentence.toString());
    }
}
