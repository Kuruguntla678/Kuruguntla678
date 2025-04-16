import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents < 2) {
            System.out.println("\nNo handshakes possible with less than 2 students.");
        } else {
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("\nThe maximum number of possible handshakes among " + numberOfStudents + 
                               " students is: " + handshakes);
        }
        scanner.close();
    }
}