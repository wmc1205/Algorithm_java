package backjoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_18258 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>(); //LinkedList 사용
       StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int back = 0;
        int N =Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    back = x;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n"); // sb에서 -1을 출력
                    } else {
                        sb.append(queue.poll()).append("\n"); //poll : 가장 앞에 있는 정수를 빼낸 뒤 출력
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");//peek : 가장 앞에 있는 정수를 출력
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(back).append("\n");
                    }
                    break;
                case "defualt":
                    break;
            }
            }
        System.out.println(sb);
        }

    }

