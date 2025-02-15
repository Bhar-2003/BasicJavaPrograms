import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> A leap year is a year that has an extra day,
        //    or leap day, to keep the calendar in sync with the seasons.
        // -> A year is a leap year if:
        // -> It is divisible by 4 and not divisible by 100 (e.g., 2024, 2028, 2032).
        // -> OR it is divisible by 400 (e.g., 1600, 2000).
        System.out.println("Enter the Year :");
        int year=sc.nextInt();
        if((year % 4 == 0 && year % 100 !=0)|| year % 400 == 0){
            System.out.println("The year "+year+" is a Leap Year");
        }
        else {
            System.out.println("The year "+year+" is not a Leap Year");
        }
    }
}
