import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> 2363 => 3632
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num;
        int reverse=0;
        while (num>0){
            int reminder=num%10;
            reverse=(reverse*10)+reminder;
            num=num/10;
        }
        System.out.println(reverse+" is the Reverse of "+temp);
    }
}
