package gradle.wrapper.backjoon.DP;

import java.util.Scanner;

//DP 단순 재귀 코드
//<피보나치 수열>
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n+1];
        System.out.println(fibo(n));
    }
    static int fibo(int x){
        if(x == 1 || x == 2) return 1;
            return fibo(x-1) + fibo(x -2);
        }
    }

