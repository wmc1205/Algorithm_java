package gradle.wrapper.backjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//Stringbuffer vs Stringbuilder
//switch ~ case 사용으로 각 기능별로 구현


public class Main_10828 {
    public static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = scan.next();
            switch (str) {
                case "push":
                    int x = scan.nextInt();
                    stack.push(x);
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    private static int pop() {
        if(stack.isEmpty()){
            return -1;
        }else{
            int temp = stack.peek();
            stack.pop();
            return temp;
        }
    }

    private static int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }

    private static int size() {
        return stack.size();
    }

    private static int empty() {
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }

    }
}