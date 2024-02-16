import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
