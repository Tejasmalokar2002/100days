import java.util.*;
 class Day18 {
    // Function to calculate the greatest common divisor (GCD) of two numbers
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to add two fractions and simplify the result
    static void addFractions(int num1, int den1, int num2, int den2) {
        // Calculate the common denominator
        int commonDenominator = den1 * den2;

        // Calculate the new numerators
        int newNum1 = num1 * den2;
        int newNum2 = num2 * den1;

        // Calculate the sum of the numerators
        int sumNumerators = newNum1 + newNum2;

        // Calculate the greatest common divisor (GCD) of the sum and the common denominator
        int gcdValue = gcd(sumNumerators, commonDenominator);

        // Simplify the fraction by dividing both the numerator and denominator by their GCD
        int resultNum = sumNumerators / gcdValue;
        int resultDen = commonDenominator / gcdValue;

        System.out.println(resultNum + "/" + resultDen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numerator and denominator of the first fraction
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();

        // Input numerator and denominator of the second fraction
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();

        // Add and simplify the fractions
        addFractions(num1, den1, num2, den2);
    }
}
