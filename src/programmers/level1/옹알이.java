package programmers.level1;

public class 옹알이 {
    public static void main(String[] args) {
        solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        // aya : 0, ye : 1, woo : 2, ma : 3
        for (String s : babbling) {
            String result = s.replaceAll("aya", "0").replaceAll("ye", "1")
                    .replaceAll("woo", "2").replaceAll("ma", "3");

            if(result.matches(".*[a-z].*")) {
                continue;
            }

            String[] resultArr = result.split("");
            boolean matchResult =  true;
            for (int i = 0; i < resultArr.length-1; i++) {
                String cur = resultArr[i];
                String next = resultArr[i+1];
                if(cur.equals(next)) {
                    matchResult = false;
                }
            }

            if(!matchResult) continue;
            answer++;

            System.out.println(result);

        }

        return answer;
    }
}
