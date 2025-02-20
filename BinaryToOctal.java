import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //
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
                int reminder=binary_num%8;
                decimal_num+=reminder*Math.pow(2,pow);
                //decimal_num=(decimal_num+reminder)*(Math.pow(2,pow));
                binary_num=binary_num/8;
                pow++;
            }
        }
        System.out.println("Decimal Number of "+temp+" is "+decimal_num);
    }
}
