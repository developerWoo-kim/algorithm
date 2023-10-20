package programmers.level1;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
    }

    /**
     *
     *  - 실패율이 높은 스테이지부터 내림차순으로 ㄱㄱ
     *
     * 스테이지에 도달 했으나
     *  아직 클리어 하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
     * @param N : 스테이지의 개수
     * @param stages : 스테이지의 번호가 담긴 배열
     * @return
     */
    public static int[] solution(int N, int[] stages) {
        Map<Integer, Integer> dodalMap = new HashMap<>();
        Map<Integer, Integer> clearMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int dodalNum = 0;
            int clearNum = 0;

            for(int stage : stages) {
                if(stage == i) {
                    dodalNum++;
                }
                if(stage >= i) {
                    clearNum++;
                }
            }
            if(dodalMap.containsKey(i)) {
                dodalMap.put(i, dodalMap.get(i) + dodalNum);
                clearMap.put(i, clearMap.get(i) + clearNum);
            } else {
                dodalMap.put(i, dodalNum);
                clearMap.put(i, clearNum);
            }
        }

        List<Map.Entry<Integer, Double>> failureRates = new ArrayList<>();
        for(int j = 1; j <= N; j++) {
            double failureRate = clearMap.get(j) != 0 ? (double) dodalMap.get(j) / clearMap.get(j) : 0.0;
            failureRates.add(new AbstractMap.SimpleEntry<>(j, failureRate));
        }

        // 실패율을 내림차순으로 정렬하고, 실패율이 같을 경우 스테이지 번호 오름차순으로 정렬
        failureRates.sort((e1, e2) -> {
            if (e1.getValue() == e2.getValue()) {
                return Integer.compare(e1.getKey(), e2.getKey());
            }
            return Double.compare(e2.getValue(), e1.getValue());
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failureRates.get(i).getKey();
        }

        return answer;
    }
}
