import java.util.Scanner;
public class HCFOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> It is the highest number that completely divides two or more numbers.
        // -> Highest Common Factor or Greatest Common Divisor
        // -> Example : 12 and 8
        // -> Factors of 12: 1, 2, 3, 4, 6, 12
        // -> Factors of 8: 1, 2, 4, 8
        // -> Common Factors: 1, 2, 4
        // -> Greatest Common Factor : 4
        //
        System.out.println("Enter number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2=sc.nextInt();
        int hcf=0;
        for(int i=1;i<=num1 || i<=num2;i++){
            if(num1%i==0 && num2%i==0) // this is an feature that in if condition there is
                hcf=i;                 // only one statemnt no need of (curly braces){}
        }
        System.out.println(hcf+" is the HCF of "+num1+" & "+num2);
    }
}
