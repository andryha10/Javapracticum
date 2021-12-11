import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpStr = sc.nextLine();
        int symbsCount = 0;
        for(Character c: inpStr.toCharArray()){
            if (c.toString().matches("[+\\-*]")) {
                symbsCount ++;
            }
        }
        System.out.println("String:" + "'" + inpStr + "' contains " + symbsCount + " '+-*' symbols" );
    }
}