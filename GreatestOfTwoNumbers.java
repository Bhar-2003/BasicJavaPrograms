import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("Number 1 "+num1+" is Greater");
        }
        else {
            System.out.println("Number 2 "+num2+" is Greater");
        }
    }
}
