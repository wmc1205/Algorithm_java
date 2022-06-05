package gradle.wrapper;


import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        while(a != 0){
            sum = (sum *  10) + (a % 10);
            a = a / 10;
        }
        System.out.println(sum);
        scan.close();
    }


    }
