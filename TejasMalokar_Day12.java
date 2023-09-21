import java.util.*;
class Day12{
	public static int FindSum(int n){
	int temp = n;
	int sum = 0;
	while(temp!=0){
	int rem = temp%10;
	sum+=rem;
	temp = temp/10;
	}
	return sum;
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print(FindSum(n));
	}
}	