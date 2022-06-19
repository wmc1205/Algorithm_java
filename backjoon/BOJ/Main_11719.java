package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// EOF 문제 : 입력값이 null이 아니라면 계속 출력

public class Main_11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = "";
        while((n =br.readLine()) != null) {
            System.out.println(n);
        }

    }
}
