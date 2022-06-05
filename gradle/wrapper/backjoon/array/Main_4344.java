package gradle.wrapper.backjoon.array;

import java.util.Scanner;

/*
<4344 -평균은 넘겠지>
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

 */
public class Main_4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); //테스트 케이스 수
        int[] arr; //배열 설정

        for(int i = 0; i < T; i++){
            int student = scan.nextInt();
            arr = new int[student]; //학생을 담은 배열로 선언

            double sum = 0; //점수 합계

            for(int j = 0; j < student; j++){ //학생들의 점수를 배열에 입력하여 합계 처리
                int score = scan.nextInt();
                arr[j] = score;
                sum += score;
            }
            double avg = (sum / student); //점수의 평균
            double count = 0; // 평균을 넘는 학생들의 수

            for(int j = 0; j < student; j++){ //평균을 넘는 학생들을 카운트
                if(arr[j] > avg){ //배열에 담긴 점수가 평균을 넘겼다면
                    count++; // 카운트 + 1
                }
            }
            System.out.printf("%.3f%%\n",(count/student)*100); // 소수점 3째자리로 평균을 넘는 학생 수의 비율 출력
        }
        scan.close();

    }
}
