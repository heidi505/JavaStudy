package ex02;
import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("받은 돈을 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("상품 가격을 입력하세요 : ");
        int b = sc.nextInt();
        int bu = b/10;
        int total = a-b;

        System.out.println("받은 돈 : " + a);
        System.out.println("상품 가격 : " + b);
        System.out.println("부가세 : " + bu);
        System.out.println("잔돈 : " + total);
        sc.close();
    }
}
