package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class 완전탐색 {
    public static void main(String[] args) {
        solution(new int[]{1,1,1,1,1,1});
    }
    // 5
    // 4
    // 5
    public static int[] solution(int[] answers) {
        int[] answerArr = new int[3];

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstIdx = 0; int firstLength = student1.length;
        int secondIdx = 0; int secondLength = student2.length;
        int thirdIdx = 0; int thirdLength = student3.length;

        for(int num : answers) {
            if(firstIdx < firstLength) {
                if(num == student1[firstIdx]) {
                    answerArr[0]++;
                }
                firstIdx++;
            } else {
                firstIdx = 0;
                if(num == student1[firstIdx]) {
                    answerArr[0]++;
                }
            }

            if(secondIdx < secondLength) {
                if(num == student2[secondIdx]) {
                    answerArr[1]++;
                }
                secondIdx++;
            } else {
                secondIdx = 0;
                if(num == student2[secondIdx]) {
                    answerArr[1]++;
                }
            }

            if(thirdIdx < thirdLength) {
                if(num == student3[thirdIdx]) {
                    answerArr[2]++;
                }
                thirdIdx++;
            } else {
                thirdIdx = 0;
                if(num == student3[thirdIdx]) {
                    answerArr[2]++;
                }
            }
        }

        int maxScore = Integer.MIN_VALUE;
        for(int answer : answerArr) {
            maxScore = Math.max(maxScore, answer);
        }

        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < answerArr.length; i++) {
            if(maxScore == answerArr[i]) {
                array.add(i+1);
            }
        }

        Collections.sort(array);
        int[] result = array.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
