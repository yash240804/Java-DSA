import java.util.Scanner;

public class RsToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rs = in.nextInt();
        int dollar = rs / 80;
        System.out.println(rs +" rs in dollar = " + dollar);
    }
}
