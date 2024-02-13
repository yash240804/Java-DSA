import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int search = 3;
        int count = 0;
        while (n > 0)
        {
            int rem = n % 10;
            n = n / 10;
            if (rem == search){
                count++;
            }

        }
        System.out.println(count);
    }
}
