package ex01;

import java.util.Scanner;

public class Var03 {
    public static void main(String[] args) {
        //업 캐스팅, 묵시적 형변환
        int n1 = 10;
        double d1 = n1;
        System.out.println(d1);

        //다운 캐스팅, 명시적 형변환
        double d2 = 10.5;
        int n2 = (int)d2;
        System.out.println(n2);

        //문자형변환
        char ch = 65;
        System.out.println(ch);

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        System.out.println(a);
        sc.close();
    }
}
