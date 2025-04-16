import java.util.Scanner;

public class DOUBLEOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take a, b, and c as input values from the user (as double)
        System.out.print("Enter the value for a (fee): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value for b (discountPercent): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();

        // Perform the operations, considering operator precedence
        double result1 = a + b * c;  // Multiplication has higher precedence than addition
        double result2 = a * b + c;  // Multiplication has higher precedence than addition
        double result3 = c + a / b;  // Division has higher precedence than addition
        double result4 = a % b + c;  // Modulus has higher precedence than addition

        // Output the results of the double operations
        System.out.println("The results of DOUBLE Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close the scanner
        scanner.close();
    }
}