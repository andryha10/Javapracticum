import java.util.Scanner;

public class T4_2_b
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        final double x = sc.nextDouble();
        System.out.print("y = ");
        final double y = sc.nextDouble();
        System.out.println( x + y + Math.pow(x, 2.0) + Math.pow(y, 2.0) + Math.pow(x, 3.0) + Math.pow(y, 3.0) + Math.pow(x, 4.0) + Math.pow(y, 3.0));
    }
}
