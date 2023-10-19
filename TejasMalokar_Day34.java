import java.util.Scanner;
 class Day34 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter algebraic expression: ");
 String str = sc.nextLine();
 String newstr = str.replaceAll("[(){}]","");
 System.out.println("Expression without brackets : "+newstr);
 }
}
