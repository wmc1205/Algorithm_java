package gradle.wrapper.backjoon.BOJ;

import java.util.Scanner;

public class Main_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for(int i = a; i <= a;i++){
            for(int j = 1; j< 10;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
