package ex04;

class Box {
    double width;
    double length;
    double height;

    double getVolume() {
        double volume = width * length * height;
        return volume;
    }
}

public class MakingBox {
    public static void main(String[] args) {

        Box result = new Box();
        result.width = 20;
        result.length = 20;
        result.height = 30;
        double b = result.getVolume();

        System.out.println("상자의 가로, 세로, 높이는" + result.width + "," + result.length + "," + result.height + "입니다.");
        System.out.println("상자의 부피는" + b + "입니다.");

    }
}