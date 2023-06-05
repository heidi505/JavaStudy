package ex02;
import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도 입력은 1, 섭씨온도 입력은 2 를 입력하세요");
        int a = sc.nextInt();

        if(a == 1){
            System.out.println("화씨 온도를 입력하세요.");
            double ff = sc.nextDouble();
            double b = ((double)5/9) * (ff-32);
            System.out.println("섭씨 온도는 : " + b);
        }else if(a == 2){
            double cc = sc.nextDouble();
            double c = cc / ((double)5/9) + 32;
            System.out.println("화씨 온도는 : " + c);
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
        sc.close();
    }
    
}
