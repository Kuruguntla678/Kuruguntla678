import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal amount (INR): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest (% per annum): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("\nThe Simple Interest is INR " + simpleInterest + 
                           " for Principal INR " + principal + 
                           ", Rate of Interest " + rate + "% per annum, and Time " + time + " years.");
        scanner.close();
    }
}