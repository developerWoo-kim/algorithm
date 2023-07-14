package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deque {
    static java.util.Deque<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            String st = str.nextToken();

            switch(st) {
                case "push_front" :
                    push_front(Integer.parseInt(str.nextToken()));
                    break;
                case "push_back" :
                    push_back(Integer.parseInt(str.nextToken()));
                    break;
                case "pop_front" :
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(pop_back()).append("\n");
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
    static void push_front(int n) {
        q.push(n);
    }
    static void push_back(int n) {
        q.addLast(n);
    }
    static int pop_front() {
        if(q.isEmpty()) {
            return -1;
        } else {
            int num = q.getFirst();
            q.pop();
            return num;
        }
    }
    static int pop_back() {
        if(q.isEmpty()) {
            return -1;
        } else {
            int num = q.getLast();
            q.pollLast();
            return num;
        }
    }
    static int size() {
        return q.size();
    }
    static int empty() {
        return q.isEmpty() ? 1 : 0;
    }
    static int front() {
        return q.isEmpty() ? -1 : q.getFirst();
    }
    static int back() {
        return q.isEmpty() ? -1 : q.getLast();
    }

}
