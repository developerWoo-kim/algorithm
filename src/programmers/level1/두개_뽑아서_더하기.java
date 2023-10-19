package programmers.level1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 두개_뽑아서_더하기 {
    public static void main(String[] args) {
        solution(new int[]{5,0,2,7});
    }
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for(int i = 0; i < numbers.length-1; i++) {
            int num1 = numbers[i];
            for(int k = i+1; k < numbers.length; k++) {
                int num2 = numbers[k];
                set.add(num1+num2);
            }
        }

        int[] answer = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int idx = 0;
        while (iterator.hasNext()) {
            answer[idx++] = iterator.next();
        }

        return answer;
    }
}
