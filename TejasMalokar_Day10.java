import java.util.*;
class Day10{
	public static int Fact(int n){
	if(n==0){
	return 1;
}
	return n*Fact(n-1);
}
	publuc static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(Fact(n));
}
}