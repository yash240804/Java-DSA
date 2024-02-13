import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
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

