package ex02;
import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("두 수의 합 : " + (x+y));
        System.out.println("두 수의 차 : " + (x-y));
        System.out.println("두 수의 곱 : " + (x*y));
        System.out.println("두 수의 평균 : " + ((double)(x+y)/2));
        int big = 0;
        int small = 0;
        big = (x>y)? x : y;
        small = (x<y)? x : y;
        System.out.println("큰 수 : " + big);
        System.out.println("작은 수 : " + small);
        sc.close();
    }
    
}
