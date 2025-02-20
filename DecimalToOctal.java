import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // ->  divide the decimal by 8 until the quotient is less than 8.
        //     Then, write down the remainders in reverse order.
        // -> Example : 1264 to the base 10
        // -> 1264  / 8 = 158 reminder 0 - - - - (Least Significant Bit)
        //    158   / 8 = 19 reminder  6 - - - |
        //    19    / 8 = 2 reminder   3 - - | |
        //    2     / 8 = 0 reminder   2 | | | | (Most Significant Bit)
        //                               | | | |
        //    MSB -> LSB                 2 3 6 0   = 2360 to the base 8
        System.out.println("Enter the Number :");
        int decimal_num=sc.nextInt();
        int octal_num[]= new int[20];
        int i=0;
        while (decimal_num>0){
            int reminder = decimal_num % 8;
            octal_num[i++]=reminder;
            decimal_num=decimal_num/8;
        }
        System.out.println("Octal Number is :");
        for(int j=i-1;j>=0;j--){
            System.out.print(octal_num[j]+" ");
        }
    }
}
