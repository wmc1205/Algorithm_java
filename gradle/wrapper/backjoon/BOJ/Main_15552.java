package gradle.wrapper.backjoon.BOJ;

import java.io.*;
import java.util.StringTokenizer;

//15552번 문제 : 빠른 A + B

// 입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
// 출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
//입력                                                출력
//5
//1 1                                               2
//12 34                                             45
//5 500                                             505
//40 60                                             100
//1000 1000                                         2000


//1) BufferedWriter 사용
//2) StringBuilder 사용


public class Main_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
//      1)
/*
        for(int i = 0; i < T; i++){
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target+1));
            sb.append(result+"\n");
        }
        br.close();
        System.out.print(sb);

 */
//        2)
       for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
       }
        bw.flush();
        bw.close();
        br.close();

    }
}
