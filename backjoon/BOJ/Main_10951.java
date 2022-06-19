package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10950문제와 달리, 출력 갯수가 정해져 있지 않음
//입력값이 null일 경우, 실행문을 멈추는 문제
//-------------------------------------------
//EOF : 입력에서 더이상 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료


public class Main_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        String str;
      while((str = br.readLine()) != null){ //str을 전역변수로 초기화하면 메모리 초과 따라서 while문 안에서 초기화.
            st = new StringTokenizer(str," ");
            int a =Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
