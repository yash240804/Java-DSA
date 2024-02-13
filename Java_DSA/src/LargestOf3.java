import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        System.out.println("Enter Three Nos. ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
           max = c;
        }
        System.out.println(max);
    }
}
