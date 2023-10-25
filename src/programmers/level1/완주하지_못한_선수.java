package programmers.level1;

import java.util.*;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, ArrayList<Integer>> hashList = new HashMap<>();

        for(String p : participant) {
            if(hashList.containsKey(p)) {
                ArrayList<Integer> integers = hashList.get(p);
                integers.add(0);
                hashList.put(p, integers);
            } else {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(0);
                hashList.put(p, integers);
            }
        }

        for(String c : completion) {
            if(hashList.containsKey(c)) {
                ArrayList<Integer> integers = hashList.get(c);
                if(integers.size() > 1) {
                    integers.remove(integers.size()-1);
                } else {
                    hashList.remove(c);
                }
            }
        }

        for(Map.Entry<String, ArrayList<Integer>> map : hashList.entrySet()) {
            answer = map.getKey();
        }

        return answer;
    }
}
