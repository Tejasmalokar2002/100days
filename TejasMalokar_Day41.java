import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Day41 {
    public static boolean matchStrings(String strWithWildcard, String targetString) {
        String regex = strWithWildcard
                .replace(".", "\\.")
                .replace("*", ".*")
                .replace("?", ".");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(targetString);
        return matcher.matches();
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String strWithWildcard = sc.nextLine();
        String targetString1 = sc.nextLine();
        String targetString2 = sc.nextLine();

        System.out.println("Matching for targetString1: " + matchStrings(strWithWildcard, targetString1));
        System.out.println("Matching for targetString2: " + matchStrings(strWithWildcard, targetString2));
    }
}
