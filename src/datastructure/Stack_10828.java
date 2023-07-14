package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828 {

    static int[] stack;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());

        stack = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            String st = str.nextToken();
            switch (st) {
                case "push" :
                    push(Integer.parseInt(str.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    static void push(int num){
        stack[size] = num;
        size++;
    }
    static int pop() {
        if(size == 0) return -1;
        int num = stack[size-1];
        stack[size-1] = 0;
        size--;
        return num;
    }
    static int size() {
        return size;
    }
    static int empty() {
        return size == 0 ? 1 : 0;
    }
    static int top() {
        return size == 0 ? -1 : stack[size-1];
    }
}
