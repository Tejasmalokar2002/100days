import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        input.close();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + String.format("%.2f", root1));
            System.out.println("Root 2 = " + String.format("%.2f", root2));
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root 1 = Root 2 = " + String.format("%.2f", root));
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex.");
            System.out.println("Root 1 = " + String.format("%.2f", realPart) + " + " + String.format("%.2f", imaginaryPart) + "i");
            System.out.println("Root 2 = " + String.format("%.2f", realPart) + " - " + String.format("%.2f", imaginaryPart) + "i");
        }
    }
}
