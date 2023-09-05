import java.util.*;
class Day2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.print("Yes");
        } else{
            System.out.println("No");
        }
    }
}
