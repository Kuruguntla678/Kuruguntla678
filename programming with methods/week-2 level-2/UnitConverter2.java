
import java.util.Scanner;

public class UnitConverter2 {
    public static double convertYardstoFeet(double yards){
        double  yards2feet = 3;
        double feet = yards * yards2feet;
        return feet; 
    }
    public static double convertFeettoYards(double feet){
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        return yards; 
    }
    public static double convertMeterstoInches(double meters){
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        return inches; 
    }
    public static double convertInchestoMeters(double inches){
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        return meters; 
    }
     public static double convertInchestoCM(double inches){
        double inches2cm = 2.54;
        double CM = inches * inches2cm;
        return CM; 
    }
    public static double switchcase(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Unit Convertor: \n  1) Yards to Feet\n  2) Feet to Yards\n  3) Meters to Inches\n  4) Inches to Meters\n  5) Inches to CM\n  6) EXIT \n\n  Enter the choice : ");
      int choice = sc.nextInt();
      if(choice == 6){
        System.out.print("Conversion Calculator successuflly Exited.\n\n ");
        return 0;
      } else{ 
        switch (choice) {
         case 1 :
            System.out.print("  Enter the value in Yards = ");
            double yards = sc.nextDouble();
            System.out.printf("  the %.2f Yards convert to %.2f Feet.\n\n",yards,convertYardstoFeet(yards));
            break;
         case 2 :
            System.out.print("  Enter the value in Feet = ");
            double feet = sc.nextDouble();
            System.out.printf("  the %.2f Feet convert to %.2f Yards.\n\n",feet,convertFeettoYards(feet));
            break;
         case 3 :
            System.out.print("  Enter the value in meters = ");
            double  meters = sc.nextDouble();
            System.out.printf("  the %.2f meters convert to %.2f Inches.\n\n",meters,convertMeterstoInches(meters));
            break;
         case 4 :
            System.out.print("  Enter the value in Inches = ");
            double  inches = sc.nextDouble();
            System.out.printf("  the %.2f Inches convert to %.2f Meters.\n\n",inches,convertInchestoMeters(inches));
            break;
         case 5 :
            System.out.print("  Enter the value in Inches = ");
            double  Inches = sc.nextDouble();
            System.out.printf("  the %.2f Inches convert to %.2f CM.\n\n",Inches,convertInchestoCM(Inches));
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
