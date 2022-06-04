package gradle.wrapper.backjoon.BOJ;


/*
    8958 -OX퀴즈
   "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
   문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
  "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
    OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 갯수 입력

        for(int i = 0; i < T; i++){ //테스트 케이스 반복
            sb.setLength(0); //이전의 출력값을 초기화
            String str = br.readLine();
            int cnt = 0; // 'O'의 연속을 파악
            int sum = 0; // cnt에 따라 점수 합산
            for(int j = 0; j < str.length();j++){ //알파벳 갯수에 따라 반복
                if(str.charAt(j) == 'O'){ //만약 알파벳이 O이라면
                    cnt++; //카운트 증가(O이 연속되면 cnt도 1씩 증가)
                    sum += cnt; //증가된 카운트 만큼 점수 합산
                }
                else{ //아니라면
                    cnt = 0; //카운트는 0;
                }
            }
            sb.append(sum); //Stringbuilder에 점수 추가
            System.out.println(sb); //Stringbuilder(sb) 출력
        }
        br.close();
    }
}
