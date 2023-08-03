package programmers.level1;

import java.util.List;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        int one4seveneight = solution("one4seveneight");
        System.out.println(one4seveneight);
    }
    public static int solution(String s) {
        int answer = 0;

        String str = s.replaceAll("zero", "0").replaceAll("one", "1")
                .replaceAll("two", "2").replaceAll("three", "3")
                .replaceAll("four", "4").replaceAll("five", "5")
                .replaceAll("six", "6").replaceAll("seven", "7")
                .replaceAll("eight", "8").replaceAll("nine", "9");
        answer = Integer.parseInt(str);
        return answer;
    }
}
