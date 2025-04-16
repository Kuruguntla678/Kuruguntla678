import java.util.Scanner;
public class smallestnumbercheck {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter three numbers: ");
int number1 = scanner.nextInt();
int number2 = scanner.nextInt();
int number3 = scanner.nextInt();
boolean isFirstSmallest = (number1 <= number2 && number1 <= number3);
System.out.println("Is the first number the smallest? " +(isFirstSmallest ? "Yes" : "No"));
scanner.close();
}
}

