package gradle.wrapper.backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++){

            for(int j = 0; j < i ;j++) {
                System.out.print(" ");
            }
            for(int j = a-i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
