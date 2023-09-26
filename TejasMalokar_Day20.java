import java.util.*;
class Day20{
	public static boolean isPrime(int n){
	if(n==0 || n==1){
	return false;
}
int c = 0;
	for(int i=1; i<=n/2; i++){
	if(n%i==0){
	c++;
}
}
	if(c==n/2){
	return false;
} else{
return true;
}
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(isPrime(n)){
	System.out.println(n + " is a prime number");
}
	else{
	System.out.println(n + " is not a prime number");
}
}
}