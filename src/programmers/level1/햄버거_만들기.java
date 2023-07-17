package programmers.level1;

import java.util.Stack;

public class 햄버거_만들기 {
    public static void main(String[] args) {
        solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1});
    }
    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> list = new Stack<>();
        for(int i : ingredient) {
            list.push(i);

            if(list.size() > 3) {
                if(list.get(list.size()-4).equals(1) &&
                        list.get(list.size()-3).equals(2) &&
                        list.get(list.size()-2).equals(3) &&
                        list.get(list.size()-1).equals(1)) {
                    list.pop();
                    list.pop();
                    list.pop();
                    list.pop();
                    answer++;
                }
            }
        }

        return answer;
    }
}
