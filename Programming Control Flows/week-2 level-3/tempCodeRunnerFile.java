import java.util.Scanner;

public class LeapYearChecker {

    public static void checkLeapYearMultipleIfElse(int year) {
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }

    public static void checkLeapYearSingleIf(int year) {
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year should be greater than or equal to 1582.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("\nUsing multiple if-else statements:");
        checkLeapYearMultipleIfElse(year);

        System.out.println("\nUsing a single if statement with multiple logical conditions:");
        checkLeapYearSingleIf(year);

        scanner.close();
    }
}