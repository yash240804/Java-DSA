import java.util.Scanner;

public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float h, r;
        h = in.nextFloat();
        r = in.nextFloat();
        System.out.println(3.141*h*r*r);
}
}
