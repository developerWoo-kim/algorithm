package programmers.level1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 체육복 {

    public static void main(String[] args) {
        solution(5, new int[]{1, 3}, new int[]{2, 5});
    }

    public static int[] lostArr;
    public static int[] reserveArr;
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        lostArr = lost;
        reserveArr = reserve;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            map.put(i, 1);
        }

        for(int i = 0; i < lostArr.length; i++) {
            boolean preChk = lostArr[i] != 1 ? true : false;
            boolean postChk = lostArr[i] != n ? true : false;
            map.put(lostArr[i], 0);
            for(int k = 0; k < reserveArr.length; k++) {
                if(lostChecker(reserveArr[k])) {
                    if(preChk) {
                        if(lostArr[i] - 1 == reserveArr[k]) {
                            map.put(lostArr[i], 1);
                            removeElement(reserveArr[k]);
                            break;
                        }
                    }
                    if(postChk) {
                        if(lostArr[i] + 1 == reserveArr[k]) {
                            map.put(lostArr[i], 1);
                            removeElement(reserveArr[k]);
                            break;
                        }
                    }
                }
            }
        }

        for(Map.Entry<Integer, Integer> elem : map.entrySet() ){
            if(elem.getValue() == 1) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean lostChecker(int num) {
        boolean result = true;
        for(int i = 0; i < lostArr.length; i++) {
            if(lostArr[i] == num) {
                result = false;
            }
        }
        return result;
    }

    public static void removeElement(int item) {
        reserveArr = Arrays.stream(reserveArr)
                .filter(s -> s != item)
                .toArray();
    }
}

