import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            int ch = in.nextInt();
            if (ch == 'x' || ch == 'X'){
                break;
            }else{
                ans += ch;
            }
        }System.out.println(ans);
    }
}
