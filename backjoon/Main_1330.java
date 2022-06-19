package backjoon;

import java.util.Scanner;
//별찍기 문제
public class Main_1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       for(int i = 0; i < num; i++) {
           for (int k = 1; k < num-i; k++) {
               System.out.print(" ");
           }
           for(int j = 0; j <(i*2)-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
        scan.close();
    }
}
