import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Long division :
        //    Divide the decimal number by 16.
        //    Note the remainder and the quotient.
        //    Use the quotient as the new decimal number and divide by 16 again.
        //    Repeat until the quotient is zero.
        //    Read the hexadecimal number by combining the remainders from bottom to top.
        // -> Hexadecimal	1	2	3	4	5	6	7	8	9	A	B	C	D	E	F
        // -> Decimal	    1	2	3	4	5	6	7	8	9	10	11	12	13	14	15

        // -> Example : 7956 to the base 10
        // -> 7956  / 16 = 497 reminder 4  - -  - - (Least Significant Bit)
        //    497   / 16 = 31 reminder  1  - - -  |
        //    31    / 16 = 1 reminder   15 - -  | |
        //    1     / 16 = 0 reminder   1  | |  | | (Most Significant Bit)
        //                                 | |  | |
        //    MSB -> LSB                   1 15 1 4  = 1F14 to the base 16
        int decimal_num=sc.nextInt();
        char[] hexadecimal_char =new char[100];
        int i=0;
        while(decimal_num>0){
            int reminder=decimal_num%16;
            if(reminder<10){
                hexadecimal_char[i]=(char)(reminder+48);
                i++;
            }
            // else positional values : A - F
            // rem value will be > 10, adding 55 will result : A - F
            // ascii A : 65, B : 66 ..... F : 70
            else{
                hexadecimal_char[i]=(char)(reminder+55);
                i++;
            }
           decimal_num=decimal_num/16;
        }
        System.out.println("Hexadecimal Number is :");
        for(int j=i-1;j >= 0;j--){
            System.out.print(hexadecimal_char[j]+" ");
        }
    }
}
