import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // -> A Decimal number can be calculated by multiplying every
        //    digits of binary number with 2 to the power of the integers
        //    starts from 0 to n-1 where n refers as the total number of digits
        //    present in a binary number and finally add all of them.
        // -> Example : 11011: The binary number 11011 is equal to the decimal number 27.
        // -> 1 1 0 1 1
        //    | | | | |
        //    | | | | - 1 * 2^0 -  1
        //    | | | - - 1 * 2^1 -  2
        //    | | - - - 0 * 2^2 -  0
        //    | - - - - 1 * 2^3 -  8
        //    - - - - - 1 * 2^4 - 16
        //                      | 27 | ->  Decimal Number

        System.out.println("Enter the Number : ");
        int binary_num=sc.nextInt();
        int temp=binary_num;
        int  decimal_num=0;  // to store decimal
        int pow=0; // storing the power
        while(true){
            if(binary_num==0){
                System.out.println("The Number is not Binary.");
                break;
            }
            else{
            int reminder=binary_num%10;
            decimal_num+=reminder*Math.pow(2,pow);
            //decimal_num=(decimal_num+reminder)*(Math.pow(2,pow));
            binary_num=binary_num/10;
            pow++;
        }
        }
        System.out.println("Decimal Number of "+temp+" is "+decimal_num);
    }
}
