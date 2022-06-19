package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()+ " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if(H>=0 && H<=23){
            if(M>=0 && M<=59){
                if(M<45 && H > 0)   System.out.println(H - 1 + " " + (60 + M - 45));
                else if(M>=45)      System.out.println(H +" "+(M-45));
                else                System.out.println((24+H-1)+" " + (60 + M -45));
            }
        }

    }
}
