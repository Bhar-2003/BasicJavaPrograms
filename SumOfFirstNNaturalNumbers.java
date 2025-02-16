import java.util.Scanner;
public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> The sum of all the natural numbers until the given input integer.
        // -> Formula : (n*(n+1)/2)
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum+" is the Sum of "+num+" Natural Numbers");
    }
}
