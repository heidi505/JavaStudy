package ex04;

public class NumTest {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(num1 / num2);
        System.out.println((double) num1 / (double) num2);
        double x = num1 / num2;
        System.out.println(x);
        System.out.println((int) ((double) num1 / (double) num2 * 1000));
    }
}
