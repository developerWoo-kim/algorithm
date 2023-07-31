package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int solution = streamSolution(new int[]{5,8,4,0,6,7,9});
        System.out.println(solution);
    }
    public static int streamSolution(int[] numbers) {
        return 45- Arrays.stream(numbers).sum();
    }
    public static int solution(int[] numbers) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : numbers) {
            map.put(num, num);
        }
        for(int i = 1; i < 10; i++) {
            if(!map.containsKey(i)) {
                answer += i;
            };
        }
        return answer;
    }
}
