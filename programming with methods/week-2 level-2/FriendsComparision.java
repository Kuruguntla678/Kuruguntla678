
import java.util.Scanner;

public class FriendsComparision{
    public static int heightcomparision(int[] height){
       int maxIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }        
    public static int agecomparision(int[] age ) {
        int minIndex = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3],height = new int[3];
        String[] names = {"Amar","Akbar","Anthony"};
        for (int i = 0; i < 3; i++){
            System.out.print("Enter the details of friend " + names[i] +" : \n    Enter the age : ");
            age[i] = sc.nextInt();
            System.out.print("    Enter the Height (in C.M) : ");
            height[i] = sc.nextInt();
        }
        int hindex = heightcomparision(height);
        int aindex = agecomparision(age);
        System.out.println("tallest friend is " + names[hindex] + " with " + height[hindex] + " cm.");
        System.out.println("youngest friend is " + names[aindex] + " with " + age[aindex] + " years.");    
    }
}

