import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> A Number divisible by 2 is EVEN NUMBER
        // -> A Number not divisible by 2 is ODD NUMBER
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is an Even Number");
        }
        else {
            System.out.println(num+" is an Odd Number");
        }
    }
}
