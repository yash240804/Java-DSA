import java.util.Scanner;

public class Electricbill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit, rate;
        System.out.print("Enter the no. of unit : ");
        unit = in.nextInt();
        System.out.println();
        System.out.print("Enter rate per unit : ");
        rate = in.nextInt();
        System.out.println();
        int bill = unit * rate;
        System.out.println("The bill is rs." + bill);
    }
}
