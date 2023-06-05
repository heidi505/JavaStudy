package ex04;

class cal01 {
    int height = 160;

    void add() {
        height = height + 10;
    }
}

public class Method01 {
    public static void main(String[] args) {
        cal01 c1 = new cal01();
        c1.add();
    }

}
