
import java.util.Scanner;

public class UnitConverter3 {
    public static double  convertFahrenheittoCelsius(double frt){
        double farhenheit2celsius = (frt - 32) * 5 / 9;
        return farhenheit2celsius; 
    }
    public static double convertCelsiustoFahrenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit; 
    }
    public static double convertpoundstokilograms(double pounds){
        double pounds2kilograms = 0.453592;
        double kg = pounds * pounds2kilograms;
        return kg; 
    }
    public static double  convertkilogramstopounds(double kg){
        double kilograms2pounds = 2.20462; 
        double pounds = kg * kilograms2pounds; 
        return pounds; 
    }
     public static double convertgallonstoliters(double gallons){
        double gallons2liters = 3.78541;
        double liters = gallons * gallons2liters;
        return liters; 
    }
     public static double convertliterstogallons(double liters){
        double  liters2gallons = 0.264172;
        double gallons = liters * liters2gallons;
        return gallons;
    } 
    public static double switchcase(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Unit Convertor: \n  1) Fahrenheit to Celsius\n  2) Celsius to Fahrenheit\n  3) pounds to kilograms\n  4) kilograms to pounds\n  5) gallons to liters\n  6) liters to gallons\n  7) EXIT \n\n  Enter the choice : ");
      int choice = sc.nextInt();
      if(choice == 7){
        System.out.print("Conversion Calculator successuflly Exited.\n\n ");
        return 0;
      } else{ 
        switch (choice) {
         case 1 :
            System.out.print("  Enter the value in Fahrenheit = ");
            double frt = sc.nextDouble();
            System.out.printf("  the %.2f Fahrenheit converts to %.2f Celsius.\n\n",frt,convertFahrenheittoCelsius(frt));
            break;
         case 2 :
            System.out.print("  Enter the value in Celsius = ");
            double celsius = sc.nextDouble();
            System.out.printf("  the %.2f Celsius convert to %.2f Fahrenheit.\n\n",celsius,convertCelsiustoFahrenheit(celsius));
            break;
         case 3 :
            System.out.print("  Enter the value in Pounds = ");
            double  pounds = sc.nextDouble();
            System.out.printf("  the %.2f Pounds convert to %.2f Kilograms.\n\n",pounds,convertpoundstokilograms(pounds));
            break;
         case 4 :
            System.out.print("  Enter the value in Kilograms = ");
            double  kg = sc.nextDouble();
            System.out.printf("  the %.2f Kilograms convert to %.2f Pounds.\n\n",kg,convertkilogramstopounds(kg));
            break;
         case 5 :
            System.out.printf("  Enter the value in gallons = ");
            double  gallons = sc.nextDouble();
            System.out.printf("  the %.2f Gallons convert to %.2f Liters.\n\n",gallons,convertgallonstoliters(gallons));
            break;    
         case 6 :
            System.out.printf("  Enter the value in Liters = ");
            double  Liters = sc.nextDouble();
            System.out.printf("  the %.2f Liters convert to %.2f Gallons.\n\n",Liters,convertliterstogallons(Liters));
            break;  
         default:
           System.out.printf("  Invalid Choice.\n\n");   
        }
        return switchcase();
      }
    }
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     switchcase();
     sc.close();
    }
}
