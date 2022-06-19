package backjoon.BOJ;


import java.util.Scanner;

//1924 -2007년
/*
- swtich ~ break ( 월별로 판단하여 cnt에 누적으로 일 수 더함)
- 누적 계산 값(2월이면 1월꺼까지 count하여 시작)이 되어야 하기 때문에 for문으로 묶는다
- switch문 탈출 후 나머지 일 수(y)를 더한다.
- 요일은 7개이기 때문에 cnt를 7로 나눈 나머지 값을 배열 arr의 요일과 비교한다.
- 비교하여 해당 인덱스에 있는 값을 출력한다.

- break 까먹지 말자..
- 월의 시작은 1이기 때문에 int i = 1이 되어야 한다는 것 주의
 */

public class Main_1924 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt(); //월
        int y = scan.nextInt(); //일
        String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int cnt = 0; //총 일수
        for(int i = 1; i<x; i++){// 누적 치를 계속 더해야 하기 때문에 for문으로 반복한다.
        switch(i) { //월별로 일 수 더하기
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                cnt+= 31;
                break;
            case 4: case 6: case 9: case 11:
                cnt+= 30;
                break;
            case 2:
                cnt+= 28;
                break;
            }
          }
        cnt += y; //월 별로 더한 후 나머지 일 수 cnt에 더하기
        int result = cnt % 7; //요일이 7개니까 해당 일수에 7을 나눠서 인덱스에 맞는 요일을 호출
        System.out.println(arr[result]);
        scan.close();

        //other's
        /*  Scanner scan = new Scanner(System.in);
        int x,y =0;
         x =scan.nextInt();
         y = scan.nextInt();

        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        for(int i = 0; i < x -1 ; i++){
            y += day[i];
        }
        y = y % 7;
        System.out.println(arr[y]);
        scan.close();
         */
    }


}
