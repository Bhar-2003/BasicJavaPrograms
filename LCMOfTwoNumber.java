import java.util.Scanner;
public class LCMOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> The least common multiple (LCM) is the smallest number
        //    that is a multiple of two or more numbers
        // -> Least Common Multiple or Least Common Divisor
        // -> Example : LCM of 4 and 6 is 12
        System.out.println("Enter the Number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the Number 2 :");
        int num2=sc.nextInt();
        int lcm=0;
        int max=(( num1 > num2 ) ? num1 : num2);
        for(int i=max;i<=num1*num2;i++){
            if( i % num1 == 0 && i % num2 == 0 ){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm+" is the LCM of "+num1+" & "+num2);
    }
}
