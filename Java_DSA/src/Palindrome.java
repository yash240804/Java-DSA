import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = in.nextInt();
        System.out.println();
        int rem, div = 0;
        int temp = n;
        while(n > 0){
            rem = n % 10;
            div = div * 10 + rem;
            n = n / 10;
        }
        if (div == temp){
            System.out.println("The entered no. is palindrome");
        }else {
            System.out.println("The entered no. is not palindrome");
        }
    }
}
