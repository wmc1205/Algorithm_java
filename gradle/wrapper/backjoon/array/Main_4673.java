package gradle.wrapper.backjoon.array;

public class Main_4673 {
    public static void main(String[] args) {
        //1. 함수를 판단하여 해당하는 함수가 배열에 포함되는지를 판단하는 boolean 배열 생성
        boolean[] arr = new boolean[10001]; // 1~10000을 판단하기 위함(이 곳에 포함되면 생성자가 존재)

        for(int i = 1; i < arr.length; i++){ // 1~ 10000의 수를 판단
            int n = d(i);
            if(n < 10000){ //n은 10000이하라면
                arr[n] = true; //n은 생성값이 존재(배열에 포함)
            }
        }
        for(int i = 0; i < arr.length; i++){ // 0~ 10000의 수를 판단
            if(arr[i] == false){ //배열에 포함되지 않는 숫자라면
                System.out.println(i); //생성자가 없는 숫자, 즉 셀프넘버로 판단하여 출력
            }
        }

    }
    public static int d(int number){    //셀프넘버를 파악하는 함수 d를 생성
        int sum = number;   //sum을 number로 초기화. why? 처음 숫자에서 각 자릿 수를 더해야 하기 때문이다.(4673 -> 4673 + 4 + 6 + 7 + 3)
        while(number != 0){ //number가 0이 되지 않을 때 까지 반복
            sum += number % 10; //number의 첫 번째 자리 수를 sum에 더한다.
            number = number / 10;  //해당 첫 번째 자리 수를 제거한 뒤 반복문을 돌린다.
        }
    return sum; //while조건문을 벗어나면 sum을 반환한다.
    }
}