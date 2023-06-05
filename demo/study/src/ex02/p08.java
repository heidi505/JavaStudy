package ex02;
import java.util.Scanner;

public class p08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구의 반지름을 입력하세요 : ");
        double a = sc.nextDouble();

        double b = (4.0/3.0) * (a*a*a);
        System.out.println("구의 부피 : " + b + "파이");
        sc.close();
    }
}
