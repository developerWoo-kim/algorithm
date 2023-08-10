package programmers.level1;

import java.util.HashMap;

public class 로또_순위 {
    public static void main(String[] args) {
//        int[] solution = solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19});

        int[] solution = solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25});
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int winNum : win_nums) {
            hashMap.put(winNum, 0);
        }
        int maxCount = 0;
        int minCount = 0;

        int hideCount = 0;
        for(int lottoNum : lottos) {
            if(lottoNum == 0) {
                hideCount++;
            }
            if(hashMap.containsKey(lottoNum)) {
                minCount++;
            }
        }
        maxCount = minCount + hideCount;
        answer[0] = maxCount;
        answer[1] = minCount;

        int index = 0;
        for(int answerNum : answer) {
            switch (answerNum) {
                case 6 :
                    answer[index] = 1;
                    break;
                case 5 :
                    answer[index] = 2;
                    break;
                case 4 :
                    answer[index] = 3;
                    break;
                case 3 :
                    answer[index] = 4;
                    break;
                case 2 :
                    answer[index] = 5;
                    break;
                default :
                    answer[index] = 6;
                    break;

            }
            index++;
        }

        return answer;
    }
}
