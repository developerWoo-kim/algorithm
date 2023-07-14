package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;

public class level1_1 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo =
                {{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
                };
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        int[] result = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            for(int k = 0; k < photo[i].length; k++) {
                if(map.get(photo[i][k]) != null) {
                    sum += map.get(photo[i][k]);
                }

            }
            result[i] = sum;
        }
        for (int i : result) {
            System.out.print(i + " : ");
        }
    }
}
