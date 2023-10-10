import java.util.*;
class Day31 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String toggledString = toggleString(input);
        System.out.println( toggledString);
    }

    public static String toggleString(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
            // Ignore non-alphabetic characters
        }
        return new String(chars);
    }
}
