import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if ('a'<= ch && 'z'>=ch)
        {
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }
    }
}
