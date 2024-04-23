import java.util.Scanner;

public class Volumeofpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b, h;
        b = in.nextFloat();
        h = in.nextFloat();
        System.out.println((1/3.0)*b*h);
    }
}
