import java.util.Scanner;

public class chocolatedivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("\nCannot divide chocolates among zero children!");
        } else {
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            System.out.println("\nThe number of chocolates each child gets is " + chocolatesPerChild + 
                               " and the number of remaining chocolates are " + remainingChocolates + ".");
        }
        scanner.close();
    }
}