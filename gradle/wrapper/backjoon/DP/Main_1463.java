package gradle.wrapper.backjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1463 - 1로 만들기
/*
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 */

// <dp 알고리즘 문제>
// bottom up 방식(반복문)
public class Main_1463 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int dp[] = new int[a+1]; //dp 테이블 정의
        dp[0] = dp[1] = 0; //초기값 정하기

        for(int i = 2; i <= a; i++){
            //연산 3가지 방법을 이용하여 dp 테이블에 count하기(연산 1번 당 + 1)
            dp[i] = dp[i-1]+ 1; //1을 뺀다
            if(i % 2 == 0) dp[i] = Math.min(dp[i],dp[i/2]+1); //1을 뺀 값과 2로 나눈 값을 비교하여 최소값 호출
            if(i % 3 == 0) dp[i] = Math.min(dp[i],dp[i/3]+1); //1을 뺀 값과 3로 나눈 값을 비교하여 최소값 호출

    }
        System.out.println(dp[a]);
       }
}