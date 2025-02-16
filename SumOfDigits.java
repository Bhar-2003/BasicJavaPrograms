import java .util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Sum of the given Digits
        // -> Example : 1234 -> 1+2+3+4 = 10
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int reminder=num%10;
            sum=sum+reminder;
            num=num/10;
        }
        System.out.println(sum+" is the Sum of Digits");
    }
}
