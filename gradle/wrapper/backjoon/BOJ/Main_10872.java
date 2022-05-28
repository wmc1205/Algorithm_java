package gradle.wrapper.backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10872 {
    public static int factorial(int num) {
        int N = 1;
        while (num > 1) { //num이 1보다 크다면 반복
            N *= num; //반복문이 돌때 마다 N에 num을 곱한다.
            num--;  //이후 num을 1씩 감소한다

        }
        return N; //반복문을 빠져나온다면 N을 반환한다.
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(factorial(a));
    }
}
