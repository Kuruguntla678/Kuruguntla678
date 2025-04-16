import java.util.Scanner; 
public class weightconverter { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the weight in pounds: "); 
double weightInPounds = scanner.nextDouble(); 
double weightInKg = weightInPounds * 0.453592; 
System.out.println("\nThe weight of the person in pounds is " + weightInPounds + 
" and in kilograms is " + weightInKg); 
scanner.close(); 
} 
}