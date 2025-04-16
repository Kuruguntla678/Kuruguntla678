import java.util.Scanner;

public class FactorArray {

   
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.println("The factors of " + num + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of the factors: " + sumOfSquares);

        sc.close();
    }
}
