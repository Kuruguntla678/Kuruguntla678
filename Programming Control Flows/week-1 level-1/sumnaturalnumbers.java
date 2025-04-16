import java.util.Scanner;

public class sumnaturalnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int formulaSum = n * (n + 1) / 2; // Sum using the formula
            int loopSum = 0;
            int i = 1;

            // Sum using a loop
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Printing both sums
            System.out.println("Sum of first " + n + " natural numbers using formula: " + formulaSum);
            System.out.println("Sum of first " + n + " natural numbers using while loop: " + loopSum);

            // Verifying if both computations are correct
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct! ✅");
            } else {
                System.out.println("There is an error in the computations! ❌");
            }
        }

        scanner.close();
    }
}