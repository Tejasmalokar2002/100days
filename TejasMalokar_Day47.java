class Day47 {
    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Function to find the longest palindrome in an array
    static String longestPalindrome(String[] arr) {
        String longestPalindrome = "";
        for (String str : arr) {
            if (isPalindrome(str) && str.length() > longestPalindrome.length()) {
                longestPalindrome = str;
            }
        }
        return longestPalindrome;
    }

    // Main method to test the program
    public static void main(String[] args) {
        String[] arr = {"abc", "madam", "hello", "level", "noon"};
        String result = longestPalindrome(arr);
        if (!result.isEmpty()) {
            System.out.println("Longest palindrome in the array is: " + result);
        } else {
            System.out.println("No palindrome found in the array.");
        }
    }
}
