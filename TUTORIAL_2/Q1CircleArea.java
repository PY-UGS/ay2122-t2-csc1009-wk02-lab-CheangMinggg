import java.util.Scanner;


public class Q1CircleArea {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number for the radius: ");
        Scanner input = new Scanner(System.in);
        
        double radius1 = input.nextDouble();

        Q1Circle circle1 = new Q1Circle(radius1);

        System.out.printf("The area for the circle of radius %.2f is %f" ,circle1.radius, circle1.getArea());

        input.close();
    }
}


class Q1Circle {
    
    double radius;

    Q1Circle() {   
        radius = 1;   
    }   
       
    Q1Circle (double newRadius) {   
        radius = newRadius;   
    }   
       
    double getArea() {   
        return radius * radius * Math.PI;   
    }   
}
