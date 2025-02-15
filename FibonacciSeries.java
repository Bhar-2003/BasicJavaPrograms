import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {

        // ->The Fibonacci sequence is a series of numbers
        //   where each number is the sum of the previous two numbers.
        // ->It usually starting with 0 and 1.
        // ->The sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.
        Scanner sc=new Scanner(System.in);
        int num1=0;//initializing Number 1
        int num2=1;//initializing Number 2
        System.out.println("Enter the Range :");
        int n= sc.nextInt();//
        int num3;
        System.out.print(num1+" "+num2);//Printing two Numbers

        for(int i=2;i<n;i++){
            num3=num1+num2;//Adding previous two numbers
            System.out.print(" "+num3);
            num1=num2;//swapping Number 2 to Number 1
            num2=num3;//swapping Number 3 to Number 2

        }

    }
}
