import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> The factorial of a non-negative integer n is the
        //    product of all positive integers less than or equal to n
        // -> Formula : n! = n * (n-1) * (n-2) * ... * 2 * 1
        // -> Example : 4! = 4 * 3 * 2 * 1 = 24
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
