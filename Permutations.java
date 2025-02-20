import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> The term permutation refers to a mathematical
        //    calculation of the number of ways a particular set can be arranged.
        //   Use permutation formula { factorial(n) / factorial(n-r) }
        //   PROBLEM STATEMENT :
        // -> In a classroom some of the seats are already occupied by students and
        //    only a few seats are available in the classroom. The available seats are
        //    assumed as r and n number of students are looking for the seat. We need
        //    to find in how many different permutations n number of students can sit on
        //    r number of chairs.
        System.out.println("Enter the Number of Students :");
        int students= sc.nextInt();
        System.out.println("Enter the NUmber of Seats :");
        int seats=sc.nextInt();
        int fact1=1;
        for(int i=students;i>1;i--){
            fact1=fact1*i;
        }
        int num=students-seats;
        int fact2=1;
        for (int i=num;i>1;i--){
            fact2=fact2*i;
        }
        int permutation =fact1/fact2;
        System.out.println(permutation+" ways");
    }
}