import java.util.Scanner;
public class MaxNumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //
        // -> For the first person, there will be N-1 people to shake hands with
        // -> For second person, there will be N -1 people available but as he has already shaken hands with the first person, there will be N-1-1 = N-2 shake-hands
        // -> For third person, there will be N-1-1-1 = N-3, and So On…

        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int total=num*(num-1)/2; // Combination nC2
        System.out.println(total+" number of handshakes can be made by "+num);
    }
}
