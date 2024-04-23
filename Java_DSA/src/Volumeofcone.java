import java.util.Scanner;

public class Volumeofcone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float h, r;
        h = in.nextFloat();
        r = in.nextFloat();
        System.out.println((1/3.0)*3.141*h*r*r);
    }
}
