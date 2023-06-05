package ex04;

public class Walking {
    double CalculateCalory(int walk) {
        return 0.02 * walk;
    }

    public static void main(String[] args) {
        Walking result = new Walking();
        double b = result.CalculateCalory(5000);
        System.out.println("소모된 칼로리 량:" + b);
    }
}