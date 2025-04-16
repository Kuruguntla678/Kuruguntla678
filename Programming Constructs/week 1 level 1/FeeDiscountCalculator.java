import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the student fee (in INR): ");
        double fee = input.nextDouble();

        // Reading the fee
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Output the discount amount and the final discounted fee
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);

        input.close();
    }
}