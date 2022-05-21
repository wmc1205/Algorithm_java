package gradle.wrapper.backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
        import java.nio.charset.StandardCharsets;

public class Main_11720 {
    public static void main(String[] args) throws IOException {
        //1. n개 입력
        //2. 입력값의 각 자리 수를 모두 더한다
        //3. 출력한다.

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

       String str = br.readLine();
       int sum = 0;
        for(int i = 0; i< a; i++){
            sum +=  str.charAt(i)-48;
        }
        System.out.println(sum);
        br.close();
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        for(byte value: br.readLine().getBytes()){
            sum += (value -'0');
        }
        System.out.println(sum);
    }
}

