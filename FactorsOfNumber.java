import java.sql.SQLOutput;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Factors of a Number 'n' is number that divide the Number 'n'
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        System.out.println("The following numbers are the factors of "+num);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
