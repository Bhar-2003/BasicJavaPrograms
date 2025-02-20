import java.util.Scanner;
public class FriendlyPairNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // -> The numbers whose ( sum of divisors ) / number
        //    is same are known as Friendly Pair Numbers.
        // -> Example : 6,28
        System.out.println("Enter the number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2 :");
        int num2=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                sum1=sum1+i;
            }
        }
        for(int j=1;j<num2;j++){
            if(num2%j==0){
                sum2=sum2+j;
            }
        }
        if((sum1/num1) == (sum2/num2)){
            System.out.println("The given "+num1+" & "+num2+" are Friendly-Pair");
        }
        else {
            System.out.println("The given "+num1+" & "+num2+" are not Friendly-Pair");
        }
    }
}
