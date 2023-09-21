import java.util.*;
class Day9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = 0;
		while(n!=0){
		    n=n/10;
		    len++;
		}
		System.out.println(len);
	}
}
