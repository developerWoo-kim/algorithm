package programmers.level1;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int solution = solution(13, 17);
        System.out.println(solution);
    }
    public static int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int count = 0;
            for(int k = 1; k <= i; k++) {
                if(i % k == 0) count++;
            }
            answer = count % 2 == 0 ? answer + i : answer - i;
        }

        return answer;
    }
}
