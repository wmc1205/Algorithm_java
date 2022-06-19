package backjoon.ArrayList;


import java.util.Scanner;

//2953번 문제 : 나는 요리사


public class Main_2953 {
    public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int winner_score = 0;
    int winner_index = 0;
    int[] human = new int[5];
    for(int i =0; i < human.length; i++){
        int sum = 0;
        for(int j = 0; j < human.length - 1; j++){
            int score = scan.nextInt();
            sum += score;
            if(winner_score < sum){
                winner_score = sum;
                winner_index = i+1;
            }
        }
    }
        System.out.printf("%d %d",winner_index,winner_score);
        scan.close();
    }
}
