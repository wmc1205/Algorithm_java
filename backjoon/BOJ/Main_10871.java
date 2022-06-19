package backjoon.BOJ;

import java.util.Scanner;
// - 배열을 이용하는 방법
// - StringBuilder 이용방법 **
public class Main_10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int lessNum = scan.nextInt(); //비교대상인 수

        StringBuilder sb = new StringBuilder(); //요소들을 저장하는 공간

        for(int i = 0; i < num;i++){ // 입력받을 숫자만큼 반복문 출력
            int val = scan.nextInt(); //비교할 숫자들을 입력
            if(lessNum > val){  //비교대상 보다 입력값이 작을 경우
                sb.append(val + " "); //StringBuilder에 append
            }
        }
        scan.close();
        System.out.println(sb); //출력
    }
}
