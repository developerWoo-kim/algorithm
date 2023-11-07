package programmers.level1;

import java.util.Arrays;

public class 예산 {
    // 1 2 7
    // 1 2 6
    // 1 2 4
    // 1 7 6
    // 1 7 4
    // 1 6 4

    // 2 7 6
    // 2 7 4
    // 2 6 4

    // 7 6 4
    // 7 4 1
    public static void main(String[] args) {
        solution(new int[] {2,2,3,3}, 10);
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int i : d) {
            if(i > budget) {
                break;
            }
            budget -= i;
            answer++;
        }

        return answer;
    }
}
