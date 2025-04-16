import java.util.Scanner;
public class HeightConverter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);// Take user input for height in centimeters
System.out.print("Enter your height in centimeters: ");
double heightCm = input.nextDouble();
double cmPerInch = 2.54; // 1 inch = 2.54 cm
double inchesPerFoot = 12; // 1 foot = 12 inches
double heightInches = heightCm / cmPerInch;
int feet = (int) (heightInches / inchesPerFoot); // Integer division for feet
double remainingInches = heightInches % inchesPerFoot;
System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, remainingInches);
input.close();
}
}