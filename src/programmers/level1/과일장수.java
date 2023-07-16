package programmers.level1;

import java.util.Collections;
import java.util.PriorityQueue;

public class 과일장수 {
    public static void main(String[] args) {
        int solution = solution(3, 4, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(solution);
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : score) {
            pq.add(n);
        }

        boolean isTrue = true;
        while (isTrue) {
            int index = 0;
            int minScore = 9;
            for(int i = 0; i < m; i++){
                if(pq.isEmpty()) {
                    isTrue = false;
                    break;
                } else {
                    index++;
                    int pqScore = pq.poll();
                    if(pqScore < minScore) {
                        minScore = pqScore;
                    }
                }
            }
            if(index == m) {
                answer += (minScore * m) * 1;
            }
        }

        return answer;
    }
}
