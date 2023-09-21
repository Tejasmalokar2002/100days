import java.util.*;
class Day14{
	public static int rev(int T){
	int res = 0;
	int rem = 0;
	while(T!=0){
	rem = T % 10;
	res = res*10+rem;
	T = T/10;
	}
return res;
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	System.out.print(rev(T));
	}
}