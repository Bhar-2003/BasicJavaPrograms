import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Divide the decimal number by 2 and get the quotient
        //    for the next iteration and continuously store the remainder value in an
        //    array in reverse order till the decimal number is greater than 0.
        // -> Example : 12
        //
        // -> 12 / 2 = 6 reminder 0 - - - - (Least Significant Bit)
        //    6  / 2 = 3 reminder 0 - - - |
        //    3  / 2 = 1 reminder 1 - - | |
        //    1  / 2 = 0 reminder 1 | | | | (Most Significant Bit)
        //                          | | | |
        //    MSB -> LSB            1 1 0 0  = 12
        int decimal_num=sc.nextInt();
        int temp=decimal_num;
        int binary[] = new int[20];
        int i=0;
        while(decimal_num>0){
            int reminder= decimal_num % 2;
            binary[i++]=reminder;
            decimal_num=decimal_num/2;
        }
        System.out.println("Binary Number of "+temp+" is :");
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]+" ");
        }
    }
}
