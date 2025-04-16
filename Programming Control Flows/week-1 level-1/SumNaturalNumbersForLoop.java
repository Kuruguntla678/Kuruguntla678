import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;

            // Using for-loop to calculate sum
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Output the results
            System.out.println("Sum of first " + n + " natural numbers using formula: " + formulaSum);
            System.out.println("Sum of first " + n + " natural numbers using for-loop: " + loopSum);

            // Check if both computations are correct
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct! ✅");
            } else {
                System.out.println("There is an error in the computations! ❌");
            }
        }

        scanner.close();
    }
}