import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list= new ArrayList<>();
        for(int i = 0; i < T; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for(int value : list){
            sb.append(value + "\n");
        }
        System.out.println(sb);
        /*<시간초과>
        int[] arr = new int[T];
        int temp;
        for(int i = 0; i<arr.length;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            sb.append(arr[i]+"\n");

        }
        System.out.println(sb);

         */
    }
}
