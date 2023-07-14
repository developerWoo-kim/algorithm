import java.time.LocalDate;
import java.util.*;

public class dummy {
    public static void main(String[] args) {
        int banana = solution("baaa");
        System.out.println(banana);
    }

    public static int solution(String s) {
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            if(i < s.length()-1) {
                char ch = s.charAt(i);

                int index = i+1;
                int count = 1;
                while (index < s.length() && ch == s.charAt(index)) {
                    if(index >= s.length()) break;
                    index++;
                    count++;
                }

                int checkCount = 0;
                while (count > checkCount) {
                    if(index >= s.length()) break;
                    if(ch != s.charAt(index++)) {
                        checkCount++;
                    } else {
                        count++;
                    }
                }
                i=index-1;
            }
            answer++;
        }
        return answer;
    }

}