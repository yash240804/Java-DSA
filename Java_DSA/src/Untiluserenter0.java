import java.util.Scanner;

public class Untiluserenter0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int result = 0;
        while (n != 0){
             n = in.nextInt();
             result += n;
        }
        System.out.println(result);
    }
}
