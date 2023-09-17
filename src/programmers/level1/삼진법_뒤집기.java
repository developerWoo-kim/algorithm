package programmers.level1;

public class 삼진법_뒤집기 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt(solution(125), 3));
    }

    public static String solution(int n) {
        String samjinStr = "";
        while(n >= 1) {
            samjinStr += String.valueOf(n % 3);
            n = n / 3;
        }

        return samjinStr;
    }
}
