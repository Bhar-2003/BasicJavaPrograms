import java.util.Scanner;
public class PerfectSquareOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> A Perfect square is a number that can be expressed as the product of an integer
        //    by itself or as the second exponent of an integer.
        // -> Exaample : floor(sqrt(num)==ceil(sqrt(num))
        System.out.println("Enter the Number :");
        int num=sc.nextInt();

        if ( ( Math.floor ( Math.sqrt(num))) == ( Math.ceil ( Math.sqrt (num))) ) {
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not a Perfect Square");
        }
    }
}
