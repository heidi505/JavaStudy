package ex02;
public class Main {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("현재 i의 수 : " + i);
            i++;
        }while(i<0);

        System.out.println("do - while문이 끝나고 난 후의 i의 수 : " + i);
    }
} 
