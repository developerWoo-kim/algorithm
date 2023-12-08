package programmers.level2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        boolean solution = solutionWithStack("((())))");
        System.out.println(solution);
    }

    /**
     * for문과 조건문을 활용한 풀이
     * @param s
     * @return
     */
    static boolean solutionWithFor(String s) {
        boolean answer = true;

        int checker = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                checker++;
            } else {
                checker--;
            };

            if(checker < 0) {
                return false;
            }
        }

        if(checker > 0) {
            answer = false;
        }

        return answer;
    }

    /**
     * Stack을 이용한 풀이
     * @param s
     * @return
     */
    static boolean solutionWithStack(String s) {
        boolean answer = true;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(1);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }

}
