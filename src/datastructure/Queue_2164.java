package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());

        Deque<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }

        System.out.println(recursion(q));
    }
    static int recursion(Deque<Integer> q) {
        if(q.size() <= 1) {
            return q.getFirst();
        }
        q.pop();
        int num = q.getFirst();
        q.pop();
        q.addLast(num);

        return recursion(q);
    }
}
