import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        System.out.println("Enter the Power :");
        int pow = sc.nextInt();
        int result=1;
        while (pow>0){
            result=result*num;
            pow--;
        }
        System.out.println(result);
    }
}
