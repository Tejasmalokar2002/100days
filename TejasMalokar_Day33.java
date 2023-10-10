import java.util.*;
class Day33{
	public static Boolean isPalindrome(String str){
	for(int i=0; i<str.length(); i++){
	if(str.charAt(i)!=str.charAt(str.length()-1-i)){
	return false;
}	
}
return true;
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	if(isPalindrome(str)){
	System.out.print("Palindrome");
} else{
	System.out.print("Not a Palindrome");
}
}
}