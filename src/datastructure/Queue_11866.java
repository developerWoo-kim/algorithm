package datastructure;

import java.util.ArrayList;

public class Queue_11866 {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 : 3 size = 6
        // 1 2 4 5 6 7 : 6 size = 5
        // 1 4 5 7 : 2
        // 1 4 5 : 7
        // 1 4 : 5
        // 4 : 1
        // : 4
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;

        while(list.size() > 0) {
            if((list.size() - 1) + idx <= list.size()-1) {
                if(idx == 2) {

                }
            }
            idx++;
        }
    }
}
