package gradle.wrapper.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3052 - 나머지
//-2중 for 문 (앞자리와 뒷자리의 비교를 위함. 뒷자리는 앞자리보다 인덱스가 +1 높아야한다.)
public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int count = 0;

        for(int i = 0; i< arr.length;i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {//나머지가 다르다면
                    arr[j] = -1; //범위 밖의 숫자로 만들어버린다. 그러면 아예 비교에서 제외되버린다.
                }

            }
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != -1){ //배열의 요소가 -1이 아니라면
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
