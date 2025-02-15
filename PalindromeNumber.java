import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> A palindrome Number  is a sequence of digits that
        //    reads the same backward as forward.
        // -> For Example : (forward)12321 -> 12321(reverse)
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num;
        int reminder;
        int sum=0;
        while(num>0){//we don't no how many times the loop executes.So,while loop
            reminder=num%10;
            sum=(sum*10)+reminder;
            num=num/10;
        }
        if(temp==sum) {
            System.out.println("The given "+sum+" is an Palindrome Number");
        }
        else {
            System.out.println("The given "+sum+" is not an Palindrome Number");
        }
    }
}
