import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter Operation ");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Input Your Number");
                int a = in.nextInt();
                int b = in.nextInt();
                if(ch == '+'){
                    System.out.println(a+b);
                }
                if(ch == '-'){
                    System.out.println(a-b);
                }
                if(ch == '*'){
                    System.out.println(a*b);
                }
                if(ch == '/'){
                    System.out.println(a/b);
                }
                if(ch == '%'){
                    System.out.println(a%b);
                }}
                else if(ch == 'x' || ch == 'X'){
                    break;
                }
                else{
                    System.out.println("invalid input");
                }
            }
        }
    }

