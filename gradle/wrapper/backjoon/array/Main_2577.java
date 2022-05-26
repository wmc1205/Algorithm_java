package gradle.wrapper.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//- valueOf(number) : 정수를 String으로 반환
//- length() : 문자열의 길이를 반환합니다.
//- charAt(index) : 해당 문자열의 index에 위치한 문자를 char 형으로 반환합니다.
// 문자 -> 정수 변환 : c.charAt(i) - ('0' or 48)
public class Main_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int num = a * b * c;

        int[] arr = new int[10];
        br.close();


        String input = String.valueOf(num);
        for(int i = 0; i< input.length(); i++){
            arr[input.charAt(i)-'0']++; //문자열을 다시 정수로 변환하여 인덱스르 1씩 추가하여 arr배열에 포함
        }
        for(int i = 0; i<arr.length; i++ ){
            System.out.println(arr[i]);

        }


    }
    }
//int index = num % 10; //인덱스의 위치(num에서 10을 나눈 나머지가 곧 인덱스 번호)

/*while (num > 0) {
            arr[index]++; // 해당 인덱스 번호에 1을 추가
            num /= 10;  // 그 다음 연산을 위해 10을 나누어 몫만 가져가고 뒤에서 한자리씩 버림
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/