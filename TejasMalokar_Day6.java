import java.util.*;

class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("This points lies in first quadrants.");
        } else if (x < 0 && y > 0) {
            System.out.println("This points lies in second quadrants.");
        } else if (x < 0 && y < 0) {
            System.out.println("This points lies in third quadrants.");
        } else if (x > 0 && y < 0) {
            System.out.println("This points lies in fourth quadrants.");
        } else if (x == 0 && y == 0) {
            System.out.println("This points lies at origin.");
        } else if (x == 0) {
            System.out.println("this points lies on the y-axis.");
        } else if (y == 0) {
            System.out.println("This points lies on the x-axis.");
        } else {
            System.out.println("This points do not fall into any quadrant.");
        }
    }
}
