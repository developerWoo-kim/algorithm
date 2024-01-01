package programmers.level2;

import java.util.Stack;

public class 뒤에_있는_큰_수_찾기 {
    public static void main(String[] args) {
        int[] solution = solution2(new int[]{9, 1, 5, 3, 6, 2});
    }

    /**
     * 스택 구조
     * @param numbers
     * @return
     */
    public static int[] solution2(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < numbers.length; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        answer[numbers.length-1] = -1;

        return answer;
    }
    public static int[] solution1(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            if(i < numbers.length-1) {
                answer[i] = -1;
                for(int k = i+1; k < numbers.length; k++) {
                    if(numbers[i] < numbers[k]) {
                        answer[i] = numbers[k];
                        break;
                    }
                }
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
