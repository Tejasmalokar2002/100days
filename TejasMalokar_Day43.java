import java.util.*;
class Day43 {
    public static void main(String[] args) {
        // Initialize different types of arrays
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];
        char[] charArray = new char[5];
        String[] stringArray = new String[5];

        // Print the types of the arrays
        System.out.println("Type of intArray: " + getArrayType(intArray));
        System.out.println("Type of doubleArray: " + getArrayType(doubleArray));
        System.out.println("Type of charArray: " + getArrayType(charArray));
        System.out.println("Type of stringArray: " + getArrayType(stringArray));
    }

    // Method to get the type of the array
    public static String getArrayType(Object array) {
        if (array.getClass().isArray()) {
            return array.getClass().getCanonicalName();
        } else {
            return "Not an array";
        }
    }
}
