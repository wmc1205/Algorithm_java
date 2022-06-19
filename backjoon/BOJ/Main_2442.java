package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        //a 만큼의 별 찍을 공간 생성
        for(int i = 1; i <= a; i++){
            //공백 찍기
            for(int j= i; j< a; j++){
                System.out.print(" ");
            }
            //별 찍기
            for(int j= 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
