import java.util.Scanner;

public class Largestof2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int max = Math.max(a, b);
        System.out.println(max);
    }
}
