import java.util.Scanner;
public class QuadrantsCoordinateLies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> Java program to find out the quadrant in which the given co-ordinate lie
        // Quadrant - 1 -> +x,+y
        // Quadrant - 2 -> -x,+y
        // Quadrant - 3 -> -x,-y
        // Quadrant - 4 -> +x,-y
        // Origin =(0,0)
        //  x!=0 and y=0 y-axis
        //  x=0 and y!=0 x-axis
        System.out.println("Enter the value of X :");
        int x_axis=sc.nextInt();
        System.out.println("Enter the value of Y :");
        int y_axis=sc.nextInt();
        if(x_axis>0 && y_axis>0)
        {
            System.out.println("Quadrant I");
        }
        else if (x_axis<0 && y_axis>0) {
            System.out.println("Quadrant II");
        }
        else if (x_axis<0 && y_axis<0) {
            System.out.println("Quadrant III");
        }
        else if (x_axis>0 && y_axis<0) {
            System.out.println("Quadrant IV");
        }
        else if (x_axis==0 && y_axis==0) {
            System.out.println("Origin");
        }
        else if (x_axis!=0 && y_axis==0) {
            System.out.println("y-axis");
        }
        else
        {
            System.out.println("x-axis");
        }
    }
}
