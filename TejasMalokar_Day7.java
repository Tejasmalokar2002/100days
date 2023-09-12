import java.util.Scanner;

public class DaysInMonth {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
            return 29; // February has 29 days in a leap year
        }

        return daysPerMonth[month];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        int daysInMonth = getDaysInMonth(year, month);

        if (daysInMonth == -1) {
            System.out.println("Invalid month. Month should be between 1 and 12.");
        } else {
            System.out.println("Number of days in " + year + "/" + month + ": " + daysInMonth);
        }

        scanner.close();
    }
}
