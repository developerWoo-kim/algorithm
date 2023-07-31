package programmers.level1;

public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        long solution = solution(3, 20, 4);
        System.out.println(solution);
    }
    public static long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++) {
            answer += price * i;
        }
        return money >= answer ? 0 : answer - money;
    }
}
