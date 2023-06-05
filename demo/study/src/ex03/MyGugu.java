package ex03;
public class MyGugu {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            for(int j=1; j<=8; j++){
                System.out.print(i+"*"+j+"="+(i*j));
                    System.out.print(", ");
                }
                for(int k=9; k<=9; k++){
                    System.out.print(i+"*"+k+"="+(i*k));
                    System.out.println();
                }
            }
        }
    }
