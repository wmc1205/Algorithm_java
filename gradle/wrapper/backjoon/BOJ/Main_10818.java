package gradle.wrapper.backjoon.BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//10818 - 최소, 최대
//while(st.hasMoreTokens()) -> 다음 데이터 요소가 있는 지 확인
//index 변수 1씩 증가시키기
//Arrays.sort 메서드로 정렬
//최소 -> 배열의 0번 인덱스. 최대 -> 배열의 마지막 인덱스(a-1) 출력


public class Main_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

       int index = 0;
       int[] arr = new int[a];
       while(st.hasMoreTokens()){
           arr[index] = Integer.parseInt(st.nextToken());
           index++;
       }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[a-1]);
    }
}
