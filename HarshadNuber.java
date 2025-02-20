import java.util.Scanner;
public class HarshadNuber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> A Harshad number is a positive integer that is divisible by the
        //    sum of its digits.
        // -> Example : 24 -> 2+4 = 6 -> 24 % 6 == 0
        System.out.println("Enter the Number :");
        int num =sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int reminder=temp%10;
            sum=sum+reminder;
            temp=temp/10;
        }
        if(num%sum==0){
            System.out.println("The given "+num+" is an Harshad Number");
        }
        else{
            System.out.println("The given "+num+" is not an Harshad Number");
        }
    }
}
