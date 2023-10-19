import java.util.*;

class Day42 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
        int[] array1 =new int[n];
        int[] array2 = new int[m];
	System.out.println("Enter the first elements");
	for(int i=0; i<n; i++){
	array1[i] = sc.nextInt();
	}
	System.out.println("Enter the second elements");
	for(int i=0; i<m; i++){
	array2[i] = sc.nextInt();
	}
        boolean areEqual = Arrays.equals(array1, array2);

        if (areEqual) {
            System.out.println("Arrays are the same.");
        } else {
            System.out.println("Arrays are not the same.");
        }
    }
}
