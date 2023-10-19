import java.util.*;
class Day40 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String substringToReplace = sc.nextLine();
        String replacementString = sc.nextLine();

        String modifiedString = originalString.replace(substringToReplace, replacementString);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
