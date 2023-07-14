import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class sim_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        int count = 1;
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            String people1 = str.nextToken();
            String people2 = str.nextToken();

            if(people1.equals("ChongChong")) {
                if(!hashSet.contains(people2)) {
                    count++;
                    hashSet.add(people2);
                }
            } else {
                if(hashSet.contains(people2) && !hashSet.contains(people1))  {
                    count++;
                    hashSet.add(people1);
                }
            }
            if(people2.equals("ChongChong")) {
                if(!hashSet.contains(people1)) {
                    count++;
                    hashSet.add(people1);
                }
            } else {
                if(hashSet.contains(people1) && !hashSet.contains(people2))  {
                    count++;
                    hashSet.add(people2);
                }
            }
        }
        System.out.println(count);

    }
}
