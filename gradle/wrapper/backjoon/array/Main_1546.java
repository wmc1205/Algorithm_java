package gradle.wrapper.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double best = 0;
        double total = 0;
        double avg = 0;
        double[] arr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < arr.length;i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        br.close();
        Arrays.sort(arr);
        best = arr[arr.length-1];
        for(int i = 0; i < arr.length; i++){
            total += (arr[i]/best)*100;
        }
        avg = total / arr.length;
        System.out.println(avg);
    }
}
