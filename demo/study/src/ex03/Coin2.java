package ex03;
import java.util.Scanner;

public class Coin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int money = sc.nextInt(); //Scanner로 수정하기
        //500, 100, 50, 10(개수를 최소로 해 주세요) 즉 큰 수부터 주기
        int restMoney = money; //숫자를 바꿀변수
        int count; //동전 개수를 담을 변수
        int[] coin = {500, 100, 50, 10};
        int tempMoney;

        for(int i = 0; i < coin.length; i++){
            tempMoney = coin[i];
        count = restMoney/tempMoney; // 5
        System.out.println(coin[i]+ "원 : " + count);
        restMoney = restMoney % coin[i];
        }
        sc.close();
    }
    
}