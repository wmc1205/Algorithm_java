package backjoon.BOJ;

import java.util.Scanner;

public class Main_2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for(int i = 0; i< a;i++) {
            for(int j = 0; j< a-i; j++){
                System.out.print("*");
            }
            for(int j = a-i+1; j > 0;j--){
                System.out.print("");
            }

            System.out.println();
        }
    }
}
