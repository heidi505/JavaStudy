package ex04;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);

    }

    public static void printPay(double basePay, int hours) {

        if (basePay < 8.00) {
            System.out.println("기본시급 에러");
            return;
        }
        if (60 < hours) {
            System.out.println("초과 근무시간 에러");
            return;
        }

        double pay = 0.0;
        if (0 <= hours && hours <= 40) {
            pay = basePay * hours;
        } else if (40 < hours && hours <= 60) {
            pay = (40 * basePay) + (hours - 40) * (basePay * 1.5);
        }
        System.out.printf("$ %.2f\n", pay);

    }
}