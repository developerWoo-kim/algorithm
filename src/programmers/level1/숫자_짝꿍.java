package programmers.level1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class 숫자_짝꿍 {
    public static void main(String[] args) {
        solution("100", "203045");
    }


    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        StringBuilder xString = new StringBuilder(X);
        StringBuilder yString = new StringBuilder(Y);
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (char xCh : X.toCharArray()) {
            int index = yString.indexOf(Character.toString(xCh));
            if (index != -1) {
                queue.add(String.valueOf(xCh));
                yString.deleteCharAt(index);
            }
        }

        if(queue.size() > 0) {
            boolean zeroChecker = true;
            // 우선순위가 높은 순으로 출력
            while (!queue.isEmpty()) {
                String sk = queue.poll();
                if(!"0".equals(sk)) {
                    zeroChecker = false;
                }
                answer.append(sk);
            }
            if(zeroChecker) answer = new StringBuilder("0");
        } else {
            answer.append("-1");
        }
        return answer.toString();
    }
}
