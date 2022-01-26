import java.util.Scanner;

class q1 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a byte value");
    byte byteValue = input.nextByte();

    System.out.println("Enter a short value");
    short shortValue = input.nextShort();

    System.out.println("Enter a int value");
    int intValue = input.nextInt();

    System.out.println("Enter a long value");
    long longValue = input.nextLong();

    System.out.println("Enter a float value");
    float floatValue = input.nextFloat();

    System.out.println("Enter a double value");
    double doubleValue = input.nextDouble();

    System.out.println("Enter a boolean value");
    boolean booleanValue = input.nextBoolean();


    System.out.println("byte value = " + byteValue);
    System.out.println("short value = " + shortValue);
    System.out.println("int value = " + intValue);
    System.out.println("long value = " + longValue);
    System.out.println("float value = " + floatValue);
    System.out.println("double value = " + doubleValue);
    System.out.println("double value = " + booleanValue);

    input.close();
    }
    
}


