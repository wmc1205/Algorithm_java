package gradle.wrapper.backjoon.Mathmatic;

import java.util.Scanner;

public class Main_10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); // 테스트 케이스


    for(int i = 0; i < T; i++) {
        int H = scan.nextInt(); //호텔 층 수
        int W = scan.nextInt(); //호텔 방 갯수(쓸모는 없지만 입력값을 위해 반드시 넣어줘야 한다)
        int N = scan.nextInt(); //N번째 손님

        if (N % H == 0) {
            System.out.println((H * 100) + (N / H));
        } else {
            System.out.println(((N % H) * 100) + ((N / H)+1));
        }

    }
        scan.close();
    }
}
/* 문제 풀이

for(int i = 0; i < T; i++) {
        int H = scan.nextInt(); //호텔 층 수
        //int W = scan.nextInt(); //호텔 방 수(로직에 사용하지 않음)
        int N = scan.nextInt(); //N번째 손님

        //int Y; 손님이 배정받게 될 층 수;
        //int X; 손님이 배정받게 될 방 호수

        if (N % H == 0) { //층 수와 손님의 번째 수가 같을 때
        //    Y = H * 100; // 호텔 방번호는 YXX, YYXX이니까 100을 곱함
        //    X = N / H;  // (N / H) + 1 에 대입하면 2가 되기 때문에 +1을 하지 않은 수를 X에 넣는다.
            System.out.println((H * 100) + (N / H));
        } else {
           // Y = (N % H) * 100;
           // X = (N / H) + 1; // 호 수는 1호부터 시작하고, 1의 자리가 앞자리인 호수 부터 채워지니까 N/ H의 몫에 +1을 한다.
            System.out.println(((N % H) * 100) + ((N/H)+1));
        }

    }
        scan.close();

 */