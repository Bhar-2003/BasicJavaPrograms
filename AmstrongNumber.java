import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> An Armstrong number is a positive m-digit number
        //    that is equal to the sum of the mth powers of their digits.
        // -> It is also known as PLUPERFECT, or PLUS PERFECT, or NARSISSISTIC Number.
        // -> Example : 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num;
        int sum=0,count=0,reminder;

        while(temp>0){// To know that how many times we have to iterate the given Number
            count++;
            temp=temp/10;
        }
        temp=num;
        while(temp>0){
            reminder=temp%10; // gives one digit Ex :123%10=3
            sum=sum+(int)(Math.pow(reminder,count));// Pre-defined Math class and pow method
            temp=temp/10;// decreases one digit Ex : 123/10=12
        }
        if(num==sum){
            System.out.println("The given "+num+" is an Amstrong Number");
        }
        else{
            System.out.println("The given "+num+" is not an Amstrong Number");
        }
    }
}
