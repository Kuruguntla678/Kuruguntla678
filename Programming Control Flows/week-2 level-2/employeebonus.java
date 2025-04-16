import java.util.Scanner;

public class employeebonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% of salary
            System.out.println("The employee gets a bonus of: $" + bonus);
        } else {
            System.out.println("No bonus for the employee.");
        }

        scanner.close();
    }
}