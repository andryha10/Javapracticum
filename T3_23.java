import java.util.Scanner;


public class T3_23
{
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.print("Angle A (in degrees) = ");
        final double angleA = scan.nextDouble();
        System.out.print("Angle B (in degrees) = ");
        final double angleB = scan.nextDouble();
        System.out.print("Angle C (in degrees) = ");
        final double angleC = scan.nextDouble();
        System.out.print("r (sm) = ");
        final double r = scan.nextDouble();
        final double AinRadians = angleA * 3.141592653589793 / 360.0;
        final double BinRadians = angleB * 3.141592653589793 / 360.0;
        final double CinRadians = angleC * 3.141592653589793 / 360.0;
        System.out.println(Math.pow(r, 2.0) * (1.0 / Math.tan(AinRadians) + 1.0 / Math.tan(BinRadians) + 1.0 / Math.tan(CinRadians)));
    }
}