import java.util.*;
class Day36 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String capitalizedString = capitalizeFirstAndLastLetter(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + capitalizedString);
    }

    public static String capitalizeFirstAndLastLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));

                // Capitalize the first and last letters, and keep the middle letters as they are.
                String capitalizedWord = firstChar + word.substring(1, word.length() - 1) + lastChar;
                result.append(capitalizedWord).append(" ");
            } else {
                // If the word has only one character, just capitalize it.
                result.append(Character.toUpperCase(word.charAt(0))).append(" ");
            }
        }

        // Remove the trailing space and return the result.
        return result.toString().trim();
    }
}
