package ex02;
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.println("첫번째 숫자를 입력" );
        x = sc.nextInt();

        System.out.println("두번째 숫자를 입력" );
        y = sc.nextInt();

        sum = x+y;
        System.out.println(sum);
        sc.close();
    }
}
