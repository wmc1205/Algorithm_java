package gradle.wrapper;



import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a =Integer.parseInt(br.readLine());
        for(int i= 0; i< a;i++){
            st= new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            //개행을 넣어줘야 1줄이 입력되었음을 bw가 파악한다.

        }
        bw.flush();
        bw.close();
        br.close();
    }
}