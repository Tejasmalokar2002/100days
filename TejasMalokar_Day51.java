import java.util.*;
class Day51{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	int arr[] = new int[t];
	for(int i=0; i<t; i++){
	arr[i] = sc.nextInt();
}
	Arrays.sort(arr);
	for(int i=0; i<t; i++){
	System.out.print(arr[i]);
}
}
}