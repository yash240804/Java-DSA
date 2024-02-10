import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int income = in.nextInt();
        if (income >= 20000){
            System.out.println("You income with bonus is " + (income+2000));
        }
        else{
            System.out.println("You income with bonus is " + (income+1000));
        }
    }
}
