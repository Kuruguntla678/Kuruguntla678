import java.util.Scanner;

public class friendscomparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = scanner.nextDouble();

        String youngest = (ageAmar < ageAkbar && ageAmar < ageAnthony) ? "Amar" :
                          (ageAkbar < ageAnthony) ? "Akbar" : "Anthony";

        String tallest = (heightAmar > heightAkbar && heightAmar > heightAnthony) ? "Amar" :
                         (heightAkbar > heightAnthony) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}