import java.util.*;
class Day32 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeVowels(input);

        System.out.println("String after removing vowels: " + result);

        scanner.close();
    }

    public static String removeVowels(String input) {
        // Define a string to store the result
        StringBuilder result = new StringBuilder();

        // Convert the input string to lowercase to handle uppercase vowels
        input = input.toLowerCase();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is not a vowel and append it to the result
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i'
                    && currentChar != 'o' && currentChar != 'u') {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
