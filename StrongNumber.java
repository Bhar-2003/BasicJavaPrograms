import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> The sum of Factorial of each digit of the number
        //    must be equal to the number itself.
        // -> Example : 145 -> 1!+4!+5! -> 1+24+120 -> 145
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int temp=num,sum=0;;
        while(temp>0){
            int reminder=temp%10;
            int fact=1;// important step
            for(int i=1;i<=reminder;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("The given "+num+" is a Strong Number");
        }
        else {
            System.out.println("The given "+num+" is not a Strong Number");
        }
    }
}
