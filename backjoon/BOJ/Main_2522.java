package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2522 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i<= length; i++){
            for(int j = 0; j < length-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i<=length;i++){
            for(int j= 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = length-i; j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
