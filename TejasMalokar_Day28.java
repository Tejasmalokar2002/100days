import java.util.*;
class Day28{
	public static String RevString(String str){
		String newStr = "";
		for(int i=str.length()-1; i>=0; i--){
			newStr+=str.charAt(i);
		}
	return newStr;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(RevString(str));
	}
}