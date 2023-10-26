class Day49 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, -5};
        int[] array2 = {-2, 4, 1};

        int minimumScalarProduct = findMinimumScalarProduct(array1, array2);
        System.out.println("Minimum scalar product is: " + minimumScalarProduct);
    }

    private static int findMinimumScalarProduct(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must have the same size.");
        }

        // Sorting the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        int minimumScalarProduct = 0;
        for (int i = 0; i < array1.length; i++) {
            minimumScalarProduct += array1[i] * array2[array2.length - 1 - i];
        }

        return minimumScalarProduct;
    }
}
