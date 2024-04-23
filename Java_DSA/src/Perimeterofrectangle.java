import java.util.Scanner;

public class Perimeterofrectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b, a;
        b = in.nextFloat();
        a = in.nextFloat();
        System.out.println(2*(b + a));
    }
}
