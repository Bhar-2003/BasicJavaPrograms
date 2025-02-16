import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> A Number where the Sum of its divisors is equal to the Number itself
        // -> Example : 6 -> 1+2+3 => 6
        // -> Example : 28 -> 1+2+4+7+14 => 28
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(temp==sum){
            System.out.println("The given "+temp+" is a Perfect Number");
        }
        else {
            System.out.println("The given "+temp+" is not a Perfect Number");
        }
    }
}
