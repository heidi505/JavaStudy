package ex04;


class Account {
    //입금(입금할 금액, 계좌 잔액)
    int deposit(int amount, int money){
        int restMoney = money + amount;
        return restMoney; 
    }// 메서드를 호출한 라인으로 값 반환

    //출금 (출금할 금액 300, 계좌 잔액)
    int withdraw(int amount, int money){
        int restMoney = money - amount;
        return restMoney;
    }

    // 이체 (보낼 금액, 받는 사람 잔액h, 보내는 사람 잔액i)
    


}
public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액 
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;

        //홍길동이 입금을 2번하고, 출금을 1번 하기
        Account hAccount = new Account();
        hAccount.deposit(100, hMoney); //=>line 5로 점프해서 계산을 실행하고 복귀
        hMoney = hAccount.deposit(100, hMoney);
        System.out.println("남은 금액:"+hMoney);
        hAccount.withdraw(300, hMoney);
        hMoney = hAccount.withdraw(300, hMoney);
        System.out.println("남은금액:"+ hMoney);

        //임꺽정이 입금을 1번(100원)하고, 출금 2번(300,500)하기
        Account iAccount = new Account();
        iAccount.deposit(100, iMoney);
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("남은 금액:" + iMoney);
        iAccount.withdraw(300, iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("남은 금액:"+iMoney);
        iAccount.withdraw(500, iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("남은 금액:"+iMoney);

        //이체
       
}
}
