import java.util.Scanner;

public class Temperture {
    public static void main(String[] args) {
        System.out.println("Enter the temp. in C");
        Scanner input = new Scanner(System.in);
        Float tempC = input.nextFloat();
        Float tempF = (tempC * 9/5) + 32;
        System.out.println("The temp. in F is " + tempF);
    }
}
