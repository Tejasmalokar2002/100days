import java.util.*;

class Day22 {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 2) {
            System.out.println("Enter a number greater than 2.");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " can be expressed as the sum of " + i + " and " + (n - i));
                return;
            }
        }

        System.out.println("No prime numbers found that sum up to " + n);
    }
}
