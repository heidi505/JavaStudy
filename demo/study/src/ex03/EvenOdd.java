package ex03;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("짝수입니다");
        } else if (number == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        sc.close();
    }
}
