package programmers.level1;

import java.util.*;

public class 달리기_경주 {
    public static void main(String[] args) {
        solution2(new String[]{"mumu", "soe", "poe", "kai", "mine"},
                new String[]{"kai", "kai", "mine", "mine"});
    }

    public static String[] solution2(String[] players, String[] callings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            resultMap.put(players[i], i);
        }

        for(int i = 0; i < callings.length; i++) {
            Integer index = resultMap.get(callings[i]);

            String frontPlayer = players[index - 1];
            players[index - 1] = players[index];
            players[index] = frontPlayer;

            resultMap.put(frontPlayer, index);
            resultMap.put(callings[i], index-1);
        }

        return players;
    }
    public static String[] solution1(String[] players, String[] callings) {
        List<String> playerList = Arrays.asList(players);

        for(int i = 0; i < callings.length; i++) {
            for(int k = 0; k < playerList.size(); k++) {
                if(playerList.get(k).equals(callings[i])) {
                    String frontPlayer = playerList.get(k - 1);
                    playerList.set(k-1, callings[i]);
                    playerList.set(k, frontPlayer);
                    break;
                }
            }
        }


        String[] array = playerList.toArray(new String[playerList.size()]);


        return array;
    }
}
