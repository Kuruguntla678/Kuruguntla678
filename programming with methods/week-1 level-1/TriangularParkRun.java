import java.util.Scanner;

public class TriangularParkRun {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; 
        return (int) Math.ceil(5000 / perimeter); 
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the park in meters: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side of the park in meters: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side of the park in meters: ");
        double side3 = sc.nextDouble();
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        sc.close();
    }
}