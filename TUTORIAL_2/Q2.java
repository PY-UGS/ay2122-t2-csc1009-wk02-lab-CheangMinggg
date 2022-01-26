import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter three number: ");

    double x = in.nextDouble();
    double y = in.nextDouble();
    double z = in.nextDouble();

    double averagexyz = ((x + y + z)/3);

    System.out.printf("The average of %.2f, %.2f, %.2f is %f ", x, y, z, averagexyz);
    in.close();

    }
    
}
