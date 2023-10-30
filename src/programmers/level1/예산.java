package programmers.level1;

import java.util.Arrays;

public class 예산 {
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
