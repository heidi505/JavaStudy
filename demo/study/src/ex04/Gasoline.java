package ex04;

public class Gasoline {
    public static double calcEfficiency(double fuel, double distance) {
        return distance / fuel;
    }

    public static void main(String[] args) {
        Gasoline result = new Gasoline();
        double efficiency = result.calcEfficiency(8.86, 182.736);
        System.out.printf("연비: %.2f km/L", efficiency);
    }
}
