package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int commandIdx = 0;
        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1] - 1;
            int k = command[2];

            ArrayList<Integer> resultArray = new ArrayList<>();
            for(int l = i; l <= j; l++){
                resultArray.add(array[l]);
            }
            Collections.sort(resultArray);
            answer[commandIdx++] = resultArray.get(k-1);
        }

        return answer;
    }
}
