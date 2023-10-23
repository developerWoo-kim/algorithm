package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 체육복2 {

    public static int[] lostArr;
    public static int[] reserveArr;
    public static void main(String[] args) {
        solution(24, new int[]{12, 13, 16, 17, 19, 20, 21, 22},
                new int[]{1,22, 16, 18, 9, 10});
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        lostArr = lost;
        reserveArr= reserve;
        Arrays.sort(lostArr);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for(int i = 0; i < lostArr.length; i++) {
            int currNum = lostArr[i];
            int preNum = currNum - 1;
            int postNum = currNum + 1;

            if(reserveChecker(currNum)) {
                removeReserveArr(currNum);
                continue;
            }

            map.put(currNum, -1);

            if(!lostChecker(preNum) && reserveChecker(preNum)) {
                map.put(currNum, 1);
                removeReserveArr(preNum);
                continue;
            };

            if(!lostChecker(postNum) && reserveChecker(postNum)) {
                map.put(currNum, 1);
                removeReserveArr(postNum);
                continue;
            };

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                answer++;
            }
        }
        // 1 2 3 5 6 7 9 10 13 14 24
        return answer;
    }

    public static boolean reserveChecker(int num) {
        return Arrays.stream(reserveArr).anyMatch(s -> s == num);
    }

    public static boolean lostChecker(int num) {
        return Arrays.stream(lostArr).anyMatch(s -> s == num);
    }

    public static void removeReserveArr(int num) {
        reserveArr = Arrays.stream(reserveArr).filter(s -> s != num).toArray();
    }
}
