import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
class Day38 {

    // Function to print non-repeating characters
    public static void printNonRepeatingCharacters(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        // Creating a map with character counts
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Printing non-repeating characters
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println("Input String: " + inputString);
        System.out.print("Non-repeating characters: ");
        printNonRepeatingCharacters(inputString);
    }
}
