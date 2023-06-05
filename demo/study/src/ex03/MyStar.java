package ex03;
public class MyStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { //원하는 줄의 반
            for (int k = 3; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int q = 1; q <= 2; q++) { //총 줄의 수 - 위 포문 줄
            for (int z = 0; z < q; z++) {
                System.out.print(" ");
            }
            for (int a = 3; a >= q+q-1; a--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
