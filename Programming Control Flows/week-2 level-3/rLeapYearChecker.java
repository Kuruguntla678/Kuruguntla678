import java.util.Scanner;

public class rLeapYearChecker {

    public static void checkLeapYearSingleIf(int year) {
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("\nUsing a single if condition with logical operators:");
        checkLeapYearSingleIf(year);

        scanner.close();
    }
}