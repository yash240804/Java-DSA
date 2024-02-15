import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int hcf = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
        System.out.println((num1*num2)/hcf);


    }
}
