import java.util.*;
public class StrongNumber {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        return sumOfFactorials == originalNum;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 

        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
