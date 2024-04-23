import java.util.Scanner;

public class Subproandsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rem, r1 = 1, r2 = 0, result;
        while (n > 0){
             rem = n % 10;
             r1 *= rem;
             r2 += rem;
             n = n/10;
        }
        result = r1 - r2;
        System.out.println(result);
    }
}
