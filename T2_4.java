import java.util.Scanner;

public class T2_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите градусы по ÷ельсию: ");
        float C = in.nextFloat();
        float F = 9*C/5 + 32;
        System.out.printf("F = %.2f", F);
        in.close();
    }
}