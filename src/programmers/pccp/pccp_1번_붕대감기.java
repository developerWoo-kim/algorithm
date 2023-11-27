package programmers.pccp;

public class pccp_1번_붕대감기 {
    public static void main(String[] args) {
        int solution = solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}});
        System.out.println(solution);
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;

        int sec = 0;
        int recoveryCnt = 0;

        int currHealth = health;
        int castSec = bandage[0];
        int recoveryAmt = bandage[1];
        int recoveryAdd = bandage[2];

        int attacksIndex = 0;
        while (sec < attacks[attacks.length-1][0]) {
            sec++;
            if(sec == attacks[attacksIndex][0]) {
                recoveryCnt = 0;
                currHealth -= attacks[attacksIndex++][1];
                if(currHealth <= 0) {
                    answer = -1;
                    return answer;
                }

            } else {
                recoveryCnt++;
                if(currHealth+recoveryAmt <= health) {
                    currHealth += recoveryAmt;
                }

                if(castSec == recoveryCnt) {
                    if(currHealth+recoveryAdd <= health) {
                        currHealth += recoveryAdd;
                    }
                    recoveryCnt = 0;
                }
            }
        }

        answer = currHealth;

        return answer;
    }
}
