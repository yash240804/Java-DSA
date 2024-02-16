import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rem, div = 0;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            div = div + (rem * rem * rem);
            n = n / 10;
        }
        if (div == temp) {
            System.out.println("The no. is Armstrong");
        } else {
            System.out.println("The no. is not armstrong");
        }
    }
}
