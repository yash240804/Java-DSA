import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("The Entered Year Is Leap Year");
        }else {
            System.out.println("The Entered Year Is Not Leap Year");
        }
    }
}
