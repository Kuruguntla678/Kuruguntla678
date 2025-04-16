import java.util.Scanner;

public class trip { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: "); 
        String name = scanner.nextLine(); 

        System.out.print("Enter the city you are traveling from: "); 
        String fromCity = scanner.nextLine(); 

        System.out.print("Enter the via city: "); 
        String viaCity = scanner.nextLine(); 

        System.out.print("Enter the destination city: "); 
        String toCity = scanner.nextLine(); 

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: "); 
        double distanceFromToVia = scanner.nextDouble(); 

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: "); 
        double distanceViaToFinalCity = scanner.nextDouble(); 

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: "); 
        int timeFromToVia = scanner.nextInt(); 

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: "); 
        int timeViaToFinalCity = scanner.nextInt(); 

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Improved output formatting
        System.out.println("\nThe total distance traveled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " miles and the total time " +
                           "taken is " + totalTime + " minutes.");

        System.out.print("\nEnter the base fee in INR: "); 
        double fee = scanner.nextDouble(); 

        System.out.print("Enter the discount percentage: "); 
        double discountPercent = scanner.nextDouble(); 

        double discount = (fee * discountPercent) / 100; 
        double finalAmount = fee - discount; 

        // Improved output formatting for financial details
        System.out.println("\nThe results of the transaction are:");
        System.out.println("Fee: INR " + fee); 
        System.out.println("Discount: INR " + discount); 
        System.out.println("Final amount after discount: INR " + finalAmount); 

        scanner.close(); 
    } 
}