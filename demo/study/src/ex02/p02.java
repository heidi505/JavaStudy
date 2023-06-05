package ex02;
import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("마일을 입력하세요 : ");
        double a = sc.nextDouble();
        double b = a * 1.609;
        System.out.println(a + " 마일은 " + b + " 킬로미터 입니다.");
        sc.close();
    }
    
}
