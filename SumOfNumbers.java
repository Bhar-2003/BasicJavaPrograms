import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Sum of Numbers in given Range
        // -> Formula : num2*(num2+1)/2 - num1*(num1+1)/2 + num1
        System.out.println("Enter the 1st Number :");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int num2=sc.nextInt();
        int sum=0;
        for (int i=num1;i<=num2;i++){
            sum=sum+i;
        }
        System.out.println(sum+" is the Sum of Numbers in terms of the given Range");
    }
}
