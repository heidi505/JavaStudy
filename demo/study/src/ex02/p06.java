package ex02;
import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("드라이브 이름을 입력하세요 : ");
        String drive = (sc.nextLine()+":");
        System.out.println("디렉터리 이름 :");
        String dir = sc.nextLine();
        System.out.println("파일 이름 : ");
        String file = (sc.nextLine()+".");
        System.out.println("확장자 명 : ");
        String type = sc.nextLine();

        System.out.println("완전한 이름은 : " + drive + dir + file + type);
        sc.close();
    }
}
