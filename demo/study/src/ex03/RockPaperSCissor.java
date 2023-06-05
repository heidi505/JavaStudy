package ex03;
import java.util.Scanner;

public class RockPaperSCissor {
    final int a = 1;
    final int b = 2;
    final int c = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3)");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3) + 1;
        if (user == computer) {
            System.out.println("비겼습니다.");
        } else if (user == (computer + 1) % 3) {
            System.out.println("상대방" + computer +"당신이 이겼습니다.");
        } else {
            System.out.println("상대방" + computer +"당신이 졌습니다.");
        }
        sc.close();
    }

}