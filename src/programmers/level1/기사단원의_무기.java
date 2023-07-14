package programmers.level1;

public class 기사단원의_무기 {
    public static void main(String[] args) {
        int solution = solution(10, 3, 2);
        System.out.println(solution);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int count = measure_v2(i);
            if(count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }

    public static int measure_v1(int num) {
        int count = 0;
        for(int i=1; i <= num; i++) {
            if(num % i == 0) count++;
        }
        return count;
    }

    public static int measure_v2(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }
        return count;
    }
}
