import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.print(i);
            System.out.print("*");
            System.out.print(num);
            System.out.print("=");
            System.out.println(i*num);
            i++;
        }
    }
}
