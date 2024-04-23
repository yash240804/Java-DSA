import java.util.Scanner;

public class Areaofrhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float d1, d2;
        System.out.print("Enter the lenght of two diagonals ");
        d1 = in.nextFloat();
        d2 = in.nextFloat();
        System.out.println();
        System.out.println(0.5*d1*d2);
    }
}
