package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Stack_9935 {
    static ArrayList<Character> sArr = new ArrayList<>();
    static int idx = 0;
    static char[] bArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        String s = str.nextToken();
        str = new StringTokenizer(br.readLine());
        String b = str.nextToken();

        for(int i = 0; i < s.length(); i++) {
            sArr.add(s.charAt(i));
        }
        idx = sArr.size();

        bArr = new char[b.length()];
        for(int k = 0; k < b.length(); k++) {
            bArr[k] = b.charAt(k);
        }

        for(int i = 0; i < idx; i++) {
            int count = 0;
            for(int k = 0; k < bArr.length; k++) {
                if((i + k) < sArr.size()) {
                    if(sArr.get(i+k) == bArr[k]) {
                        count++;
                    }
                }
            }
            if(count == bArr.length) {
                for(int j = 0; j < bArr.length; j++) {
                    sArr.remove(i);
                    idx--;
                }
                if(i >= 2) {
                    i = i - 2;
                }
            }
        }

        if(sArr.isEmpty()) {
            System.out.println("FRULA");
        } else {
            for(int i = 0; i < idx; i++) {
                System.out.print(sArr.get(i));
            }
        }
    }

}
