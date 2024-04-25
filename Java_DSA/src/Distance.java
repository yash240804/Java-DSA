import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter co-ordinate of two points ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        float result = (x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1);
        double distance = Math.sqrt(result);
        System.out.println(distance);

    }
}
