package backjoon.BOJ;

import java.util.Scanner;

/*
<10809 - 알파벳 찾기>
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

        //1.배열의 모든 인덱스를 -1로 먼저 초기화 시키자.
        //2.문자열 내 알파벳 갯수와 배열을 연결시킨다.
        //3.각 알파벳의 인덱스가 -1로 초기화되어 있는 경우만 알파벳 인덱스값을 출력. 동일한 알파벳의 경우는 처음 알파벳 인덱스값을 출력
        //4.알파벳이 쓰이지 않은 곳은 다 -1
        //배열 내 인덱스값을 모두 출력.
 */
public class Main_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] arr = new int[26]; //알파벳의 갯수만큼 인덱스를 체크하는 배열
        for(int i =0; i < arr.length; i++){
            arr[i] = -1; //모두 -1로 초기화시켜서 사용되는 알파벳만 숫자가 바뀌도록 선언
        }
        String str = scan.nextLine(); // 띄어쓰기 포함해야 하기 때문에 nextLine() 사용;

        for(int i = 0; i < str.length(); i++){ //해당 인덱스마다 알파벳으로 변환
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1) { //-1로 초기화된 값만 바꾼다.(동일 문자는 처음 인덱스가 출력되야 하기 때문이다)
                arr[ch - 'a'] = i; //인덱스가 0부터 시작하니까 'a'를 빼주면 해당 알파벳의 인덱스가 i인것을 알 수 있다.
            }

        }
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        scan.close();

    }
}
