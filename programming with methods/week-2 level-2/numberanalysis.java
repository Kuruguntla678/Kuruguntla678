import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nAnalysis of Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is ");
            if (isPositive(num)) {
                System.out.print("Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println("Negative.");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison between first (" + numbers[0] + ") and last (" + numbers[4] + ") number: ");
        if (result == 1) {
            System.out.println("First number is greater.");
        } else if (result == 0) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("First number is less.");
        }

        sc.close();
    }
}