package programmers.level1;

public class 콜라문제 {
    public static int count = 0;
    public static void main(String[] args) {
        solution(3, 1, 20);
        System.out.println(count);
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;
        int recursion = recursion(a, b, n);
        return answer;
    }
    public static int recursion(int a, int b, int n) {
        if(n < a) return n;
        count += ((n / a) * b);
        return recursion(a, b, ((n / a) * b) + (n % a));
    }
}
