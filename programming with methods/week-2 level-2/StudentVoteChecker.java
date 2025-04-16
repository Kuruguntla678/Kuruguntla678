
import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nEnter the age of the student of %d: ",i+1);
            age[i] = sc.nextInt();
            canStudentVote(age[i]);
            if (canStudentVote(age[i]) == true){
                System.out.printf("The Student %d is eligible to Vote.\n",i+1);
            }else{
                System.out.printf("The Student %d is Not eligible to Vote.\n",i+1);
            }  
        }
        System.out.print("\n");
        for ( int i = 0; i < 10; i++) {
            canStudentVote(age[i]);
            if (canStudentVote(age[i]) == true){
                System.out.printf("The Student %d is eligible to Vote.\n",i+1);
            }else{
                System.out.printf("The Student %d is Not eligible to Vote.\n",i+1);
            }  
        }
    }
}