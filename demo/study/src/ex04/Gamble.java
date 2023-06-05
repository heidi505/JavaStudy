package ex04;

public class Gamble {
    public static int dice() {
        int x = (int) (Math.random() * 5) + 1;
        return x;
    }

    public static double exchange(double dollar) {
        double won = dollar * 1082.25108;
        return won;
    }

    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액:$%.2f(%.0f)원", dollar, won);

    }
}
