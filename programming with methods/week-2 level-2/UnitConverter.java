
import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double KM){
        double km2miles = 0.621371;
        double miles = KM * km2miles;
        return miles; 
    }
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        double KM = miles * miles2km;
        return KM; 
    }
    public static double convertMeterstoFeet(double meters){
        double meters2feet = 3.28084;
        double Feet = meters * meters2feet;
        return Feet; 
    }
     public static double convertFeettoMeters(double feet){
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        return meters; 
    }
    public static double switchcase(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Unit Convertor: \n  1) KM to Miles\n  2) Miles to KM\n  3) Meters to Feet\n  4) Feet to Meters\n  5) Exit \n\n  Enter the choice : ");
      int choice = sc.nextInt();
      if(choice == 5){
        System.out.print("Conversion Calculator successuflly Exited.\n\n ");
        return 0;
      } else{ 
        switch (choice) {
         case 1 :
            System.out.print("  Enter the value in KM = ");
            double KM = sc.nextDouble();
            System.out.printf("  the %.2f KM convert to %.2f miles.\n\n",KM,convertKmToMiles(KM));
            break;
         case 2 :
            System.out.print("  Enter the value in Miles = ");
            double miles = sc.nextDouble();
            System.out.printf("  the %.2f miles convert to %.2f KM.\n\n",miles,convertMilesToKm(miles));
            break;
         case 3 :
            System.out.print("  Enter the value in meters = ");
            double  meters = sc.nextDouble();
            System.out.printf("  the %.2f meters convert to %.2f Feet.\n\n",meters,convertMeterstoFeet(meters));
            break;
         case 4 :
            System.out.print("  Enter the value in Feet = ");
            double  feet = sc.nextDouble();
            System.out.printf("  the %.2f Feet convert to %.2f meters.\n\n",feet,convertFeettoMeters(feet));
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
