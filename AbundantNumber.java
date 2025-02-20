import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> An abundant number is a positive integer where the sum of its
        //    proper divisors is greater than the number itself.
        // -> Example : 12 -> (1,2,3,4,6) -> (1+2+3+4+6) = 16
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum>num){
            System.out.println("The given "+num+" is an Abundant Number");
        }
        else {
            System.out.println("The given "+num+" is not an Abundant Number");
        }
    }
}
