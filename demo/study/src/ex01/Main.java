package ex01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); //버퍼리더 스트링을 인트로
        for(int i=0; i<test; i++){
            int n = Integer.parseInt(br.readLine());
            int rang = 0;
            int count = 0;
            for(int j=0; j<n; j++) {
                int x = Integer.parseInt(br.readLine());
                int f = Integer.parseInt(br.readLine());
                if(rang < x){
                    count++;
                    rang = f+x;
                }
            }
            System.out.println("#"+(i+1)+count);
        }

    }
}