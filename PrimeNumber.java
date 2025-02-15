import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Prime number is a number that is greater than 1 and divided by 1 or itself only.
        // -> Prime numbers that can  be divided by itself and 1.
        // -> For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        if(num==0 || num==1)
        {
            System.out.println("The "+num+" is neither prime nor composite number");
        }
        for(int i=2;i<=num/2;i++)//starts from 2 because smallest prime number
        {
            if(num%i==0)
            {
                System.out.println("The given Number "+num+" is not a Prime Number");
                return;
            }
        }
        System.out.println("The given Number "+num+" is a Prime Number");
    }
}
