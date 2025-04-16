import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        // Perform the integer operations considering operator precedence
        int result1 = a + b * c;  // Multiplication has higher precedence than addition
        int result2 = a * b + c;  // Multiplication has higher precedence than addition
        int result3 = c + a / b;  // Division has higher precedence than addition
        int result4 = a % b + c;  // Modulus has higher precedence than addition

        // Output the results of the integer operations
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}