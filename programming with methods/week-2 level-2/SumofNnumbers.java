import java.util.Scanner;

public class SumofNnumbers {

 public static int SumUsingRecursion(int num){
    if(num != 0){
    return num + SumUsingRecursion(num - 1);
    }
    return num ;
 }
 public static int SumUsingFormulae(int num){
    int sum = (num*(num+1))/2;
    return sum;
 }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println("The Sum of N numbers is(using recursion) : " + SumUsingRecursion(num));
    System.out.println("The Sum of N numbers is(using formulae) : " + SumUsingFormulae(num) );
    sc.close();
}   
}