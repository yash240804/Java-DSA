import java.util.Scanner;

public class Avgofn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float avg = 0;
        for (int i = 0; i <= n; i++) {
            avg += i;
        }
        avg = avg / n;
        System.out.println("The avg = " + avg);
    }
}
