import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        double areaInInches = 0.5 * base * height;
        double heightInCm = height * 2.54; 
        double heightInFeet = height / 12; 
        double heightInInches = height; // Correct variable name

        System.out.println("The area of the triangle is: " + areaInInches + " square inches.");
        System.out.println("Your height in cm is " + heightInCm + ", in feet is " + heightInFeet + " jand in inches is " + heightInInches); // Fixed variable name

        scanner.close();
    }
}