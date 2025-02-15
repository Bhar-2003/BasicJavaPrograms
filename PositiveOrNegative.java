import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Zero is neither Positive Number Nor Negative Number
        // -> A Number that is greater than Zero is Positive Number
        // -> A Number that is lesser than Zero is Negative NUmber
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        if(num==0) {
            System.out.println("Zero is neither Positive Number Nor Negative Number");
        }
        else if (num>0) {
            System.out.println("The given "+num+" is a Positive Number");
        }
        else{
            System.out.println("The given "+num+" is a Negative Number");
        }
    }
}
