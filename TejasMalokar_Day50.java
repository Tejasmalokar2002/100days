import java.util.Scanner;

class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = calculatePositiveSquareSum(arr);
        System.out.println(sum);
    }

    public static int calculatePositiveSquareSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num * num;
            }
        }
        return sum;
    }
}
