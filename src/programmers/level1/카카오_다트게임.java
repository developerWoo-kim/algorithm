package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 카카오_다트게임 {
    public static void main(String[] args) {
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];

        int index = -1;
        String[] dartResultArr = dartResult.split("");
        for(int i = 0; i < dartResultArr.length; i++) {
            if(dartResultArr[i].matches("[0-9]")) {
                index++;
                score[index] = Integer.parseInt(dartResultArr[i]);
                if(dartResultArr[i+1].matches("[0-9]")) {
                    score[index] = 10;
                    i++;
                }
            }

            switch (dartResultArr[i]) {
                case "D" : score[index] = (int) Math.pow(score[index],2);
                    break;
                case "T" : score[index] = (int) Math.pow(score[index],3);
                    break;
                case "*" : score[index] *= 2;
                    if(index - 1 >= 0) score[index-1] *= 2;
                    break;
                case "#" : score[index] *= -1;
                    break;
            }

        }

        for(int num : score) {
            answer += num;
        }

        return answer;
    }

}
