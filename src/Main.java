import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String[] todayArr = today.split("\\.");
        LocalDate todayLocal = LocalDate.of(Integer.parseInt(todayArr[0]), Integer.parseInt(todayArr[1]), Integer.parseInt(todayArr[2]));

        Map<String, Integer> termMap = new HashMap<>();
        for(String str : terms) {
            String[] st = str.split(" ");
            termMap.put(st[0], Integer.parseInt(st[1]));
        }


        int index = 0;
        int count = 0;
        int[] answer = new int[privacies.length];
        for(String privacie : privacies) {
            String[] split = privacie.split("\\.");
            long term = termMap.get(split[2].substring(3));
            split[2] = split[2].substring(0,2);

            LocalDate date = LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])).plusMonths(term);

            if(todayLocal.isAfter(date)) {
                answer[index] = -1;
                count++;
            };
            index++;
        }

        int[] result = new int[count];
        int indexCount = 0;
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == -1) {
                result[indexCount++] = i+1;
            }
        }
        System.out.println("test");
    }

}