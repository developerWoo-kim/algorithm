package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 최소직사각형 {
    public static void main(String[] args) {

//        int solution = solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        int solution = solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});
        System.out.println(solution);
    }


    public static int solution(int[][] sizes) {
        int prevMax = 0;
        int prevMin = 0;

        for (int[] size: sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);

            prevMax = Math.max(curMax, prevMax);
            prevMin = Math.max(curMin, prevMin);
        }

        return prevMax * prevMin;
    }
}
