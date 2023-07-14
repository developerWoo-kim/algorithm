package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue {
    static Deque<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            String st = str.nextToken();

            switch(st){
                case "push" :
                    int num = Integer.parseInt(str.nextToken());
                    push(num);
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
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    static void push(int n) {
        q.add(n);
    }
    static int pop() {
        if(q.isEmpty()) {
            return -1;
        } else {
            return q.pop();
        }
    }
    static int size() {
        return q.size();
    }
    static int empty() {
        if(q.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
    static int front() {
        return q.isEmpty() ? -1 : q.getFirst();
    }
    static int back() {
        return q.isEmpty() ? -1 : q.getLast();
    }
}
