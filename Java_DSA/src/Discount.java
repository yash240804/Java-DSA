import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float price = in.nextInt();
        float discount = in.nextInt();
        float totaldiscount = (price * discount)/100;
        System.out.println(totaldiscount);
    }
}
