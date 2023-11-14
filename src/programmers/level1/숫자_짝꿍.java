package programmers.level1;

import java.lang.reflect.Array;
import java.util.*;

public class 숫자_짝꿍 {
    public static void main(String[] args) {
        solution("5525", "1255");
    }


    public static String solution(String X, String Y) {
        String answer = "";

        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();

        for(String str : X.split("")) {
            xList.add(Integer.parseInt(str));
        }

        for(String str : Y.split("")) {
            yList.add(Integer.parseInt(str));
        }

        Collections.sort(xList);
        Collections.sort(yList);

        ArrayList<Integer> resultArray = new ArrayList<>();

        int yIndex = 0;
        for (Integer x : xList) {
            for (int i = yIndex; i < yList.size(); i++) {
                Integer i1 = yList.get(i);
                if(x == i1) {
                    resultArray.add(i1);
                    yIndex++;
                }
            }
        }

        int zeroCnt = 0;
        Collections.sort(resultArray, Collections.reverseOrder());
        for (Integer num : resultArray) {
            if(num == 0 ) zeroCnt++;
            answer += num;
        }

        if(zeroCnt == resultArray.size()) {
            if(resultArray.size() == 0) {
                answer = "-1";
            } else {
                answer = "0";
            }
        }
        return answer;
    }
}
