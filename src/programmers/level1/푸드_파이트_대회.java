package programmers.level1;

public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        String solution = solution(new int[]{1,7,1,2});
        System.out.println(solution);
    }

    public static String solution(int[] food) {
        String answer = "";

        for(int i = 1; i < food.length; i++) {
            int f = food[i];
            int count = f / 2;
            for(int j = 0; j < count; j++) {
                answer += i;
            }
        }
        StringBuilder reverse = new StringBuilder(answer).reverse();
        answer += "0";
        answer += reverse;
        return answer;
    }
}
