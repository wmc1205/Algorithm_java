package gradle.wrapper;


import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        int copy_a = a;
        scan.close();
         do{
            int left = a / 10;
            int right = a % 10;
            a = (right * 10) + ((left + right) % 10);
            count++;

        }while(a != copy_a);
        System.out.println(count);
    }
    }
