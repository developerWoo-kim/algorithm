package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ArrayList_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());

        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            arrList.add(Integer.parseInt(str.nextToken()));
        }
        Collections.sort(arrList);

        StringBuilder sb = new StringBuilder();
        for(Integer i : arrList) {
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}
