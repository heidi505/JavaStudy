package ex02;

import java.util.Calendar;
import java.util.Scanner;

public class BitOperator {
    public static void main(String[] args) {
        byte status = 0b01101110;
        System.out.println("문열림 상태 = " + ((status & 0b00000100)!=0));

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = 1998;
        int m = 06 + a;
        int d = 22;

        Calendar ca = Calendar.getInstance();

        ca.set(y, m, d);

        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
        System.out.println(ca.get(Calendar.DATE));
    
        sc.close();

        }
    
}
