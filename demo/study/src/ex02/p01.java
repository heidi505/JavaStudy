package ex02;
import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("오랜지 갯수를 입력하세요 : ");
        int a = sc.nextInt();
        int b = a/10;
        int c = a%10;
        System.out.println(b + "박스가 사용되며" + c + "개가 남습니다.");
        sc.close();
    }
}
