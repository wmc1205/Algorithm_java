package gradle.wrapper;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
    }
}