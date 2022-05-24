package gradle.wrapper.backjoon.BOJ;

import java.util.Scanner;

public class Main_1110 {
/*
1110- 더하기 싸이클
문제:
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("입력 : ");

            int a = scan.nextInt();
            scan.close();
            int copy_a = a;
            int count = 0;
            while(true) {
                int left = a / 10;  //반복문을 돌 때 마다 새로운 수가 연산에 포함되야 하기 때문에 지역변수로 설정해야 한다.
                int right = a % 10; //전역 변수로 설정하게 되면, 초기 a값만 연산에 포함되어 무한루프에 걸린다.
                a = (right * 10) + ((left+right)%10);
                //right * 10 = 연산하는 수의 10의 자리 수
                //(left+right) %10 = 연산하는 수의 1의 자리 수
                count++;
                if(a==copy_a) {
                    break;
                }
            }
            System.out.println(count);
        }
    }

