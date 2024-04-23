import java.util.Scanner;

public class CSAofcylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float h, r;
        h = in.nextFloat();
        r = in.nextFloat();
        System.out.println(2*3.141*r*h);
    }
}
