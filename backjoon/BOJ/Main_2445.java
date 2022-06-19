package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2445 -> 별찍기 8


public class Main_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        br.close();
        //윗 상단 별찍기 (중간 기준열 포함)
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * length - i; j > 0; j--) {// 공백은 아래로 내려갈 수록 2*length-1개씩 감소한다.
                if (j > i) { //공백을 찍다가 별이 찍히는 지점
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= length; i++) { //i가 2부터 시작되는 이유는 중간줄에 대해 중복을 제거하기 위함이다.
            for (int j = i; j <= length; j++) { //i가 2부터 시작하기 때문에, (길이-2)+1개의 별이 찍힌다.
                System.out.print("*");
            }
            for (int j = 1; j < 2 * i - 1; j++) {//공백은 아래로 내려갈 수 록 (2*i-1)개씩 증가한다.
                System.out.print(" ");
            }
            for (int j = i; j <= length; j++) {//별이 찍히는 갯수는 좌우 동일하기 때문에 처음 별찍은 로직과 동일하다.
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
