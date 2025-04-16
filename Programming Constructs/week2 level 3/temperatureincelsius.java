import java.util.Scanner;
public class temperatureincelsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature in celsius");
        double temperatureinfahernheit = scanner.nextDouble();
        double temperatureincelsius= ((temperatureinfahernheit - 32) * 5/9);
        System.out.println(" The" + temperatureinfahernheit  + " fahernheit is " + temperatureincelsius + " celsius ");
        scanner.close();
    }
}