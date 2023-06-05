package ex03;
public class Coin { //배열과 포문으로 줄여보기 4줄로 끝내게끔.
    public static void main(String[] args) {//final변수 변경 불가능
        final int money = 1200000500; //Scanner로 수정하기
        //500, 100, 50, 10(개수를 최소로 해 주세요) 즉 큰 수부터 주기

        int restMoney = money; //숫자를 바꿀변수
        int count; //동전 개수를 담을 변수

        int tempMoney;
        tempMoney = 500;
        count = restMoney/tempMoney; // 5
        System.out.println("500원 : " + count);
        restMoney = restMoney % 500;

        tempMoney = 100;
        count = restMoney/tempMoney; // 5
        System.out.println("100원 : " + count);
        restMoney = restMoney % 100;

        tempMoney = 50;
        count = restMoney/tempMoney; // 5
        System.out.println("100원 : " + count);
        restMoney = restMoney % 100;

        tempMoney = 10;
        count = restMoney/tempMoney; // 5
        System.out.println("100원 : " + count);
        restMoney = restMoney % 100;

    }
    
}
