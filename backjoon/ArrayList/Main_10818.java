package backjoon.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10818 {
    public static void main(String[] args) throws IOException { //buffer의 입력을 출력하려면 예외처리 필요

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner 대신 bufferedReader 이용

        int n = Integer.parseInt(br.readLine());//배열의 공간 입력
        //공백도 입력되어야 하니 공백은 string 자료형으로 구분지어줘야 한다.
        StringTokenizer st = new StringTokenizer(br.readLine()," "); //공백을 담은 StringTokenizer 타입의 객체 생성

        int index = 0; //배열의 인덱스
        int[] arr = new int[n]; //n개의 공간의 배열 생성
        while(st.hasMoreTokens()){ //읽어들일 공백이 남아있다면,
            arr[index] = Integer.parseInt(st.nextToken()); //배열 인덱스에 공백을 넣고 공백을 parseInt로 정수 변환
            index++; //해당 인덱스를 올려줘서 다음 글자를 비교.
        }
        Arrays.sort(arr); //배열을 오름차순으로 정렬
        System.out.println(arr[0]+ " "+ arr[n-1]);//가장 작은수(첫번째 인덱스), 가장 큰수(배열의 마지막인덱스) 출력

        br.close();

    }
}
