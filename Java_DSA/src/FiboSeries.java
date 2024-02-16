import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of element you want in fib series : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = b;
            b = b + a;
            a = temp;
        }
    }
}
