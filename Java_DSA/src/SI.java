import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int r = in.nextInt();
        int t = in.nextInt();
        int si = p*t*r/100;
        System.out.println("The SI is "+si);
    }
}
