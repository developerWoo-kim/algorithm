package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class 명예의_전당 {
    public static void main(String[] args) {
        solution2(3, new int[] {10, 100, 20, 150, 1, 100, 200});
    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(arrayList.size() < k) {
                arrayList.add(score[i]);
                Collections.sort(arrayList);
                answer[i] = arrayList.get(0);
                continue;
            }

            arrayList.add(score[i]);
            Collections.sort(arrayList);
            arrayList.remove(0);
            answer[i] = arrayList.get(0);
        }
        return answer;
    }

    public static int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
             if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}
