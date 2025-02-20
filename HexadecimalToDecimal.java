import java.util.Locale;
import java.util.Scanner;
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> To convert a hexadecimal number to decimal, each digit is multiplied by
        //    the corresponding power of 16 and then the products are added together.
        // -> Hexadecimal	1	2	3	4	5	6	7	8	9	A	B	C	D	E	F
        // -> Decimal	    1	2	3	4	5	6	7	8	9	10	11	12	13	14	15
        String hexadecimal_value=sc.nextLine();
        String digits ="123456789ABCDEF";
        hexadecimal_value=hexadecimal_value.toUpperCase();
        int val=0;
        for(int i=0;i<hexadecimal_value.length();i++){
            char character=hexadecimal_value.charAt(i);
            int search=digits.indexOf(character);
            val=(16*val)+search;
            val++;
        }
        System.out.println("Decimal Number of "+hexadecimal_value+" is "+val);
    }
}
