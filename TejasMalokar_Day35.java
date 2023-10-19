import java.util.*;
class Day35 {
    public static int sumOfNumbers(String input) {
        int sum = 0;
        String number = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                number += ch;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }

        // Add the last number if the string ends with a number
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = sumOfNumbers(str);

        System.out.println("Input String: " + str);
        System.out.println("Sum of Numbers in the String: " + result);
    }
}
