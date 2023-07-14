import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class sim_25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());


        HashSet<String> hashSet = new HashSet<>();
        int count = 0;
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            String message = str.nextToken();

            if(message.equals("ENTER")) {
                hashSet.clear();
            } else {
                if(!hashSet.contains(message)) {
                    count++;
                    hashSet.add(message);
                }
            }
        }
        System.out.println(count);
    }
}
