import java.util.Scanner;
public class temperatureinfahrenheit {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the temperature in celsius:");
        double temperatureincelsius= scanner.nextDouble();
        double temperatureinfahrenheit= (temperatureincelsius * 9/5) + 32;
        System.out.println(" The" + temperatureincelsius  + "celsius is" + temperatureinfahrenheit + "fahrenheit");
        scanner.close();

    }
}