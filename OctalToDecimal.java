import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> An octal number is a number written in the base-8 numeral system,
        //    which uses the digits 0 to 7
        // ->  multiply each digit of the octal number by 8 raised to the power of its
        //     position, and then add the results.
        // -> Example :
        // -> 1 6 4 7 5
        //    | | | | |
        //    | | | | - 5 * 8^0 -  1         -     1
        //    | | | - - 7 * 8^1 -  8 * 7     -    56
        //    | | - - - 4 * 8^2 -  4 * 64    -   256
        //    | - - - - 6 * 8^3 -  6 * 512   -  3072
        //    - - - - - 1 * 8^4 -  1 * 4096  -  4096
        //
        //                                    | 7485 | ->  Decimal Number of base 10
        System.out.println("Enter the Number :");
        int octal_num=sc.nextInt();
        int temp=octal_num;
        int decimal_num=0;
        int pow=0;
        while (octal_num>0){
            int reminder=octal_num%10;
            decimal_num+=reminder*Math.pow(8,pow);
            octal_num=octal_num/10;
            pow++;
        }
        System.out.println("Decimal Number of "+temp+" is "+decimal_num);
    }
}
