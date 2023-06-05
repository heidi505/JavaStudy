package ex02;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("물제의 무게를 입력하세요 : ");
        double a = sc.nextDouble();
        System.out.println("물체의 속도를 입력하세요 : ");
        double b = sc.nextDouble();
        double c = 0.5 * a * b * b;
        System.out.println("물체는 " + c + "(줄)의 에너지를 가지고 있다.");
        sc.close();
    }
}
