package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int num = 0; //현재 육각형의 갯수
        int totalNum = 1; // n은 1부터 시작
        int root = 1; //N이 1일 때, 경로는 최소 1개(시작, 끝 포함)

        while(true) {//최소 경로가 나타날 때 까지 반복
            if (N <= totalNum) { //total 갯수가 N보다 크거나 같아질 때, 최소 경로가 정해진다.
                break;
            } else {
                num += 6; //root가 1씩 커질 때마다 num은 6씩 커진다.
                totalNum += num; //num을 total에 더해준다.
                root++;
            }
        }
        sb.append(root);
        System.out.println(sb);
    }
}
