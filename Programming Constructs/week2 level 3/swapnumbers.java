import java.util.Scanner;
public class swapnumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number1 value: ");
        int num1= scanner.nextInt();
        System.out.println("enter the number2 value: ");
        int num2 = scanner. nextInt();
        int temp= num1;
        num1=num2;
        num2=temp;
        System.out.println("The Swapped numbers are" + num1 + "and" + num2);
        scanner.close();
        
    }
}